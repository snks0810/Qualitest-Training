package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> passwords = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a password");
            Scanner passwordInput = new Scanner(System.in);
            String passwordEntered = passwordInput.nextLine();
            passwords.add(passwordEntered);
        }
        System.out.println("");
        for(String i: passwords) {
            int length = i.length();
            int trials = 2;
            do {
                if (length < 4) {
                    System.out.println("Too short! Your password must be more than 3 characters");// short check
                } else if (length > 10) {
                    System.out.println("Too long! Your password must be no longer than 10 characters");// long check
                } else if (!i.contains("0")&& !i.contains("1")&& !i.contains("2") && !i.contains("3") && // poorly optimised
                        !i.contains("4") && !i.contains("5") && !i.contains("6") && !i.contains("7") &&
                        !i.contains("8") && !i.contains("9")) {
                    System.out.println("Invalid! Password requires a number"); // number check
                } else if (!i.contains("a") && !i.contains("b") && !i.contains("c") && !i.contains("d") && !i.contains("e") && !i.contains("f") && // poorly optimised
                           !i.contains("g") && !i.contains("h") && !i.contains("i") && !i.contains("j") && !i.contains("k") && !i.contains("l") &&
                           !i.contains("m") && !i.contains("n") && !i.contains("o") && !i.contains("p") && !i.contains("q") && !i.contains("r") &&
                           !i.contains("s") && !i.contains("t") && !i.contains("u") && !i.contains("v") && !i.contains("w") && !i.contains("x") &&
                           !i.contains("y") && !i.contains("z")){
                    System.out.println("Invalid! Password requires a letter"); // letter check
                } else {
                    System.out.println("Acceptable password");
                    break;
                }
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
        }
    }

