package dota.pos5.movies.controllers;

import dota.pos5.movies.payload.filmdto.FilmRequest;
import dota.pos5.movies.services.FilmService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping
    public ResponseEntity<?> createFilm(@RequestBody @Valid FilmRequest filmRequest) {
        return new ResponseEntity<>(filmService.create(filmRequest), HttpStatus.CREATED);
    }

    @PutMapping("{filmId}")
    public  ResponseEntity<?> updateFilm(@PathVariable Long filmId,  @Valid @RequestBody FilmRequest filmRequest) {
        return new ResponseEntity<>(filmService.update(filmId, filmRequest), HttpStatus.OK);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getFilms(@PathVariable Long userId) {
        return new ResponseEntity<>(filmService.getAll(userId), HttpStatus.OK);
    }

    @GetMapping("/{filmId}")
    public ResponseEntity<?> getFilm(@PathVariable Long filmId) {
        return new ResponseEntity<>(filmService.get(filmId), HttpStatus.OK);
    }

    @DeleteMapping("/{filmId}")
    public ResponseEntity<?> delete(@PathVariable Long filmId) {
        filmService.delete(filmId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ExceptionHandler()
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleNotFoundException(final IllegalStateException e) {
        return Map.of("Error", e.getMessage());
    }
}