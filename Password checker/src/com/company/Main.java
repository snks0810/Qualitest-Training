package com.company;

import java.util.Scanner;

public class Main {

    public static boolean letterCheck(String password) {
        boolean hasLet = false;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (password.toLowerCase().contains(String.valueOf(letter))) {
                hasLet = true;
                break;
            }
        }
        return hasLet;
    }

    public static boolean numberCheck(String password) {
        boolean hasNum = false;
        for (int i = 0; i < 10; i++) {
            if (password.contains(String.valueOf(i))) {
                hasNum = true;
                break;
            }
        }
        return hasNum;
    }

    public static int lengthCheck(String password) {
        int outPut;
        int length = password.length();
        if (length <= 5) {
            outPut = -1;
        } else if (length <= 10) {
            outPut = 0;
        } else if (length <= 15) {
            outPut = 1;
        } else {
            outPut = 2;
        }
        return outPut;
    }

    public static void strengthCalculator(int strengthResult) {
        switch (strengthResult) {
            case 0 -> {
                System.out.println("This password is very weak");
                System.out.println();}
            case 1 -> {
                System.out.println("This password is weak");
                System.out.println();}
            case 2 -> {
                System.out.println("This password is ok");
                System.out.println();}
            case 3 -> {
                System.out.println("This password is good");
                System.out.println();}
            case 4 -> {
                System.out.println("This password is strong");
                System.out.println();}
        }
    }

    public static void main(String[] args) {

        int strength = 0;
        do {
            strength = 0;
            // User Input
            System.out.println("Enter a password");
            Scanner passwordInput = new Scanner(System.in);
            String passwordEntered = passwordInput.nextLine();

            // Length Checker
            strength += lengthCheck(passwordEntered);

            //Number Checker
            if (numberCheck(passwordEntered)) {
                strength++;}

            //Letter Checker
            if (letterCheck((passwordEntered))) {
                strength++;}

            //Strength Calculator
            strengthCalculator(strength);
        } while (strength < 4);
        System.out.println("Password Accepted");
    }
}