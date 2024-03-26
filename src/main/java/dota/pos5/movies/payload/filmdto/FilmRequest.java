package dota.pos5.movies.payload.filmdto;

import dota.pos5.movies.entities.Genre;
import dota.pos5.movies.entities.User;
import dota.pos5.movies.validation.DateForFilms;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class FilmRequest {
    private String name;

    private String description;

    @DateForFilms
    private LocalDate releaseDate;

    private int duration;

    private List<Genre> genres;

    private User user;
}
