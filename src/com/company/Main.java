package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to RSK Bank!");
        System.out.println("___________________________________________________________");
        YourAccount status = new YourAccount();
        status.beginOperation();
    }
}