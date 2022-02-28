/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Khachhang;
import entity.nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAOLOGIN {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    //Đăng nhập
    public nhanvien login(String user ,String pass ){
        String query="SELECT * FROM NHANVIEN_KETOAN WHERE TENDN =? AND PASS=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                return new nhanvien(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    

    
    
       public List<nhanvien> nhanvien(){
        List<nhanvien> list = new ArrayList<>();
        String query="SELECT * FROM NHANVIEN_KETOAN ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new nhanvien(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
    
     //kiểm tra tài khoản tồn tại chưa
    public nhanvien checkAccountExit(String user){
        String query="Select * from NHANVIEN_KETOAN where  TENDN =?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while(rs.next()){
                return new nhanvien(
                       rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    
    public String  getMAXID() {
        String query = "SELECT MAX(right(MANV,5)) FROM NHANVIEN_KETOAN";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               int max= rs.getInt(1);
               
               if(max < 9){
                  int maxx=max+1;
                  String id="NV0000"+String.valueOf(maxx);
                  return id;
               } 
               else if(max < 99){
                  int maxx=max+1;
                  String id="NV000"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 999){
                  int maxx=max+1;
                  String id="NV00"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 9999){
                  int maxx=max+1;
                  String id="NV0"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 99999){
                  int maxx=max+1;
                  String id="NV"+String.valueOf(maxx);
                  return id;
               }
                                
            }
               
        } catch (Exception e) {
        }
        return null;
    }
    
    
    //Đăng ký insert
    public  void Singup(String manv,String tennv,String diachi ,String sdt ,String cmt ,String user ,String pass,String phanquyen){
        String query="INSERT INTO NHANVIEN_KETOAN(MANV,TENNV,DIACHI,SDT,CMT,TENDN,PASS,PHANQUYEN) VALUES (?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, manv);
            ps.setString(2, tennv);
            ps.setString(3, diachi);
            ps.setString(4, sdt);
            ps.setString(5, cmt);
            ps.setString(6, user);
            ps.setString(7, pass);
            ps.setString(8, phanquyen);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    public  void SingupAdmin(){
        String query="INSERT INTO NHANVIEN_KETOAN(MANV,TENNV,DIACHI,SDT,CMT,TENDN,PASS,PHANQUYEN) VALUES (?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, "NV00000");
            ps.setString(2, "ADMIN");
            ps.setString(3, "NULL");
            ps.setString(4, "099999999");
            ps.setString(5, "099999999");
            ps.setString(6, "ADMIN");
            ps.setString(7, "123456");
            ps.setString(8, "0");
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
     public void  deletenhanvien(String id){
        String query="DELETE FROM NHANVIEN_KETOAN where MANV=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
     
     
     public nhanvien getnhanvienByDetailID(String id) {
        String query = "SELECT * FROM NHANVIEN_KETOAN WHERE MANV= ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
               return new nhanvien(
                       rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
     
      public void Edit(String manv,String tennv,String diachi ,String sdt ,String cmt  ,String pass,String phanquyen){
        String query="UPDATE NHANVIEN_KETOAN SET TENNV=?,DIACHI=?,SDT=?,CMT=?,PASS=?,PHANQUYEN=? WHERE MANV=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, tennv);
            ps.setString(2, diachi);
            ps.setString(3, sdt);
            ps.setString(4, cmt);
            ps.setString(5, pass);
            ps.setString(6, phanquyen);
            ps.setString(7, manv);

            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
}
