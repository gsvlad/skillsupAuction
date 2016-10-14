package com.su.auction.service;

import com.su.domain.Item;
import com.su.domain.Lot;
import com.su.domain.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * Provide main functionality of Auction
 */
public interface AuctionService {
    Lot createLot(Item item, User user, BigDecimal startPrice);
    List<Lot> getActiveLots();
    List<User> getUsers();
    List<Item> getItems();
    void soutUsers();
}