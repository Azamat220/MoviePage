package dota.pos5.movies.entities;

import dota.pos5.movies.validation.DateForFilms;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "films")
@Data
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private LocalDate releaseDate;

    private int duration;

    @ManyToOne
    private User user;

    @ManyToMany
    @JoinTable(
            name = "film_genre",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genres;
}