package dota.pos5.movies.repositories.db.filmdb;

import dota.pos5.movies.entities.Film;

import java.util.List;

public interface FilmsStorage {
    List<Film> getFilms();

    Film createFilm(Film film);

    Film updateFilm(Film film);

    Film getFilm(Integer id);

    List<Film> getTopFilms(Integer count);
}
