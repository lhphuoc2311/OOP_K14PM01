/*
*  created date: Feb 22, 2022
*  author: cgm
*/
package oo.tuan3.buoi5;

public class Player {
    //attriubte - state
    int number = 0;

    //method -behaivor
    public void guess() {
        number = (int) (Math.random() * 10);//1 - 10
        System.out.println("I'm guessing " + number);
    }
}
