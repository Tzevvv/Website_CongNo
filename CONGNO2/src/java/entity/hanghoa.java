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
public class hanghoa {
  String mahang;
  String tenhang;
  int dongia;
  int gianhap;
  int tondau;
  int toncuoi;
  int slnhap;
  int slxuat;

    public hanghoa() {
    }

    public hanghoa(String mahang, String tenhang, int dongia, int gianhap, int tondau, int toncuoi, int slnhap, int slxuat) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.gianhap = gianhap;
        this.tondau = tondau;
        this.toncuoi = toncuoi;
        this.slnhap = slnhap;
        this.slxuat = slxuat;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getGianhap() {
        return gianhap;
    }

    public void setGianhap(int gianhap) {
        this.gianhap = gianhap;
    }

    public int getTondau() {
        return tondau;
    }

    public void setTondau(int tondau) {
        this.tondau = tondau;
    }

    public int getToncuoi() {
        return toncuoi;
    }

    public void setToncuoi(int toncuoi) {
        this.toncuoi = toncuoi;
    }

    public int getSlnhap() {
        return slnhap;
    }

    public void setSlnhap(int slnhap) {
        this.slnhap = slnhap;
    }

    public int getSlxuat() {
        return slxuat;
    }

    public void setSlxuat(int slxuat) {
        this.slxuat = slxuat;
    }

    
  
  
  
}
