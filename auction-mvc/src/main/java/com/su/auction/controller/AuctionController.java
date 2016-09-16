package com.su.auction.controller;

import com.su.auction.service.AuctionService;
import com.su.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return auctionService.getUsers();
    }
}