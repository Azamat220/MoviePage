package dota.pos5.movies.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dota.pos5.movies.entities.Film;
import dota.pos5.movies.repositories.db.filmdb.*;
import dota.pos5.movies.repositories.db.userdb.LikesStorage;
import dota.pos5.movies.repositories.db.userdb.UserStorage;

import java.util.Collection;

@Slf4j
@Service
public class FilmService {
    private final FilmsStorage filmsStorage;
    private final LikesStorage likesStorage;

    private final UserStorage userStorage;

    @Autowired
    public FilmService(FilmsStorage filmStorage, LikesStorage likesDao, UserStorage userStorage) {
        this.filmsStorage = filmStorage;
        this.likesStorage = likesDao;
        this.userStorage = userStorage;
    }

    public Film create(Film film) {
        Film newFilm = filmsStorage.createFilm(film);
        log.debug("Фильм с id = {} добавлен в бд", film.getId());
        return newFilm;
    }

    public Film update(Film film) {
        log.debug("Фильм с id = {} обновлён", film.getId());
        return filmsStorage.updateFilm(film);
    }

    public Collection<Film> getFilms() {
        log.debug("Получен запрос на получение всех фильмов");
        return filmsStorage.getFilms();
    }

    public Film getFilm(Integer filmId) {
        log.debug("Получен запрос на получение фильма");
        return filmsStorage.getFilm(filmId);
    }

    public Collection<Film> getMostPopularFilms(Integer count) {
        log.debug("Получен запрос на получение популярных фильмов");
        return filmsStorage.getTopFilms(count);
    }

    public void addLike(Integer filmId, Integer userId) {
        log.debug("Получен запрос на добавление лайка фильму");
        userStorage.getUser(userId);
        filmsStorage.getFilm(filmId);
        likesStorage.addLike(filmId, userId);
    }

    public void deleteLike(Integer filmId, Integer userId) {
        log.debug("Получен запрос на удаление лайка фильму");
        userStorage.getUser(userId);
        filmsStorage.getFilm(filmId);
        likesStorage.deleteLike(filmId,userId);
    }

}
