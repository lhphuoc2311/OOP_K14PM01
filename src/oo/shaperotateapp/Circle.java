/*
*  created date: Jan 19, 2022
*  author: cgm
*/
package oo.shaperotateapp;

public class Circle {
    
    //member of Class
    //attribute
    String fileSound;//object/state variable

    //method
    public Circle(String fileSound){
        this.fileSound = fileSound;
    }

    //object method => behavior of Object in Heap memory
    void rotate(){
        System.out.println("Rotating 360 ...");
    }

    void playSound(){
        //code xu ly file aif
        System.out.println("Play file " + this.fileSound + " music");
    }
    
}
