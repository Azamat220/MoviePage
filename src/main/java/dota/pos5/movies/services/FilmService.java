package dota.pos5.movies.services;

import dota.pos5.movies.payload.filmdto.FilmRequest;
import dota.pos5.movies.payload.filmdto.FilmResponse;

import java.util.List;

public interface FilmService {

    FilmResponse create(FilmRequest filmRequest);
    FilmResponse update(Long id, FilmRequest filmRequest);
    FilmResponse get(Long id);
    List<FilmResponse> getAll(Long id);
    void delete(Long id);
}
