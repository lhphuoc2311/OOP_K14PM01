/*
*  created date: Jan 19, 2022
*  author: cgm
*/
package oo.shaperotateapp;

public class CircleTestDrive {
    public static void main(String[] args) {
        
        Circle circle = new Circle("musicSpringCircle.aif");
        circle.rotate();
        circle.playSound();

        circle.fileSound = "musicSummerCircl.aif";
        circle.playSound();
    }
    
}
