/*
*  created date: Jan 20, 2022
*  author: cgm
*/
package oo.shapeapp;

public class Circle {

    // attribute
    //implementation
    String soundFile;// Xuân - Hạ - Thu - Đông
    // method

    public Circle(String soundFile) {
        this.soundFile = soundFile;
    }

    /**default */ void rotate() {
        System.out.println("Rotating 360 ...");
        this.playSound();
    }

    void playSound() {
        System.out.println("Play file " + this.soundFile + " music");
    }

}
