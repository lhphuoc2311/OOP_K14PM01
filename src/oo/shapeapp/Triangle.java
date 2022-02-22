/*
*  created date: Jan 20, 2022
*  author: cgm
*/
package oo.shapeapp;

public class Triangle {

    // attribute
    String soundFile;// Xuân - Hạ - Thu - Đông
    // method

    public Triangle(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate() {
        System.out.println("Rotating 360 ...");
        this.playSound();
    }

    void playSound() {
        System.out.println("Play file " + this.soundFile + " music");
    }

}
