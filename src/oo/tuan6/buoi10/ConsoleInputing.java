/*
*  created date: Mar 24, 2022
*  author: cgm
*/
package oo.tuan6.buoi10;

import java.util.Date;
import java.util.Scanner;

public class ConsoleInputing {
    private Scanner nhap = new Scanner(System.in);

    /**
     * @return the nhap
     */
    public Scanner getNhap() {
        return nhap;
    }

    public GiaoDich nhapGiaoDich(){
        GiaoDich giaoDich = null;
        System.out.println("Nhap Ma Giao Dich>>");
        String maGiaoDich = nhap.nextLine();
        System.out.println("Don Gia>>");
        double donGia = nhap.nextDouble();
        //nhap.nextLine();
        //dien tich
        //ngay
        System.out.print("Ban chon loai nao 1-GiaoDichNha, 2- Giao Dich dat>>");
        int loai = nhap.nextInt();
        nhap.nextLine();

        if(loai == 1){
            System.out.print("Nhap Dia Chi>>");
            String diaChi = nhap.nextLine();
            giaoDich = new GiaoDichNha(maGiaoDich, new Date(), donGia, 0, "Thuong", diaChi);
            
        }else{
            System.out.print("NHap LOai Dat >>");
            char loaiDat = nhap.nextLine().charAt(0);
            //nhap.nextLine();
            giaoDich = new GiaoDichDat(maGiaoDich, new Date(), donGia, 0, loaiDat);
        }

        return giaoDich;
    }
    
}
