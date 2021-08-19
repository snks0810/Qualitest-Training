package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // Initialisation
        ArrayList<String> nameCatalogue = new ArrayList<>();
        ArrayList<Float> priceCatalogue = new ArrayList<>();
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Float> cartPrice = new ArrayList<>();

        nameCatalogue.add("apple");  priceCatalogue.add(0.10f);
        nameCatalogue.add("plumb");  priceCatalogue.add(0.15f);
        nameCatalogue.add("pear");   priceCatalogue.add(0.20f);
        nameCatalogue.add("banana"); priceCatalogue.add(0.30f);
        nameCatalogue.add("mango");  priceCatalogue.add(0.50f);

        // Catalogue
        System.out.println("Fruit catalogue");
        System.out.println();
        for (int i = 0; i < nameCatalogue.size(); i++) {
            System.out.println("Name: " + nameCatalogue.get(i));
            System.out.println("Price: £" + df.format(priceCatalogue.get(i)));
            System.out.println();
        }

        // User Interface
        boolean keepShopping = false;
        boolean validAnswer = false;
        boolean validFruit = false;
        float totalCost = 0.00f;
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
                cartPrice.add(priceCatalogue.get(nameCatalogue.indexOf(fruitSelected)));
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
                    validAnswer = false;
                }
            } while (!validAnswer);
        } while (keepShopping);

        // In Cart
        System.out.println();
        System.out.println("Your cart includes:");
        int currentFruitCounter = 0;
        String currentFruit = cart.get(0);
        String lastFruit = currentFruit;
        cart.add("not an elegant solution");
        for (int i = 0; i < cart.size(); i++) {
            currentFruit = cart.get(i);
            if(lastFruit == currentFruit){
                currentFruitCounter++;
                //System.out.println(currentFruit + " " + currentFruitCounter);
            }
            else{
                System.out.println(lastFruit + " x" + currentFruitCounter);
                currentFruitCounter = 1;
            }
            lastFruit = currentFruit;
        }
        System.out.println();
        System.out.println("Total cost:");
        for (int i = 0; i < cartPrice.size(); i++) {
            totalCost = totalCost + cartPrice.get(i);
        }
        System.out.println("£" + df.format(totalCost));
    }
}