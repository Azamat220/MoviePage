package dota.pos5.movies.repositories.db.userdb;

import dota.pos5.movies.entities.User;

import java.util.List;
import java.util.Set;

public interface UserStorage {

    User create(User user);

    User update(User user);

    List<User> getUsers();

    User getUser(Integer userId);

    List<User> getCommonFriends(Integer userId, Integer friendId);

    Set<Integer> readUserFriends(Integer userId);
}
