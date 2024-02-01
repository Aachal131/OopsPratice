package com.praticeProblem;

public class BankAccount {
    double balance;
    String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // initial balance
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Please deposit a positive amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("insufficient balance.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789");
        account1.deposit(5000.0);
        account1.withdraw(500.0);
        System.out.println("Current Balance: $" + account1.getBalance());
        System.out.println("Account Number: " + account1.getAccountNumber());
    }
}
