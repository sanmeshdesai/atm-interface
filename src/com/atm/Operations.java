package com.atm;

import java.util.Scanner;

public class Operations {
    private static int deposite;
    private static int withdraw;
    private static int balance = 100000;
    Scanner sc = new Scanner(System.in);


    public Operations() {
        super();
    }

    public Operations(int deposite, int withdraw, int balance) {
        this.deposite = deposite;
        this.withdraw = withdraw;
        this.balance = balance;
    }

    public int getDeposite() {
        return deposite;
    }

    public void setDeposite(int deposite) {
        this.deposite = deposite;
    }

    public int getWithdraw(int i) {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public static void withdrawAmount (int withdraw) {
        if (withdraw <= balance && withdraw != 0 ) {
            balance = balance - withdraw;
            System.out.println();
            System.out.println("Amount withdraw successfully!!!");
            System.out.println();
            System.out.println("Remaining balance : " + balance);
            System.out.println();
        } else {
            System.out.println("Invalid amount");
        }

    }

    public static void depositeAmount(int deposite) {
        if (deposite != 0 ) {
            balance = balance + deposite;
            System.out.println();
            System.out.println("Amount deposit Successfully!!!");
            System.out.println();
            System.out.println("New balance : " +balance);
            System.out.println();
        } else {
            System.out.println("Enter valid amount");
        }


    }

    public static void showBalance() {
        System.out.println("Your account balance is :" + balance);
    }
}

