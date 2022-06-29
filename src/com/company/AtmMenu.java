package com.company;

import java.util.Scanner;

public class AtmMenu {

    int yourOption;

    YourAccount status = new YourAccount();

    public void getOptions() {
        System.out.println("Please, select an option below: ");
        System.out.println("Press 1 to deposit amount.");
        System.out.println("Press 2 to withdraw amount.");
        System.out.println("Press 3 to view your balance.");
        System.out.println("Press any key you like to exit the system.");
        System.out.println("-------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        yourOption = input.nextInt();
        switch (yourOption) {
            case 1:
                YourDeposit depositedAmount = new YourDeposit();
                int depAmount = depositedAmount.deposit();
                status.depositAmount(depAmount);
                getOptions();
                break;
            case 2:
                System.out.print("Please, enter the amount you wish to withdraw: ");
                int wdrAmount = input.nextInt();
                status.getCash(wdrAmount);
                getOptions();
                break;
            case 3:
                System.out.println("Your available balance is " + status.checkBalance() + " KGS.");
                System.out.println(" ");
                getOptions();
                break;
            default:
                System.out.println("Your transaction is done.\n-------------------------------------------------------------------\nYour RSK Bank account logged out successfully.");
                System.out.println("-------------------------------------------------------------------");
                System.exit(0);
                break;
        }
    }
}
