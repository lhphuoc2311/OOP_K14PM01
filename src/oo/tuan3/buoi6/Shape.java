/*
*  created date: Feb 24, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class Shape {

    // attribute
//implementation
private String soundFile;// Xuân - Hạ - Thu - Đông

/**
 * @param soundFile the soundFile to set
 */
public void setSoundFile(String soundFile) {
    this.soundFile = soundFile;
}

public Shape(){}

public Shape(String soundFile) {
    this.soundFile = soundFile;
}
/**default */ void rotate() {
    System.out.println("Rotating 360 ...");
}
void playSound() {
    System.out.println("Play file .aif " + this.
soundFile + " music");
}
    
}
