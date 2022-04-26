package com.thoughtfocus.solidprinciples.srp;

public class EmployeeDetails {
    Bank bank;

    public EmployeeDetails(Bank bank) {
        this.bank = bank;
    }

    String printingEmployeeDetails() {
        return ("Employee Name:" + bank.getEmployeeName() + "Employee Designation:" + bank.getEmployeeDesignation());

    }
}
