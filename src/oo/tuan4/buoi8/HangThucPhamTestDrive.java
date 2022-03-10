/*
*  created date: Mar 10, 2022
*  author: cgm
*/
package oo.tuan4.buoi8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//client code
public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        //HangThucPham htp = new HangThucPham();

        //System.out.println(htp);
        //khong chinh sua
        //co quyen truy cap
        //htp.setMaHang("TP09");

    //    System.out.println(htp);

       // System.out.println("MH " + htp.getMaHang());

        // HangThucPham htp2 = new HangThucPham(null);
        // System.out.println(htp2);

        SimpleDateFormat ngayVietNam = new 
SimpleDateFormat("dd/MM/yyyy");

        String ngaySX = "01/03/2022";
        String ngayHetHan = "28/03/2022";

        HangThucPham htp3 = new HangThucPham("TP04", "Mi Hao Hao", 3_500, ngayVietNam.parse(ngaySX), ngayVietNam.parse(ngayHetHan));

        System.out.println(htp3);

        if(htp3.kiemTranHSD()){
            System.out.println("Het han roi ! Dung an !!!!");
        }else{
            System.out.println("Con han su dung an di !!!!!");
        }

        System.out.println("Ngay HIen tai: " + new Date());

    }
    
}
