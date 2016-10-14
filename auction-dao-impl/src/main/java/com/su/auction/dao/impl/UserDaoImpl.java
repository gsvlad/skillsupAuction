package com.su.auction.dao.impl;

import com.su.auction.dao.api.UserDao;
import com.su.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private List<User> users = new ArrayList<>();

    private void generateSomeUsers() {
        users.add(new User("buff", "Ben", "Black"));
        users.add(new User("tim", "Tim", "Tompson"));
        users.add(new User("jett", "Jeff", "Jefferson"));
    }

    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    public void add(User entity) {
        users.add(entity);
    }

    public void remove(User entity) {
        users.remove(entity);
    }
}
