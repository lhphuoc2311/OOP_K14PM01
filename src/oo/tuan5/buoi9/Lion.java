/*
*  created date: Feb 24, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;

public class Lion extends Animal {

    //state

    //method
    @Override
    protected void makeNoise() {
        //code moi danh cho lion
        System.out.println("Making Lion noise");
    }

    @Override
    protected void eat() {
        System.out.println("Lion eating meat ...");
    }
}
