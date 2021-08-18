package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //String password = "password";
        String[] passwords = {"password","not password","no","pa55w0rd"};
        //boolean letters = false;
        //boolean numbers = false;
        for(String i: passwords) {
            int length = i.length();
            int trials = 2;
            do {
                if (length < 4) {
                    System.out.println("Too short! Your password must be more than 3 characters");// short check
                } else if (length > 10) {
                    System.out.println("Too long! Your password must be no longer than 10 characters");// long check
                } else if (i.contains("0") == false && i.contains("1") == false && i.contains("2") == false && i.contains("3") == false &&
                        i.contains("4") == false && i.contains("5") == false && i.contains("6") == false && i.contains("7") == false &&
                        i.contains("8") == false && i.contains("9") == false) {
                    System.out.println("Invalid! Password requires a number");
                } else {
                    System.out.println("Acceptable password");
                    break;
                }

                //for (int i = 0; i < length; i++) {
                //    if (password.charAt(i) instanceof char == true)// letter check
                //    {
                //        letters = true;
                //    } else if (password.charAt(i) instanceof int == true)// number check
                //    {
                //        numbers = true;
                //    }
                //}
                //if (letters == false || numbers == false) {
                //    System.out.println("Invalid, password must include both letters and numbers");
                System.out.println("You have " + trials + " attempts remaining");
                System.out.println("");
                if (trials == 0) {
                    System.out.println("You don't get to have a password");
                    System.out.println("");
                    System.out.println("");
                }
                trials--;
            } while (trials >= 0);
        }

            System.out.println("");
            System.out.println("");

            int counter = 1;
            while (counter < 7) {
                System.out.print(counter);
                counter++;
                System.out.println(" ");
            }

            System.out.println("");
            System.out.println("");

            int counterTwo = 1;
            do {
                System.out.println(counterTwo);
                counterTwo++;
            }
            while (counterTwo < 7);
        }
    }

