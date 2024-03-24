package dota.pos5.movies.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dota.pos5.movies.exceptions.NotFoundException;
import dota.pos5.movies.entities.Mpa;
import dota.pos5.movies.repositories.dbimpl.film.MpaDbStorage;

import java.util.List;

@Slf4j
@Service
public class MpaService {
    private final MpaDbStorage mpaDbStorage;

    @Autowired
    MpaService(MpaDbStorage mpaDbStorage) {
        this.mpaDbStorage = mpaDbStorage;
    }

    public Mpa getMpa(Integer id) {
        log.info("Получен GET запрос по эндпоинту '/mpa/{id}' на получение ретинга по id");
        if (id == null) throw new NotFoundException("MPA с id=%d нет в списке", id);
        return mpaDbStorage.getMpa(id);
    }

    public List<Mpa> getMpas() {
        log.info("Получен GET запрос по эндпоинту '/mpa' на получение всех рейтингов");
        return mpaDbStorage.getMpas();
    }

}
