package dota.pos5.movies.services.impl;

import dota.pos5.movies.entities.Genre;
import dota.pos5.movies.exceptions.NotFoundException;
import dota.pos5.movies.repository.GenreRepository;
import dota.pos5.movies.services.GenreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public Genre get(Long id) {
        return genreRepository.findById(id).orElseThrow(() -> new NotFoundException("Genre does not exist"));
    }

    @Override
    public List<Genre> getAll() {
       return new ArrayList<>(genreRepository.findAll());
    }
}
