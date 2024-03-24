package dota.pos5.movies.repositories.db.filmdb;

import dota.pos5.movies.entities.Mpa;

import java.util.List;

public interface MpaStorage {

    Mpa create(Mpa mpa);

    Mpa update(Mpa mpa);

    Mpa getMpa(Integer id);

    List<Mpa> getMpas();

    Mpa getFilmMpa(Integer id);
}
