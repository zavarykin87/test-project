package ru.zavarykin.spring.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zavarykin.spring.restapp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByName(String name);
}
