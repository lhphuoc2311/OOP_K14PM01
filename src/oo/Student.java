/*
*  created date: Jan 13, 2022
*  author: cgm
*/
package oo;

//tui đang tạo khuôn nè : he he
public class Student {
    //attribute - data - state
    boolean gioiTinh;
    float tuoi;
    String name;
    String khoa;
    double diemTB;

    //method - functions - behavior
    //constructor
    public Student(/**this, */){
        // code xử lý
        // this.name = "Tuấn";
        // this.tuoi = 20;
        // this.gioiTinh = false;
        // this.khoa = "CNTT";
        // this.diemTB = 4.5;
        // this.hoc();
        // this.thi();
    }

    public Student(String name, float tuoi){
        this.name = name;
        this.tuoi = tuoi; 
    }
    public Student(/**this, */ boolean gioiTinh, float tuoi, String name, String khoa, double diemTB){

        this(name, tuoi);//goi ham tao 2 tham so //duoc dat o dong dau tien

        this.diemTB = diemTB;

        this.khoa = khoa;
        this.gioiTinh = gioiTinh;
    }

    void hoc(/**this */){
        System.out.println("HOc ...");
    }

    void thi(/*this*/){
        this.diemTB = 2.0;
        System.out.println("thi ...");
    }

    void dangKyMonHoc(/**this */){
        System.out.println();
    }
    
}
