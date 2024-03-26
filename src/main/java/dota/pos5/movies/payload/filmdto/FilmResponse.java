package dota.pos5.movies.payload.filmdto;

import dota.pos5.movies.entities.Genre;
import dota.pos5.movies.validation.DateForFilms;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class FilmResponse {

    private Long id;

    private String name;

    private String description;

    private LocalDate releaseDate;

    private int duration;

    private List<Genre> genres;
}
