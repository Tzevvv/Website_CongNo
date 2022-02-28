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
public class thongkecongnochitiet {
    String ngaylap;
    String mahd;
    String diengiai;
    String phaithu;
    String dathu;

    public thongkecongnochitiet(String ngaylap, String mahd, String diengiai, String phaithu, String dathu) {
        this.ngaylap = ngaylap;
        this.mahd = mahd;
        this.diengiai = diengiai;
        this.phaithu = phaithu;
        this.dathu = dathu;
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

    public String getDiengiai() {
        return diengiai;
    }

    public void setDiengiai(String diengiai) {
        this.diengiai = diengiai;
    }

    public String getPhaithu() {
        return phaithu;
    }

    public void setPhaithu(String phaithu) {
        this.phaithu = phaithu;
    }

    public String getDathu() {
        return dathu;
    }

    public void setDathu(String dathu) {
        this.dathu = dathu;
    }
    
    
}
