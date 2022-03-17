/*
*  created date: Mar 15, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;

public class Cat extends Feline implements Pet {

    @Override
    public void makeNoise() {

        System.out.println("Cat sound ...");
        
    }

    @Override
    protected void eat() {

        System.out.println("Cat eating ....");
        
    }

    
    
	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
    
}
