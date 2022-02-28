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
public class congno {
  String macongno;
  String date;
  String mahd;
  String makh;
  String manv;
  String diengiai;
  int sotien;
  String tkco;
  String tkno;
  String vat;

    public congno(String macongno, String date, String mahd, String makh, String manv, String diengiai, int sotien, String tkco, String tkno, String vat) {
        this.macongno = macongno;
        this.date = date;
        this.mahd = mahd;
        this.makh = makh;
        this.manv = manv;
        this.diengiai = diengiai;
        this.sotien = sotien;
        this.tkco = tkco;
        this.tkno = tkno;
        this.vat = vat;
    }

    public congno(String makh, int sotien, String tkno) {
        this.makh = makh;
        this.sotien = sotien;
        this.tkno = tkno;
    }

    
    

    public String getMacongno() {
        return macongno;
    }

    public void setMacongno(String macongno) {
        this.macongno = macongno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    

    
    
}
