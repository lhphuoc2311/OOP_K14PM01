/*
*  created date: Mar 22, 2022
*  author: cgm
*/
package oo.tuan6.buoi10;

import oo.tuan5.buoi9.Dog;

public class DanhSachThuTestDrive {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();


        DanhSachThu danhSachThu = new DanhSachThu();
        danhSachThu.them(dog);

       Dog dogTimDuoc = danhSachThu.timKiemDog("cho");
    }
}
