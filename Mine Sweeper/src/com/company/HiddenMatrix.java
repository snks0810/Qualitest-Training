package com.company;
import com.company.Tile;

public class HiddenMatrix {

    // attributes

    private Tile[][] matrix;
    private int columns = 10;
    private int rows = 10;

    // constructors

    public HiddenMatrix() {
        matrix = hiddenMatrixGeneration(columns, rows);
    }

    private Tile[][] hiddenMatrixGeneration(int columns, int rows) {
        Tile[][] hiddenMatrix = new Tile[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                hiddenMatrix[i][j] = new Tile(i, j);
            }
        }

        for (int column = 0; column < columns; column++) { // x axis
            for (int row = 0; row < rows; row++) {         // y axis
                for (int i = -1; i <= 1; i++) {            // surrounding
                    for (int j = -1; j <= 1; j++) {        // tiles
                        if(column + i >= 0 && column + i <= columns) {System.out.println("1");
                            if (row + j >= 0 && row + i <= rows) {System.out.println("2");
                                if(i != j) {System.out.println("3");
                                    if (matrix[column + i][row + j].getIsBomb()) {
                                        int tempAdd = matrix[column][row].getSurroundingBombs() + 1;
                                        System.out.println(tempAdd);
                                        matrix[column][row].setSurroundingBombs(tempAdd);
                                    } else {System.out.println("null");
                                    }
                                }else {System.out.println("3b");
                                }
                            } else {System.out.println("2b");
                            }
                        }else{System.out.println("1b");
                        }
                    }
                }
            }
        }return hiddenMatrix;
        }

        // methods

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    sb.append(matrix[i][j]);
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }