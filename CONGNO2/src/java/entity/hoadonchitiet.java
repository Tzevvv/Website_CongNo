/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class hoadonchitiet {
    
    String mahd;
    String ngaylap;
    String makh;
    String manv;
    String maloai;
    String mahang;
    int soluong;
    int dongia;
    int thanhtien;
    int vat;

    public hoadonchitiet(String mahd, String ngaylap, String makh, String manv, String maloai, String mahang, int soluong, int dongia, int thanhtien, int vat) {
        this.mahd = mahd;
        this.ngaylap = ngaylap;
        this.makh = makh;
        this.manv = manv;
        this.maloai = maloai;
        this.mahang = mahang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
        this.vat = vat;
    }

    public hoadonchitiet(int soluong) {
        this.soluong = soluong;
    }
    

    public hoadonchitiet(String mahd) {
        this.mahd = mahd;
    }
    
    

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    
    
}
