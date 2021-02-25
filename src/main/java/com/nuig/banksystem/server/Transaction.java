package com.nuig.banksystem.server;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 227L;
    // Needs some accessor methods to return information about the transaction
    public Money getAmount(){return Money.zero(CurrencyUnit.EUR);}
    public Date getDate(){return Date.from(Instant.MIN);}
    public String description;
}