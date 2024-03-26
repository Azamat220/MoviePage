package dota.pos5.movies.mapper;

import dota.pos5.movies.entities.User;
import dota.pos5.movies.payload.userdto.UserRequestDTO;
import dota.pos5.movies.payload.userdto.UserResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserRequestDTO userRequestDTO);

    UserResponseDTO toDTO(User user);
}
