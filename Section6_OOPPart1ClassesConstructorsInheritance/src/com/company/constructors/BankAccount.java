package com.company.constructors;

public class BankAccount {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
// Create getters and setters for each field

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        System.out.println(this.customerName + "has a balance of : " + this.balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    public double depositFunds(double amount){
        this.balance += amount;
        System.out.println("Deposit for "+ this.customerName+ " : " + amount);
        return amount;
    }
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    public double withdraw(double withdrawlAmount){

        if(balance - withdrawlAmount < 0){
            System.out.println("Insufficient funds, cannot complete transaction");
            System.out.println(this.customerName+ "has a balance of : "+ balance);
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl complete.  New balance is = "+ balance);
        }
        return withdrawlAmount;
    }

    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.
}
