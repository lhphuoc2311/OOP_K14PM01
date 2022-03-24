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

    //xoa
    //timkiem
    public GiaoDich timKiemGiaoDich(String maGiaoDich){
        GiaoDich giaoDich = null;
        for (GiaoDich gd : danhSach) {
            if(gd.getMaGiaoDich().equalsIgnoreCase(maGiaoDich)){
                giaoDich = gd;
            }
        }
        return giaoDich;
    }
    //sua

    public GiaoDichDat timKiemGiaoDichDat(String maGiaoDich){
        GiaoDichDat giaoDich = null;
        for (GiaoDich gd : danhSach) {
            if(gd.getMaGiaoDich().equalsIgnoreCase(maGiaoDich) &&
            gd instanceof GiaoDichDat){
                giaoDich = (GiaoDichDat) gd;
            }
        }
        return giaoDich;
    }


    public void xoaGiaoDich(GiaoDich giaoDich){
        this.danhSach.remove(giaoDich);
    }

    //tim vi tri cua Giao Dich torng danh sach
    public int timViTriCuaGD(GiaoDich giaoDich){
        int viTri = -1;
        viTri = this.danhSach.indexOf(giaoDich);
        return viTri;
    }

    public void suaGiaoDich(int viTri, GiaoDich giaoDich){
        this.danhSach.set(viTri, giaoDich);
    }
    
}
