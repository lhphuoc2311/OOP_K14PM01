/*
*  created date: Jan 19, 2022
*  author: cgm
*/
package oo.shaperotateapp;

public class Amoeba {
    // attribute
    public String fileSound;// interface => implementations
    private double xPoint;
    private double yPoint;

    // method
    public Amoeba(String fileSound) {
        this.fileSound = fileSound;
    }

    public Amoeba(String fileSound, double xPoint, double yPoint) {
        this(fileSound);
        this.xPoint = xPoint;
        this.yPoint = yPoint;

    }

    void rotate() {
        System.out.println("Rotating 360 ...at xPoint: " + this.xPoint + " yPoint: " + this.yPoint);
    }

    void playSound() {
        // code xu ly file hif
        System.out.println("Play file " + this.fileSound + " music");
    }

}
