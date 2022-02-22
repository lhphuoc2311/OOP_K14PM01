/*
*  created date: Jan 19, 2022
*  author: cgm
*/
package oo.shaperotateapp;

public class AmoebaTestDrive {
    public static void main(String[] args) {

        Amoeba amoeba = new Amoeba("amoeba.hif", 5.5, 2.3);
        //amoeba.xPoint = -5.5;//chết người
        amoeba.fileSound = "amoeba.aif";//sai ràng buộc
        amoeba.playSound();

        amoeba.rotate();
    }
    
}
