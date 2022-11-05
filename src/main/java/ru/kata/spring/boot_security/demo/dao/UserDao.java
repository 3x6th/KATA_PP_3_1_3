package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    void delete(Long id);
    User getUser(Long id);
    List<User> getUsers();
    User findByUsername (String username);
}
