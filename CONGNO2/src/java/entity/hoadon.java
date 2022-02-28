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
public class hoadon {
   
  String mahoadon;
  String date;
  String maloai;
  String makh;
  String manv;
  String mahang;
  int tienhang;
  int soluong;
  int thanhtien;
  int vat;

    public hoadon(String mahoadon, String date, String maloai, String makh, String manv, String mahang, int tienhang, int soluong, int thanhtien, int vat) {
        this.mahoadon = mahoadon;
        this.date = date;
        this.maloai = maloai;
        this.makh = makh;
        this.manv = manv;
        this.mahang = mahang;
        this.tienhang = tienhang;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
        this.vat = vat;
    }

    public hoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }
    

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
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

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public int getTienhang() {
        return tienhang;
    }

    public void setTienhang(int tienhang) {
        this.tienhang = tienhang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
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
