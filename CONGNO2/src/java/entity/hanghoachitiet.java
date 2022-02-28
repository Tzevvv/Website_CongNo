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
public class hanghoachitiet {
    String mahang;
    String loaihang;
    String dvt;
    String tenhang;
    String tinhnang;
    int sln;
    int slx;
    int gianhap;
    int giaxuat;
    int vat;
    int tondauky;

    public hanghoachitiet(String mahang, String loaihang, String dvt, String tenhang, String tinhnang, int sln, int gianhap, int giaxuat, int vat, int tondauky,int slx) {
        this.mahang = mahang;
        this.loaihang = loaihang;
        this.dvt = dvt;
        this.tenhang = tenhang;
        this.tinhnang = tinhnang;
        this.sln = sln;
        this.gianhap = gianhap;
        this.giaxuat = giaxuat;
        this.vat = vat;
        this.tondauky = tondauky;
        this.slx = slx;
    }
    
    public hanghoachitiet(String mahang, String loaihang, String dvt, String tinhnang, int vat) {
        this.mahang = mahang;
        this.loaihang = loaihang;
        this.dvt = dvt;
        this.tinhnang = tinhnang;
        this.vat = vat;
    }

    public int getSlx() {
        return slx;
    }

    public void setSlx(int slx) {
        this.slx = slx;
    }
    
    

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getLoaihang() {
        return loaihang;
    }

    public void setLoaihang(String loaihang) {
        this.loaihang = loaihang;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getTinhnang() {
        return tinhnang;
    }

    public void setTinhnang(String tinhnang) {
        this.tinhnang = tinhnang;
    }

    public int getSln() {
        return sln;
    }

    public void setSln(int sln) {
        this.sln = sln;
    }

    public int getGianhap() {
        return gianhap;
    }

    public void setGianhap(int gianhap) {
        this.gianhap = gianhap;
    }

    public int getGiaxuat() {
        return giaxuat;
    }

    public void setGiaxuat(int giaxuat) {
        this.giaxuat = giaxuat;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public int getTondauky() {
        return tondauky;
    }

    public void setTondauky(int tondauky) {
        this.tondauky = tondauky;
    }

   
    

   
    
    
    
    
    
    
}
