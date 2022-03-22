/*
*  created date: Mar 22, 2022
*  author: cgm
*/
package oo.tuan6.buoi10;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
    private List<GiaoDich> danhSach = new ArrayList<>();

    private int soLuongGiaoDichDat;
    private int soluongGiaoDichNha;

    /**
     * @return the soLuongGiaoDichDat
     */
    public int getSoLuongGiaoDichDat() {
        return soLuongGiaoDichDat;
    }

    /**
     * @return the soluongGiaoDichNha
     */
    public int getSoluongGiaoDichNha() {
        return soluongGiaoDichNha;
    }

    public void them(GiaoDich giaoDich){

        danhSach.add(giaoDich);

    }

    public void inDanhSach(){
        for (GiaoDich giaoDich : danhSach) {
            System.out.println(giaoDich);
        }
    }

    public void tinhTongSLTungLoai(){
        for (GiaoDich giaoDich : danhSach) {
            if(giaoDich instanceof GiaoDichDat){
                this.soLuongGiaoDichDat++;
            }else{
                this.soluongGiaoDichNha++;
            }
        }
    }

    public double tinhTongTBGDDat(){
        double tienGDDat = 0.0;
        int dem = 0;
        for (GiaoDich giaoDich : danhSach) {

            if(giaoDich instanceof GiaoDichDat){
                dem++;
                tienGDDat += giaoDich.tinhTien();
            }
            
        }
        return tienGDDat/dem;
    }
    
}
