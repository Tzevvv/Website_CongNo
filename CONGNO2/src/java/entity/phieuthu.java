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
public class phieuthu {

    
    String mapt;
    String mahd;
    String makh;
    String ngaylap;
    String diengiai;
    int sotien;
    String manv;
    String tkno;
    String tkco;
    String vat;

    public phieuthu(String mapt, String mahd, String makh, String ngaylap, String diengiai, int sotien, String manv,  String tkno,String tkco, String vat) {
        this.mapt = mapt;
        this.mahd = mahd;
        this.makh = makh;
        this.ngaylap = ngaylap;
        this.diengiai = diengiai;
        this.sotien = sotien;
        this.manv = manv;
        this.tkno = tkno;
        this.tkco = tkco;
        this.vat = vat;
    }

    public phieuthu() {
    }

    public String getMapt() {
        return mapt;
    }

    public void setMapt(String mapt) {
        this.mapt = mapt;
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

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getDiengiai() {
        return diengiai;
    }

    public void setDiengiai(String diengiai) {
        this.diengiai = diengiai;
    }

    public int getSotien() {
        return sotien;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTkco() {
        return tkco;
    }

    public void setTkco(String tkco) {
        this.tkco = tkco;
    }

    public String getTkno() {
        return tkno;
    }

    public void setTkno(String tkno) {
        this.tkno = tkno;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }
    
    

    @Override
    public String toString() {
        return "phieuthu{" + "mapt=" + mapt + ", mahd=" + mahd + ", makh=" + makh + ", ngaylap=" + ngaylap + ", diengiai=" + diengiai + ", sotien=" + sotien + ", manv=" + manv + ", tkco=" + tkco + ", tkno=" + tkno + ", vat=" + vat + '}';
    }
    
    
    
    
}
