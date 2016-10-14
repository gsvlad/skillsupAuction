package com.su.auction.dao.impl;

import com.su.auction.dao.api.UserDao;
import com.su.domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    private List<User> users = new ArrayList<>();

    @PostConstruct
    private void generateSomeUsers() {
        users.add(new User(1L, "buff", "Ben", "Black", new ArrayList<>()));
        users.add(new User(2L, "tim", "Tim", "Tompson", new ArrayList<>()));
        users.add(new User(3L, "jett", "Jeff", "Jefferson", new ArrayList<>()));
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
