package com.company;

import java.util.Scanner;

public class Main {
        public static void main (String[] args){

        //    System.out.println("Length of game matrix?");
        //    Scanner lengthInput = new Scanner(System.in);
        //    String lengthEntered = lengthInput.nextLine();
        //    int length = Integer.parseInt(String.valueOf(lengthEntered));
        //    System.out.println("Height of game matrix?");
        //    Scanner heightInput = new Scanner(System.in);
        //    String heightEntered = heightInput.nextLine();
        //    int height = Integer.parseInt(String.valueOf(heightEntered));
        //    hiddenMatrixGeneration(length, height);

            HiddenMatrix matrix = new HiddenMatrix();
            System.out.println(matrix);
        }
    }

    // improvements:
    // move surrounding tile checker to tile class to make errors easier to locate
    // create user interaction element (type in the coordinate)
    // potentially a point and click UI
    // timer
    // flag feature + flag counter
