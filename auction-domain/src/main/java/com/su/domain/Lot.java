package com.su.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Lot {
    private Item item;
    private User owner;
    private BigDecimal startPrice;
    private Date datePlaced;
    private Date dateEnd;
    private User buyer;
    private BigDecimal currentPrice;
}
