package dota.pos5.movies.services;

import dota.pos5.movies.entities.Genre;

import java.util.List;

public interface GenreService {

    Genre get(Long id);

    List<Genre> getAll();
}
