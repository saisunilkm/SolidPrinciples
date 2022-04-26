package com.thoughtfocus.solidprinciples.srp;

public class Bank {
    public String employeeName;
    public String employeeDesignation;
    public int savingAccountHolders;
    public int fixedDepositHolders;

    public Bank(String employeeName, String employeeDesignation, int savingAccountHolders, int fixedDepositHolders) {
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.savingAccountHolders = savingAccountHolders;
        this.fixedDepositHolders = fixedDepositHolders;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public int getSavingAccountHolders() {
        return savingAccountHolders;
    }

    public void setSavingAccountHolders(int savingAccountHolders) {
        this.savingAccountHolders = savingAccountHolders;
    }

    public int getFixedDepositHolders() {
        return fixedDepositHolders;
    }

    public void setFixedDepositHolders(int fixedDepositHolders) {
        this.fixedDepositHolders = fixedDepositHolders;
    }
}
