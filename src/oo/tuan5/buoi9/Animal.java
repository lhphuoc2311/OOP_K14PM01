/*
*  created date: Feb 24, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;

public abstract class Animal {

    //attribute - thuoc tinh - state
    private String picture;
    private String food;
    private int hunger;//mức độ dói bụng 1 2 3
    private String ten;

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    private String name;

    // protected abstract void beFriendly();

    // protected abstract void play();



    //method - behaivor- interface - encapsulation
    protected abstract void makeNoise();//hop dong nay//abstract method

    protected void sleep(){
        System.out.println("Sleeping ...");//concrete method - phuong thuc cu the
    }

    protected abstract void eat();//hop dong

    protected void roam(){
        System.out.println("Roaming ...");
    }
    
}
