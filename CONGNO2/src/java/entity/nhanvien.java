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
public class nhanvien {
    String manv;
    String tennv;
    String diachi;
    String sdt;
    String cmt;
    String tendn;
    String pass;
    String phanquyen;

    public nhanvien(String manv, String tennv, String diachi, String sdt, String cmt, String tendn, String pass, String phanquyen) {
        this.manv = manv;
        this.tennv = tennv;
        this.diachi = diachi;
        this.sdt = sdt;
        this.cmt = cmt;
        this.tendn = tendn;
        this.pass = pass;
        this.phanquyen = phanquyen;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
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

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhanquyen() {
        return phanquyen;
    }

    public void setPhanquyen(String phanquyen) {
        this.phanquyen = phanquyen;
    }

    
    
}
