package dota.pos5.movies.repositories.db.filmdb;

import dota.pos5.movies.entities.Genre;

import java.util.Collection;

public interface GenresStorage {
    Genre create(Genre genre);

    Collection<Genre> getGenres();

    Genre update(Genre genre);

    Genre getGenre(Integer id);
}
