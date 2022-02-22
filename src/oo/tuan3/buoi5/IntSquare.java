/*
*  created date: Feb 22, 2022
*  author: cgm
*/
package oo.tuan3.buoi5;

public class IntSquare {

    private double squareValue;//implementation

    //interface
    public double getSquareMath(int value){
        //implementation - thuật toán
        this.squareValue = Math.pow(value, 2);//Math
        return this.squareValue;
    }
    
}
