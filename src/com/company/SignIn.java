package com.company;

import java.util.Scanner;

public class SignIn {

    int accountNumber = 1092748365;
    int accountPassword = 30172685;
    int acnNum;
    int acnPsw;

    public void enterNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your RSK Bank account number: ");
        System.out.println(" ");
        acnNum = input.nextInt();
        System.out.print("Please, enter your password: ");
        System.out.println(" ");
        acnPsw = input.nextInt();
        System.out.println("-------------------------------------------------------------------");
    }

    public void confirm() throws Exception {

        if (acnNum == accountNumber && acnPsw == accountPassword) {
            System.out.println("Your RSK Bank account logged in successfully!");
            YourAccount status = new YourAccount();
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Your available balance is " + status.checkBalance() + " KGS.");
            System.out.println("-------------------------------------------------------------------");
            AtmMenu menu = new AtmMenu();
            menu.getOptions();
        } else {
            FailedTransaction failedSignIn = new FailedTransaction("Incorrect login credentials! Please, try again later!");
            System.out.println(failedSignIn.getMessage());
            throw failedSignIn;
        }
    }
}