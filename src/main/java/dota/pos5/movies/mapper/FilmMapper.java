package dota.pos5.movies.mapper;

import dota.pos5.movies.entities.Film;
import dota.pos5.movies.entities.Genre;
import dota.pos5.movies.payload.filmdto.FilmRequest;
import dota.pos5.movies.payload.filmdto.FilmResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {Genre.class})
public interface FilmMapper {

    FilmResponse toDTO(Film film);
    Film toEntity(FilmRequest filmRequest);
}
