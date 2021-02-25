package com.nuig.banksystem.server;

//we will include a url to those two (classe + interface) when writing and running start-client
import com.nuig.banksystem.server.Statement;
import com.nuig.banksystem.server.Transaction;
import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class BankStatement implements Statement, Serializable{
    public int getAccountnum();  // returns account number associated with this statement
    public Date getStartDate(); // returns start Date of Statement
    public Date getEndDate(); // returns end Date of Statement
    public String getAccoutName(); // returns name of account holder
    public List<Transaction> getTransactions(); // return list of transactions included in this statement  
}
