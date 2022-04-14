package com.thoughtfocus.solidprinciples.srp;

public class Customers {
    Bank bank;

    public Customers(Bank bank) {
        this.bank = bank;
    }

    String printingTotalNoOfCustomers() {
        return ("Total number of Customers: " + bank.getSavingAccountHolders() + bank.getFixedDepositHolders());
    }
}
