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
public class thongkenhatky {
    
    String ngaylap;
    String mahd;
    String tinhnang;
    String tkno;
    String tkco;
    String tien;

    public thongkenhatky(String ngaylap, String mahd, String tinhnang, String tkno, String tkco, String tien) {
        this.ngaylap = ngaylap;
        this.mahd = mahd;
        this.tinhnang = tinhnang;
        this.tkno = tkno;
        this.tkco = tkco;
        this.tien = tien;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getTinhnang() {
        return tinhnang;
    }

    public void setTinhnang(String tinhnang) {
        this.tinhnang = tinhnang;
    }

    public String getTkno() {
        return tkno;
    }

    public void setTkno(String tkno) {
        this.tkno = tkno;
    }

    public String getTkco() {
        return tkco;
    }

    public void setTkco(String tkco) {
        this.tkco = tkco;
    }

    public String getTien() {
        return tien;
    }

    public void setTien(String tien) {
        this.tien = tien;
    }
    
    


    
    
    
}
