/*
*  created date: Feb 24, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;


//implementation
public class Dog extends Animal implements Pet, IntName {


    //cai de hanh vi
    @Override
    protected void makeNoise() {
        System.out.println("Making gau gau ...");
    }

    @Override
    protected void eat() {
        System.out.println("Eating pone ...");
    }

    //bo sung them hanh vi 
    public void protectHouse(){
        System.out.println("Protecting ...");
    }


    public void chaseCat(){
        System.out.println("Chasing cat ...");
    }

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }
    


    
    
    
    
    
    
    
    

}
