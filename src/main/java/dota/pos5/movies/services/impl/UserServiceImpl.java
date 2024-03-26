package dota.pos5.movies.services.impl;

import dota.pos5.movies.entities.User;
import dota.pos5.movies.exceptions.NotFoundException;
import dota.pos5.movies.mapper.UserMapper;
import dota.pos5.movies.payload.userdto.UserRequestDTO;
import dota.pos5.movies.payload.userdto.UserResponseDTO;
import dota.pos5.movies.repository.UserRepository;
import dota.pos5.movies.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponseDTO create(UserRequestDTO userRequestDTO) {
        if (userRepository.existsByLogin(userRequestDTO.getLogin())) {
            throw new NotFoundException("Username already exists");
        }

        if (userRepository.existsByEmail(userRequestDTO.getEmail())) {
            throw new NotFoundException("Email already exists");
        }
        User user = userRepository.save(userMapper.toEntity(userRequestDTO));
        return userMapper.toDTO(user);
    }

    @Override
    public UserResponseDTO update(Long id, UserRequestDTO userRequestDTO) {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found exception"));
        user.setLogin(userRequestDTO.getLogin());
        user.setEmail(userRequestDTO.getEmail());
        userRepository.save(user);
        return userMapper.toDTO(user);
    }

    @Override
    public UserResponseDTO get(Long id) {
        return userMapper.toDTO(userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found")));
    }

    @Override
    public List<UserResponseDTO> getAll() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }
}
