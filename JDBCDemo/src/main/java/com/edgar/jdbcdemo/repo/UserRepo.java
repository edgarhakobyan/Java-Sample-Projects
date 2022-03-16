package com.edgar.jdbcdemo.repo;

import com.edgar.jdbcdemo.model.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface UserRepo {
    void insert(User user) throws SQLException;
    List<User> findUsersByName(String name) throws SQLException;
    int getUsersCount() throws SQLException;
    Optional<User> findById(int id) throws SQLException;
}
