package com.su.auction.dao.impl;

import com.su.auction.dao.api.LotDao;
import com.su.domain.Lot;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LotDaoImpl implements LotDao {

    private List<Lot> lots = new ArrayList<>();

    public List<Lot> getAll() {
        return new ArrayList<>(lots);
    }

    public void add(Lot entity) {
        lots.add(entity);
    }

    public void remove(Lot entity) {
        lots.remove(entity);
    }
}
