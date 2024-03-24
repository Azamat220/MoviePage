package dota.pos5.movies.repositories.db.filmdb;

import dota.pos5.movies.entities.Genre;

import java.util.List;
import java.util.Set;

public interface FilmsGenresStorage {
    void create(Integer filmId, Integer genreId);

    List<Genre> readFilmGenres(Integer filmId);

    void delete(Integer filmId);

    List<Genre> setFilmGenres(Integer filmId, Set<Genre> genres);
}
