package com.su.auction.dao.impl;

import com.su.auction.dao.api.LotDao;
import com.su.domain.Lot;

import java.util.ArrayList;
import java.util.List;

public class LotDaoImpl implements LotDao {

    private List<Lot> lots = new ArrayList<Lot>();

    public List<Lot> getAll() {
        return new ArrayList<Lot>(lots);
    }

    public void add(Lot entity) {
        lots.add(entity);
    }

    public void remove(Lot entity) {
        lots.remove(entity);
    }
}
