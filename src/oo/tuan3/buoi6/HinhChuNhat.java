/*
*  created date: Feb 24, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class HinhChuNhat {

    private double chieuDai;

    private double chieuRong;


    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @return the chieuDai
     */
    public double getChieuDai() {
        return chieuDai;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    /**
     * @return the chieuRong
     */
    public double getChieuRong() {
        return chieuRong;
    }

    public double tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }

    public double tinhChuVi(){
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public String toString(){
        String string = "Chieu dai: " + this.chieuDai + " chieu rong: "  + this.chieuRong;
        string += " Chu vi: " + this.tinhChuVi() + " dien tich: " + this.tinhDienTich();
        return string;
    }


    
}
