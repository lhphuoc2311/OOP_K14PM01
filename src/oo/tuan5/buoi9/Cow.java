/*
*  created date: Mar 15, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;

public class Cow extends Animal {

	@Override
	protected void makeNoise() {
        System.out.println("Cow sound ...");
		
	}


    @Override
    protected void eat() {

        System.out.println("Cow eating ...");
        
    }

    
}
