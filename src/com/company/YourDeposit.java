package com.company;

import java.util.Scanner;

public class YourDeposit {

    int screen = 0;

    public int deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the amount you wish to deposit: ");
        screen = input.nextInt();
        if (screen <= 0) {
            FailedTransaction wrongDepositError = new FailedTransaction("Invalid deposit amount!");
            System.out.println(wrongDepositError.getMessage());
            deposit();
        } else {
            return screen;
        }
        return screen;
    }
}