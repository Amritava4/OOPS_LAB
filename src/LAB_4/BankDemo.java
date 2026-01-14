package DAY_4;

import java.util.Scanner;

class Account {
    static int nextAccNo = 1000;
    int accNo;
    String name;
    String accType;
    double balance;
    int day, month, year;

    Account(String name, String accType, double balance, int d, int m, int y) {
        this.accNo = ++nextAccNo;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
        day = d;
        month = m;
        year = y;
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt);
    }

    void withdraw(double amt) {
        System.out.println("Withdrawal not allowed");
    }
}

class StandardAccount extends Account {

    StandardAccount(String name, double balance, int d, int m, int y) {
        super(name, "Standard", balance, d, m, y);
    }

    void withdraw(double amt) {
        if (amt <= 100000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else if (amt <= 500000) {
            double penalty = amt * 0.0005;
            balance -= (amt + penalty);
            System.out.println("Withdrawn Rs " + amt + " with penalty Rs " + penalty);
        } else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

class PremiumAccount extends Account {

    PremiumAccount(String name, double balance, int d, int m, int y) {
        super(name, "Premium", balance, d, m, y);
    }

    void withdraw(double amt) {
        if (amt <= 1000000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else {
            System.out.println("Daily limit exceeded");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Account a1 = new StandardAccount("Ravi", 800000, 1, 8, 2025);
        Account a2 = new PremiumAccount("Amit", 1500000, 2, 8, 2025);

        a1.withdraw(200000);   // Dynamic Method Dispatch
        a1.checkBalance();

        a2.withdraw(900000);
        a2.checkBalance();
    }
}
