package com.su.auction.dao.impl;

import com.su.auction.dao.api.ItemDao;
import com.su.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {

    private List<Item> items = new ArrayList<>();

    public List<Item> getAll() {
        return new ArrayList<>(items);
    }

    public void add(Item entity) {
        items.add(entity);
    }

    public void remove(Item entity) {
        items.remove(entity);
    }
}
