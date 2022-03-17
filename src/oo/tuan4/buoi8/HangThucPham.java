/*
*  created date: Mar 10, 2022
*  author: cgm
*/
package oo.tuan4.buoi8;

import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham implements Serializable {

    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySX;
    private Date ngayHetHan;

    /**
     * @param maHang the maHang to set
     */
    private void setMaHang(String maHang) {
        if (maHang != null) {
            this.maHang = maHang;
        } else {
            System.out.println("Ma hang khong duoc rong!");
            this.maHang = "00000";
        }

    }

    /**
     * @param ngayHetHan the ngayHetHan to set
     */
    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan != null) {

            if (ngayHetHan.after(this.ngaySX)) {
                this.ngayHetHan = ngayHetHan;
            } else {
                System.out.println("Ngay Het han phai sau ngay san xuagt !!!");
                this.ngayHetHan = new Date();// ngay Hien tai
            }
        } else {
            System.out.println("Ngay Het han khong duoc rong!!!");
            this.ngayHetHan = new Date();// ngay Hien tai
        }

    }

    /**
     * @param ngaySX the ngaySX to set
     */
    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    /**
     * @param tenHang the tenHang to set
     */
    public void setTenHang(String tenHang) {
        // code rang buoc
        if (tenHang != null) {
            this.tenHang = tenHang;
        } else {
            System.out.println("Ten khong de rong");
            this.tenHang = "XXXXXXXX";
        }
    }

    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        } else {
            System.out.println("Don gia > 0 !!!");
        }

    }

    /**
     * @return the maHang
     */
    public String getMaHang() {
        return maHang;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    // public HangThucPham(){}

    /**
     * @param maHang
     */
    public HangThucPham(String maHang) {
        this.setMaHang(maHang);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {

        //dd/MM/yyyy : 10/03/2022

        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(localeVN);

        return "HangThucPham [donGia=" + tienVietNam.format(donGia) + ", maHang=" + maHang + ", ngayHetHan=" +  ngayVietNam.format(ngayHetHan) + ", ngaySX="
                + ngayVietNam.format(ngaySX) + ", tenHang=" + tenHang + "]";
    }

    /**
     * @param maHang
     * @param tenHang
     * @param donGia
     * @param ngaySX
     * @param ngayHetHan
     */
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHetHan) {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHetHan);
    }

    public boolean kiemTranHSD(){
        boolean isHetHan = false;//con han

        if(this.ngayHetHan.before(new Date())){
            isHetHan  = true;
        }
        return isHetHan;

    }

    /**
     * @return the tenHang
     */
    public String getTenHang() {
        return tenHang;
    }

}
