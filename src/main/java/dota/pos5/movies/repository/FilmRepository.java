package dota.pos5.movies.repository;


import dota.pos5.movies.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
    Optional<Film> findAllByUserId(Long id);
}
