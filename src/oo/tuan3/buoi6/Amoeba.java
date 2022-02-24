/*
*  created date: Jan 20, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class Amoeba extends Shape {

    //tọa độ điểm
    private double xPoint;
    private double yPoint;

    /**
     * @param xPoint the xPoint to set
     */
    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    /**
     * @param yPoint the yPoint to set
     */
    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }


    @Override
    void rotate() {

        System.out.println("Rotating 360 at xPoint: " + this.xPoint + " yPoint: " + this.yPoint);
    }

    @Override
    void playSound() {
        //code xử lý cho file .hif
        System.out.println("Play file .hif " + this.getSoundFile() + " music");

    }

}
