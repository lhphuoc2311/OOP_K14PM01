/*
*  created date: Feb 24, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class Animal {

    //attribute - thuoc tinh - state
    private String picture;
    private String food;
    private int hunger;//mức độ dói bụng 1 2 3


    //method - behaivor
    protected void makeNoise(){
        System.out.println("making noise ....");
    }

    protected void sleep(){
        System.out.println("Sleeping ...");
    }

    protected void eat(){
        System.out.println("Eating ...");
    }

    protected void roam(){
        System.out.println("Roaming ...");
    }
    
}
