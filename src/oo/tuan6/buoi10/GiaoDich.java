/*
*  created date: Mar 22, 2022
*  author: cgm
*/
package oo.tuan6.buoi10;

import java.util.Date;

public abstract class GiaoDich {
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;
    private static int count;
    //setter
    //getter

    /**
     * @return the donGia
     */
    public double getDonGia() {
        return donGia;
    }

    /**
     * @return the dienTich
     */
    public double getDienTich() {
        return dienTich;
    }
    

    public abstract double tinhTien();

    public GiaoDich(){
        this.tangCount();
    }

    private void tangCount(){
        count++;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    /**
     * @param maGiaoDich
     * @param ngayGiaoDich
     * @param donGia
     * @param dienTich
     */
    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.tangCount();
    }

    @Override
    public String toString() {
        return "GiaoDich [dienTich=" + dienTich + ", donGia=" + donGia + ", maGiaoDich=" + maGiaoDich
                + ", ngayGiaoDich=" + ngayGiaoDich + "]";
    }

    /**
     * @return the maGiaoDich
     */
    public String getMaGiaoDich() {
        return maGiaoDich;


    }


    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }


    /**
     * @param dienTich the dienTich to set
     */
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    
    
}
