package com.atm;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------ATM Interface-------------------------");
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter ATM number");
        int atm = sc.nextInt();
        System.out.println("Enter pin number");
        int pin = sc.nextInt();
        Login.checkLogin(atm, pin);
    }
}

