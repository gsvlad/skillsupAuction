package com.su.auction.service.impl;

import com.su.auction.dao.api.LotDao;
import com.su.auction.dao.api.UserDao;
import com.su.auction.service.AuctionService;
import com.su.domain.Item;
import com.su.domain.Lot;
import com.su.domain.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Setter
public class AuctionServiceImpl implements AuctionService {

    @Autowired
    private LotDao lotDao;
    @Autowired
    private UserDao userDao;

    @Override
    public Lot createLot(Item item, User user, BigDecimal startPrice) {
        Lot lot = new Lot();
        lot.setItem(item);
        lot.setOwner(user);
        lot.setStartPrice(startPrice);
        lot.setDatePlaced(new Date());
        lotDao.add(lot);
        return lot;
    }

    @Override
    public List<Lot> getActiveLots() {
        return lotDao.getAll().stream()
                .filter(l -> l.getDateEnd() == null)
                .collect(Collectors.toList());
    }

    @Override
    public List<User> getUsers() {
        return userDao.getAll();
    }
}