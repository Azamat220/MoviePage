package dota.pos5.movies.controllers;

import dota.pos5.movies.services.GenreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/genres")
public class GenreController {

    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getGenre(@PathVariable Long id) {
        return new ResponseEntity<>(genreService.get(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getGenres() {
        return new ResponseEntity<>(genreService.getAll(), HttpStatus.OK);
    }

}
