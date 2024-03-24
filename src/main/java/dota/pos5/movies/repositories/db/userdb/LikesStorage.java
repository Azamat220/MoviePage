package dota.pos5.movies.repositories.db.userdb;

import java.util.List;

public interface LikesStorage {
    void addLike(Integer userId, Integer filmId);

    List<Integer> readUsersLikes(Integer filmId);

    void deleteLike(Integer userId, Integer filmId);

}
