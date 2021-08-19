package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameCatalogue = new ArrayList<>();
        ArrayList<Float> priceCatalogue = new ArrayList<>();
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Float> cartPrice = new ArrayList<>();

        nameCatalogue.add("apple");
        nameCatalogue.add("plumb");
        nameCatalogue.add("pear");
        nameCatalogue.add("banana");
        nameCatalogue.add("grapes");

        priceCatalogue.add(0.10f);
        priceCatalogue.add(0.15f);
        priceCatalogue.add(0.20f);
        priceCatalogue.add(0.30f);
        priceCatalogue.add(1.00f);

        System.out.println("Fruit catalogue");
        System.out.println();
        for (int i = 0; i < nameCatalogue.size(); i++) {
            System.out.println("Name: " + nameCatalogue.get(i));
            System.out.println("Price: £" + priceCatalogue.get(i));
            System.out.println();
        }

        // ask for entry of item name then adds it to a public array list (called cart)
        // asks if you would like to keep shopping or go to cart/checkout using a do while loop
        boolean keepShopping = false;
        boolean validAnswer = false;
        boolean validFruit = false;
        do {
            System.out.println("What would you like to purchase?");
            Scanner fruitInput = new Scanner(System.in);
            String fruitSelected = fruitInput.nextLine();

            System.out.println("How many " + fruitSelected + "s would you like to purchase?");
            Scanner quantityInput = new Scanner(System.in);
            String quantityEntered = quantityInput.nextLine();

            int fruitQuantity = Integer.parseInt(String.valueOf(quantityEntered));
            for (int i = 1; i <= fruitQuantity; i++) {
                cart.add(fruitSelected);
                cartPrice.add(fruitQuantity * priceCatalogue.get(nameCatalogue.indexOf(fruitSelected)));
            }

            do {
                System.out.println("Continue shopping (y) or go to cart (n)?");
                Scanner continueInput = new Scanner(System.in);
                String continueChosen = continueInput.nextLine();
                if (continueChosen.equals("y")) {
                    keepShopping = true;
                    validAnswer = true;
                } else if (continueChosen.equals("n")) {
                    keepShopping = false;
                    validAnswer = true;
                } else {
                    System.out.println("Please enter y/n");
                }
            } while (!validAnswer);
        } while (keepShopping);

        System.out.println();
        System.out.println("Your cart includes:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i));
        }
        System.out.println();
        System.out.println("Total cost:");
        float totalCost = 0f;
        for (int i = 0; i < cartPrice.size(); i++) {
            totalCost = cartPrice.get(i) + totalCost;
        }
        System.out.println("£" + totalCost);
    }
}