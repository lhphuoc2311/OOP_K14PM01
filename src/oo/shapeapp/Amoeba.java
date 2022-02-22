/*
*  created date: Jan 20, 2022
*  author: cgm
*/
package oo.shapeapp;

public class Amoeba {

    // attribute
    String soundFile;// Xuân - Hạ - Thu - Đông
    //tọa độ điểm
    double xPoint;
    double yPoint;

    // method
    public Amoeba(String soundFile) {
        this.soundFile = soundFile;
    }

    public Amoeba(String soundFile, double xPoint, double yPoint){
        this(soundFile);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    void rotate() {

        System.out.println("Rotating 360 at xPoint: " + this.xPoint + " yPoint: " + this.yPoint);
        this.playSound();

    }

    void playSound() {
        //code xử lý cho file .hif
        System.out.println("Play file " + this.soundFile + " music");

    }

}
