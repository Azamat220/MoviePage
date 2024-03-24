package dota.pos5.movies.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dota.pos5.movies.services.MpaService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mpa")
public class MpaController {

    @Autowired
    private final MpaService mpaService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getMpa(@Valid @PathVariable Integer id) {
        return new ResponseEntity<>(mpaService.getMpa(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getMpas() {
        return new ResponseEntity<>(mpaService.getMpas(), HttpStatus.OK);
    }
}