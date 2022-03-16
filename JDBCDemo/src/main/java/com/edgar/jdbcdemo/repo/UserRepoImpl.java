package com.edgar.jdbcdemo.repo;

import com.edgar.jdbcdemo.model.Book;
import com.edgar.jdbcdemo.model.User;
import com.edgar.jdbcdemo.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserRepoImpl implements UserRepo {
    @Override
    public void insert(User user) throws SQLException {
        String query = "insert into users (name, surname) values (?, ?);";
        try (Connection connection = ConnectionFactory.getInstance().openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            System.out.println(preparedStatement);
            preparedStatement.execute();
        }
    }

    @Override
    public List<User> findUsersByName(String name) throws SQLException {
        String query = "select * from users where name = (?)";
        try (Connection connection = ConnectionFactory.getInstance().openConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, name);
            List<User> users = new ArrayList<>();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                users.add(new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("surname")));
            }
            return users;
        }
    }

    @Override
    public int getUsersCount() throws SQLException {
        int count = 0;
        String query = "select count(*) from users";
        try (Connection connection = ConnectionFactory.getInstance().openConnection();
                Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        }
        return count;
    }

    @Override
    public Optional<User> findById(int id) throws SQLException {
        String query = String.format("select users.*, books.id as books_id, books.title as title from users\n" +
                "left join users_books on users.id = users_books.fk_user_id\n" +
                "left join books on books.id = users_books.fk_book_id\n" +
                "where users.id = %s;", id);
        User user = null;
        try (Connection connection = ConnectionFactory.getInstance().openConnection();
                Statement statement = connection.createStatement()) {
             ResultSet resultSet = statement.executeQuery(query);
             while (resultSet.next()) {
                 if (user == null) {
                     user = new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("surname"));
                     user.setBooks(new LinkedList<>());
                 }
                 Book book = new Book(resultSet.getInt("books_id"), resultSet.getString("title"));
                 user.getBooks().add(book);
             }
        }
        return Optional.ofNullable(user);
    }
}
