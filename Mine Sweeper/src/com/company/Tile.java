package com.company;

public class Tile {
    // attributes

    private boolean isBomb;
    private int surroundingBombs;
    private boolean uncovered;
    private boolean flagged;
    private int xCoordinate;
    private int yCoordinate;

    // constructors

    public Tile(int x,int y){
        this.xCoordinate = x;
        this.yCoordinate = y;
        float randomFloat = (float) Math.random();
        float bombRatio = 0.4f;
        if(randomFloat <= bombRatio){
            isBomb = true;}
        else{
            isBomb = false;}
        uncovered = true;
    }

    // methods

    private int calculateSurroundingBombs(){
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(isBomb){
                    surroundingBombs ++ ;}
            }
        }
        return surroundingBombs;
    }

    public String toString(){
        if(!uncovered){
            return "[ ]";
        }
        else if(isBomb){
            return "[*]";
        }
        else{
            return "["+surroundingBombs+"]";
        }
    }
}
