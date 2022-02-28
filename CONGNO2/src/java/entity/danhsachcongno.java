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
public class danhsachcongno {
    
    String makhach;
    String tenkhach;
    int dauno;
    int dauco;
    int cuoikyno;
    int cuoikyco;
    

    public danhsachcongno(int cuoikyno, int cuoikyco) {
        this.cuoikyno = cuoikyno;
        this.cuoikyco = cuoikyco;
    }

    public danhsachcongno(String makhach, String tenkhach, int dauno, int dauco) {
        this.makhach = makhach;
        this.tenkhach = tenkhach;
        this.dauno = dauno;
        this.dauco = dauco;
    }

    public String getMakhach() {
        return makhach;
    }

    public void setMakhach(String makhach) {
        this.makhach = makhach;
    }

    public String getTenkhach() {
        return tenkhach;
    }

    public void setTenkhach(String tenkhach) {
        this.tenkhach = tenkhach;
    }

    public int getDauno() {
        return dauno;
    }

    public void setDauno(int dauno) {
        this.dauno = dauno;
    }

    public int getDauco() {
        return dauco;
    }

    public void setDauco(int dauco) {
        this.dauco = dauco;
    }

    public int getCuoikyno() {
        return cuoikyno;
    }

    public void setCuoikyno(int cuoikyno) {
        this.cuoikyno = cuoikyno;
    }

    public int getCuoikyco() {
        return cuoikyco;
    }

    public void setCuoikyco(int cuoikyco) {
        this.cuoikyco = cuoikyco;
    }

    @Override
    public String toString() {
        
        return "danhsachcongno{" + "makhach=" + makhach + ", tenkhach=" + tenkhach + ", dauno=" + dauno + ", dauco=" + dauco + ", cuoikyno=" + cuoikyno + ", cuoikyco=" + cuoikyco + '}';
    }
    
    

    
    
    
    

}
