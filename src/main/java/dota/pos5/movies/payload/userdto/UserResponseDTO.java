package dota.pos5.movies.payload.userdto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserResponseDTO {

    private Long id;

    private String name;

    private String email;

    private String login;

    private LocalDate birthday;
}
