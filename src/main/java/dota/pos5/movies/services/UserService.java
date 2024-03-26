package dota.pos5.movies.services;

import dota.pos5.movies.payload.userdto.UserRequestDTO;
import dota.pos5.movies.payload.userdto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO create(UserRequestDTO userRequestDTO);
    UserResponseDTO update(Long id, UserRequestDTO userRequestDTO);
    UserResponseDTO get(Long id);
    List<UserResponseDTO> getAll();
}
