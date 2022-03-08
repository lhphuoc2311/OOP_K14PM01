/*
*  created date: Mar 08, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class Tiger extends Feline {

    public Tiger(){
        
    }

    @Override
    protected void makeNoise() {

        System.out.println("Tiger sound ...");
    }

    @Override
    protected void eat() {
        System.out.println("EAting ... meat, cat, dog");
    }
    
}
