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

    public void checkSurroundingBombs(Tile[][] matrix,int a,int b){
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(a+i < 0 || a+i > 10 || b+j < 0 || b+j > 10){
                    System.out.println("out of bounds at ("+(a+i)+","+(b+j)+")")
                }else{
                    if(matrix(a+i,b+j).isBomb){
                        this.surroundingBombs++;
                }}
            }
        }

    }

    public int getSurroundingBombs(){
        return surroundingBombs;}

    public void setSurroundingBombs( int surroundingBombCounter){
        this.surroundingBombs = surroundingBombCounter;}

    public boolean getIsBomb(){
        return isBomb;}

    public void setIsBomb( boolean bombState){
        this.isBomb = bombState;}

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