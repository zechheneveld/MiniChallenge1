package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your cod
        String Password = "Scott";

        System.out.println("Please enter your password");

        Scanner password = new Scanner(System.in);

        String inputPassword = password.nextLine();

// Creating a password that requires a true entree or it is wrong.

        if (inputPassword.equals(Password)) {
            System.out.println("Gained Access");
        } else {
            System.out.println("Incorrect");
        }
    }
}



