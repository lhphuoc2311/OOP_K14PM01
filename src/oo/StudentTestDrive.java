package oo;

/*
*  created date: Jan 13, 2022
*  author: cgm
*/
// mình đang làm gì đây? 
//xin thưa mình đang code
public class StudentTestDrive {

    public static void main(String[] args) {
        
        Student tuanStudent = new Student();//=> KHOONG constructor mac dinh do Java cung cap
        tuanStudent.hoc();

        Student ducStudent = new Student();
        ducStudent.thi();

        Student xyzStudent = new Student();
        xyzStudent.dangKyMonHoc();

        Student minhStudent =  new Student(false, 20, "Ly Minh Minh", "CNTT", 5.0);

        Student lamStudent =  new Student(false, 19, "Ly Hoai Lam", "CNTT", 6.0);



    }
    
}
