package dota.pos5.movies.repository;

import dota.pos5.movies.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByLogin(String login);
    Boolean existsByEmail(String email);
}
