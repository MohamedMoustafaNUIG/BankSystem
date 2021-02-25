package com.nuig.banksystem.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;
import org.joda.money.Money;

public class Bank implements BankInterface {
    private List<Account> accounts; // users accounts
    public Bank() throws RemoteException{}

    public void deposit(int account, Money amount) throws RemoteException, InvalidSession {
        // implementation code
    }
    public void withdraw(int account, Money amount) throws RemoteException, InvalidSession {
        // implementation code
    }
    public Money getBalance(int account) throws RemoteException, InvalidSession {
        // implementation code
    }
    public Statement getStatement(Date from, Date to) throws RemoteException, InvalidSession {
        return new BankStatement();
    }
    public static void main(String args[]) throws Exception {
        // initialise Bank server - see sample code in the notes and online RMI tutorials for details
    }
}