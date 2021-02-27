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
    
    public long login(String username, String password) throws RemoteException, InvalidLogin{return 1;}
    public void deposit(int accountnum, Money amount, long sessionID) throws RemoteException, InvalidSession{}
    public void withdraw(int accountnum, Money amount, long sessionID) throws RemoteException, InvalidSession{}
    public Money getBalance(int accountnum, long sessionID) throws RemoteException, InvalidSession{
        Money m = Money.parse("USD 12.00");
        return m;
    }
    public Statement getStatement(Date from, Date to, long sessionID) throws RemoteException, InvalidSession {
        return new BankStatement();
    }
    public static void main(String args[]) throws Exception {
        try
            {
              // First reset our Security manager
              if (System.getSecurityManager() == null) {
                    System.setSecurityManager(new SecurityManager());
                    System.out.println("Security manager set");
                }

              // Create an instance of the local object
              BankInterface b = new Bank();
              System.out.println("Instance of Bank Server created");
              BankInterface stub = (BankInterface) UnicastRemoteObject.exportObject(b, 0);
              System.out.println("stub created");

              // Put the server object into the Registry
              Registry registry = LocateRegistry.getRegistry();
              System.out.println("registry reference gotten");

              System.out.println(registry.list());

              registry.rebind("Bank", stub);
              System.out.println("Name rebind completed");

              System.out.println("Server ready for requests!");
            }
        catch(Exception exc)
            {
              System.out.println("Error in main - " + exc.toString());
            }
        }
}