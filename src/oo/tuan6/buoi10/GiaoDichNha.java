/*
*  created date: Mar 22, 2022
*  author: cgm
*/
package oo.tuan6.buoi10;

import java.util.Date;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha; //CaoCap, Thuong
    private String diaChi;
    /**
     * @param maGiaoDich
     * @param ngayGiaoDich
     * @param donGia
     * @param dienTich
     * @param loaiNha
     * @param diaChi
     */
    public GiaoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String loaiNha,
            String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }
    @Override
    public double tinhTien() {
        double tien;
        if(this.loaiNha.equals("CaoCap")){
            tien = this.getDienTich() * this.getDonGia();
        }else{
            tien = this.getDienTich() * this.getDonGia() * 0.9;
        }
        return tien;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "GiaoDichNha [diaChi=" + diaChi + ", loaiNha=" + loaiNha + "]" + super.toString();
    }

    


    
}
