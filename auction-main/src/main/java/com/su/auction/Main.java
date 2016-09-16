package com.su.auction;

import com.su.auction.service.AuctionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("service-beans.xml");
        AuctionService service = context.getBean(AuctionService.class);

        System.out.println(service.getUsers().size());
    }
}