/*
*  created date: Jan 20, 2022
*  author: cgm
*/
package oo.shapeapp;
//template: khuôn mẫu
public class Square {

    //attribute
    String soundFile;//Xuân - Hạ - Thu - Đông

    //method
    public Square(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){

        System.out.println("Rotating 360 ...");
        this.playSound();

    }

    void playSound(){

        //code xử lý play âm thanh .aif

        System.out.println("Play file " + this.soundFile + " music");

    }

    
}
