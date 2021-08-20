package com.company;
import com.company.Tile;

public class HiddenMatrix {
    private Tile[][] matrix;
    private int columns = 10;
    private int rows = 10;


    public HiddenMatrix() {
        matrix = hiddenMatrixGeneration(columns, rows);
    }

    private Tile[][] hiddenMatrixGeneration(int columns, int rows) {
        Tile[][] hiddenMatrix = new Tile[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                float randomFloat = (float) Math.random();
                int zeroOneRandom = Math.round(randomFloat);
                hiddenMatrix[i][j] = new Tile(i, j);
            }
        }
        return hiddenMatrix;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                sb.append(matrix[i][j]);

            }
        sb.append("\n");
        }
    return sb.toString();}
}
