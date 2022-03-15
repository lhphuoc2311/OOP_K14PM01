/*
*  created date: Mar 15, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;

public class Wolf extends Canine {

    @Override
    protected void makeNoise() {
        System.out.println("Wolf sound ...");
    }

    @Override
    protected void eat() {
        System.out.println("Wolf eating ...");
    }
    
}
