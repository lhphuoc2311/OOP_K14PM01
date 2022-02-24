/*
*  created date: Feb 24, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class ShapeTestDrive {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setSoundFile("circle.aif");
        circle.rotate();
        circle.playSound();


        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setyPoint(10);
        amoeba.setSoundFile("amoeba.hif");
        amoeba.rotate();
        amoeba.playSound();


    }
    
}
