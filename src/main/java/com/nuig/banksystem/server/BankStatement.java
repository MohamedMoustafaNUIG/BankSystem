package com.nuig.banksystem.server;

//we will include a url to those two (classe + interface) when writing and running start-client
import com.nuig.banksystem.server.Statement;
import com.nuig.banksystem.server.Transaction;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class BankStatement implements Statement, Serializable{
    public int getAccountnum(){return 1;}  // returns account number associated with this statement
    public Date getStartDate(){return new Date();} // returns start Date of Statement
    public Date getEndDate(){return new Date();} // returns end Date of Statement
    public String getAccoutName(){return "account 1";} // returns name of account holder
    public List<Transaction> getTransactions(){return new ArrayList<Transaction>();} // return list of transactions included in this statement  
}
