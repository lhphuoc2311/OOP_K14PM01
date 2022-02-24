/*
*  created date: Feb 22, 2022
*  author: cgm
*/
package oo.tuan3.buoi5;

public class IntSquare {

    private double squareValue;//implementation


    //Encapsulation
    //Abstraction

    //interface
    public double getSquare(int value){
        //implementation - thuật toán
        this.calculateSquare(value);
        return this.squareValue;
    }

    //implementation
    private void calculateSquare(int value){
        this.squareValue = value * value;//Math
    }
    
}
