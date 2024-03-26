package dota.pos5.movies.services.impl;

import dota.pos5.movies.entities.Film;
import dota.pos5.movies.exceptions.NotFoundException;
import dota.pos5.movies.mapper.FilmMapper;
import dota.pos5.movies.payload.filmdto.FilmRequest;
import dota.pos5.movies.payload.filmdto.FilmResponse;
import dota.pos5.movies.repository.FilmRepository;
import dota.pos5.movies.services.FilmService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    private final FilmMapper filmMapper;

    public FilmServiceImpl(FilmRepository filmRepository, FilmMapper filmMapper) {
        this.filmRepository = filmRepository;
        this.filmMapper = filmMapper;
    }


    @Override
    public FilmResponse create(FilmRequest filmRequest) {
        Film film = filmMapper.toEntity(filmRequest);
        return filmMapper.toDTO(filmRepository.save(film));
    }

    @Override
    public FilmResponse update(Long id, FilmRequest filmRequest) {
        Film film = filmRepository.findById(id).orElseThrow(() -> new NotFoundException("Film not found"));

        film.setName(filmRequest.getName());
        film.setDescription(film.getDescription());
        film.setDuration(filmRequest.getDuration());
        film.setReleaseDate(filmRequest.getReleaseDate());
        film.setGenres(filmRequest.getGenres());

        return filmMapper.toDTO(filmRepository.save(film));
    }

    @Override
    public FilmResponse get(Long id) {
        return filmMapper.toDTO(filmRepository.findById(id).orElseThrow(() -> new NotFoundException("Film not found")));
    }

    @Override
    public List<FilmResponse> getAll(Long id) {
        return filmRepository.findAllByUserId(id).stream().map(filmMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        filmRepository.deleteById(id);
    }
}
