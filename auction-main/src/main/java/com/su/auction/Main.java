package com.su.auction;

import com.su.auction.dao.api.ItemDao;
import com.su.auction.dao.api.UserDao;
import com.su.auction.repository.LotRepository;
import com.su.auction.repository.UserRepository;
import com.su.auction.service.AuctionService;
import com.su.domain.Item;
import com.su.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("main.xml");
        AuctionService service = context.getBean(AuctionService.class);
        ItemDao itemDao = context.getBean(ItemDao.class);
        UserDao userDao = context.getBean(UserDao.class);
        UserRepository userRepository = context.getBean(UserRepository.class);
        LotRepository lotRepository = context.getBean(LotRepository.class);


        User user = new User();
        userDao.add(user);

        Item item = new Item();
        itemDao.add(item);

        service.createLot(item, user, BigDecimal.TEN);

        System.out.println("Items: " + service.getItems().size());
        service.soutUsers();
        System.out.println("Lots: " + lotRepository.count());
    }
}