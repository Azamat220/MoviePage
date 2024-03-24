package dota.pos5.movies.repositories.db.userdb;


public interface FriendshipStorage {

    void addFriend(Integer userId, Integer friendId);

    void removeFriend(Integer userId, Integer friendId);
}
