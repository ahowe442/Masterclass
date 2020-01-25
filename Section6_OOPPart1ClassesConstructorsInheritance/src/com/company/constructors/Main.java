package com.company.constructors;

public class Main {
    public static void main(String[] args){
        BankAccount AbbyHowe = new BankAccount(12345679, 100, "Abby Howe", "howe.abigail@ggmail.com", 913-777-9292);
        BankAccount KellieHowe = new BankAccount(12345679, 1000, "Kellie Howe", "kellfagg@gmail.com", 316-377-7919);

        KellieHowe.getBalance();
        AbbyHowe.depositFunds(150);
        AbbyHowe.getBalance();
        AbbyHowe.withdraw(201);
        AbbyHowe.depositFunds(2000);
        AbbyHowe.getBalance();

    }
}
