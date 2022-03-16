package com.edgar.jdbcdemo;

import com.edgar.jdbcdemo.model.User;
import com.edgar.jdbcdemo.repo.UserRepo;
import com.edgar.jdbcdemo.repo.UserRepoImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws SQLException {
//        User user = new User(1, "test','t');delete from users;", "test surname");
        UserRepo userRepo = new UserRepoImpl();
//        for (int i = 0; i < 100; ++i) {
//            User user = new User(i, "name" + i, "surname" + i);
//            userRepo.insert(user);
//        }

        List<User> users = userRepo.findUsersByName("nam");
        System.out.println("users with name40: " + users);

        Optional<User> user = userRepo.findById(11);
        System.out.println("user 11 " + user);

        System.out.println("Users count " + userRepo.getUsersCount());
    }
}
