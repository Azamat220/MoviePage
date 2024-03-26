package dota.pos5.movies.payload.userdto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRequestDTO {

    @NotBlank(message = "Имя пользователя не может быть пустым")
    private String name;

    @NotBlank(message = "Электронная почта не может быть пустой")
    private String email;

    @NotBlank(message = "Логин не может быть пустым")
    private String login;

    @NotBlank(message = "Дата рождения не может быть пустой")
    private LocalDate birthday;
}
