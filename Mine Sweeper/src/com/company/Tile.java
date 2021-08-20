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
    }
    // methods

    private int calculateSurroundingBombs(){
        if(Tile(xCoordinate-1,yCoordinate-1)){
            surroundingBombs ++ ;
        }
        // check xCoordinate -1 ->
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
