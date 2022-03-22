/*
*  created date: Mar 22, 2022
*  author: cgm
*/
package oo.tuan6.buoi10;

import java.util.Date;

public class GiaoDichDat extends GiaoDich{
    private char loaiDat;//A, B, C

    //getter
    //setter

    

    @Override
    public double tinhTien() {
        double tien;
        if(this.loaiDat == 'C' && this.loaiDat == 'B'){
            tien = this.getDienTich() * this.getDonGia();
        }else{
            tien = this.getDienTich() * this.getDonGia() * 1.5;
        }
        return tien;
    }

    /**
     * @param maGiaoDich
     * @param ngayGiaoDich
     * @param donGia
     * @param dienTich
     * @param loaiDat
     */
    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, char loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);//cha
        this.loaiDat = loaiDat;//con
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "GiaoDichDat [loaiDat=" + loaiDat + "]" + super.toString();
    }

    
    
}
