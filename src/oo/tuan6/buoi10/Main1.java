/*
*  created date: Mar 22, 2022
*  author: cgm
*/
package oo.tuan6.buoi10;

import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();

        System.out.print("Nhap Ma Giao Dich>>");
        String maGiaoDich = scanner.nextLine();
        System.out.print("Don Gia>>");
        double donGia = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Giao Dich Dat_1/NHa_2>>");
        int loai = scanner.nextInt();

        GiaoDich giaoDich;
        if(loai ==1 ){
            //sysout. nhap loai dat
            giaoDich = new GiaoDichDat(maGiaoDich, new Date(), donGia, 500, 'B');
        }else{

            //nhap diaChi, Loai Nha
             giaoDich = new GiaoDichNha(maGiaoDich, new Date(), donGia, 200, "Thuong", "Binh Chah");
        }

        danhSachGiaoDich.them(giaoDich);

        

        danhSachGiaoDich.inDanhSach();


    }
    
}
