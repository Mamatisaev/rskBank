package com.company;

public class YourAccount {

    int currentAmount = 20000;

    public void beginOperation() {
        SignIn signIn = new SignIn();
        try {
            signIn.enterNumbers();
            signIn.confirm();
        } catch (Exception getCash) {
            try {
                signIn.enterNumbers();
                signIn.confirm();
            } catch (Exception useCash) {
                try {
                    signIn.enterNumbers();
                    signIn.confirm();
                } catch (Exception payCash) {
                }
            }
        }
    }

    public int checkBalance() {
        return currentAmount;
    }

    public void depositAmount(int screen) {
        currentAmount = currentAmount + screen;
        System.out.println("Amount deposited successfully!");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Your available balance is " + currentAmount + " KGS.");
        System.out.println("-------------------------------------------------------------------");
    }

    public void getCash(int screen) {
        System.out.println("-------------------------------------------------------------------");
        if (currentAmount < screen) {
            FailedTransaction invalidTransactionAmount = new FailedTransaction("Invalid withdrawal amount!");
            System.out.println(invalidTransactionAmount.getMessage());
        } else {
            currentAmount = (currentAmount - screen);
            System.out.println("Please, get your " + screen + " KGS.");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Your available balance is " + currentAmount + " KGS.");
            System.out.println("-------------------------------------------------------------------");
        }
    }
}