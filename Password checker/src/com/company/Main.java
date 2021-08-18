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
        System.out.println("------------------------------------------------------------");
        for(String i: passwords) {
            int length = i.length();
                if (length < 4) {
                    System.out.println("Too short! Your password must be more than 3 characters");// short check
                } else if (length > 10) {
                    System.out.println("Too long! Your password must be no longer than 10 characters");// long check
                } else if (!i.contains("0")&& !i.contains("1")&& !i.contains("2") && !i.contains("3") && // poorly optimised
                        !i.contains("4") && !i.contains("5") && !i.contains("6") && !i.contains("7") &&
                        !i.contains("8") && !i.contains("9")) {
                    System.out.println("Invalid! Password requires a number"); // number check
                } else if (!i.toLowerCase().contains("a") && !i.toLowerCase().contains("b") && !i.toLowerCase().contains("c") && // poorly optimised
                           !i.toLowerCase().contains("d") && !i.toLowerCase().contains("e") && !i.toLowerCase().contains("f") &&
                           !i.toLowerCase().contains("g") && !i.toLowerCase().contains("h") && !i.toLowerCase().contains("i") &&
                           !i.toLowerCase().contains("j") && !i.toLowerCase().contains("k") && !i.toLowerCase().contains("l") &&
                           !i.toLowerCase().contains("m") && !i.toLowerCase().contains("n") && !i.toLowerCase().contains("o") &&
                           !i.toLowerCase().contains("p") && !i.toLowerCase().contains("q") && !i.toLowerCase().contains("r") &&
                           !i.toLowerCase().contains("s") && !i.toLowerCase().contains("t") && !i.toLowerCase().contains("u") &&
                           !i.toLowerCase().contains("v") && !i.toLowerCase().contains("w") && !i.toLowerCase().contains("x") &&
                           !i.toLowerCase().contains("y") && !i.toLowerCase().contains("z")){
                    System.out.println("Invalid! Password requires a letter"); // letter check
                } else {
                    System.out.println("Acceptable password");
                    break;
                }

        }
        }
    }

