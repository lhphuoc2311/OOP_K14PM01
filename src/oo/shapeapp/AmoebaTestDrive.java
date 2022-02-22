/*
*  created date: Jan 20, 2022
*  author: cgm
*/
package oo.shapeapp;

public class AmoebaTestDrive {

    public static void main(String[] args) {

        Amoeba amoeba = new Amoeba("amoeba.hif");
        amoeba.rotate();

        Amoeba amoeba2 = new Amoeba("amoeba.hif", 5.5, 10.5);
        amoeba2.rotate();
    }
    
}
