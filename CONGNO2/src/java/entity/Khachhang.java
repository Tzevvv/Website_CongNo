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
public class Khachhang {
  
  String makh;
  String tenkh;
  String diachi;
  String sdt;
  String email;
  String masothue;
  String phaithudauky;
  String dathudauky;

    public Khachhang(String makh, String tenkh, String diachi, String sdt, String email, String masothue, String phaithudauky, String dathudauky) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.masothue = masothue;
        this.phaithudauky = phaithudauky;
        this.dathudauky = dathudauky;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    public String getPhaithudauky() {
        return phaithudauky;
    }

    public void setPhaithudauky(String phaithudauky) {
        this.phaithudauky = phaithudauky;
    }

    public String getDathudauky() {
        return dathudauky;
    }

    public void setDathudauky(String dathudauky) {
        this.dathudauky = dathudauky;
    }

   
    
}
