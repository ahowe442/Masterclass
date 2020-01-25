package com.company;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Abby", "Howe", 1000, BankAccount.CHECKING);
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, .001);

    }

    @org.junit.Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Abby", "Howe", 1000, BankAccount.CHECKING);
        double balance = account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);
    }
    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Abby", "Howe", 1000, BankAccount.CHECKING);
        double balance = account.withdraw(200, true);
        assertEquals(800, account.getBalance(), 0);
    }
    @org.junit.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("Abby", "Howe", 1000, BankAccount.CHECKING);
        assertTrue("This account is not a checking account", account.isChecking());

    }
}