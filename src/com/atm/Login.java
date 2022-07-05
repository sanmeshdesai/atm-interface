package com.atm;


import java.util.HashMap;
import java.util.Scanner;

public class Login {
    private static int atm;
    private static int pin;

    public Login() {
    }

    public static int getAtm() {
        return atm;
    }

    public static void setAtm(int atm) {
        Login.atm = atm;
    }

    public static int getPin() {
        return pin;
    }

    public static void setPin(int pin) {
        Login.pin = pin;
    }

    public static void checkLogin (int atm, int pin) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(123456789, 1234);
        map.put(987456321, 3559);

        if(map.containsKey(atm) && map.containsValue(pin)) {
            while (true) {
            	
                System.out.println("--------------------Welcome to ATM Machine--------------------");
                System.out.println("--------------------------------------------------------------");
                System.out.println();
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("--------------------------------------------------------------");
                System.out.println("Choose your option");

                int n = sc.nextInt();
                switch (n)
                {
                    case 1:
                        System.out.println("Enter amount to withdraw");
                        int withdraw = sc.nextInt();
                        Operations.withdrawAmount(withdraw);
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Enter amount to deposit");
                        int deposit = sc.nextInt();
                        Operations.depositeAmount(deposit);
                        System.out.println();
                        break;

                    case 3:
                        Operations.showBalance();
                        System.out.println();
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM service");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong choice");
                        System.out.println("Thank you for using ATM service");
                        System.exit(0);
                }
            }


        }else {
            System.out.println("ATM number or pin is wrong");
        }

    }

}
