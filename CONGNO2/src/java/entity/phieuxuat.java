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
public class phieuxuat {
  String maphieuxuat;
  
  String mahd;
  String makh;
  String manv;
  String ngayxuat;
  int tongtien;
  String diengiai;
  
  String mahang;
  int soluong;
  int dongia;
  int thanhtien;
  

  public phieuxuat(String maphieuxuat, String mahd, String makh, String manv, String ngayxuat, int tongtien, String diengiai) {
        this.maphieuxuat = maphieuxuat;
        this.mahd = mahd;
        this.makh = makh;
        this.manv = manv;
        this.ngayxuat = ngayxuat;
        this.tongtien = tongtien;
        this.diengiai = diengiai;
  }

    public phieuxuat(String maphieuxuat, String mahd, String makh, String manv, String ngayxuat, int tongtien, String diengiai, String mahang, int soluong, int dongia, int thanhtien) {
        this.maphieuxuat = maphieuxuat;
        this.mahd = mahd;
        this.makh = makh;
        this.manv = manv;
        this.ngayxuat = ngayxuat;
        this.tongtien = tongtien;
        this.diengiai = diengiai;
        this.mahang = mahang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }

    public phieuxuat(String maphieuxuat, String mahd, String makh, String manv, String ngayxuat, String diengiai, String mahang, int soluong, int dongia, int thanhtien) {
        this.maphieuxuat = maphieuxuat;
        this.mahd = mahd;
        this.makh = makh;
        this.manv = manv;
        this.ngayxuat = ngayxuat;
        this.diengiai = diengiai;
        this.mahang = mahang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }
    
    

    public String getMaphieuxuat() {
        return maphieuxuat;
    }

    public void setMaphieuxuat(String maphieuxuat) {
        this.maphieuxuat = maphieuxuat;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
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

    public String getNgayxuat() {
        return ngayxuat;
    }

    public void setNgayxuat(String ngayxuat) {
        this.ngayxuat = ngayxuat;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public String getDiengiai() {
        return diengiai;
    }

    public void setDiengiai(String diengiai) {
        this.diengiai = diengiai;
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
  
  
  
  
}
