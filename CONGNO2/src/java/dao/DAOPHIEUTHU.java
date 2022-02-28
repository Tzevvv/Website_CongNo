/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Khachhang;
import entity.hoadonchitiet;
import entity.nhanvien;
import entity.phieuthu;
import entity.phieuxuat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAOPHIEUTHU {
     Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    //--------------------------------------SELECT------------------------------------------
   public List<hoadonchitiet> getHOADON(){
        List<hoadonchitiet> list = new ArrayList<>();
        String query = "SELECT HOADON.MAHD\n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD\n" +
                       "GROUP BY HOADON.MAHD ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new hoadonchitiet(
                      rs.getString(1)));
            }
        } catch (Exception e) {
        }
        return list;
    }
   
    public hoadonchitiet getDETAIHOADON(String id){
        String query = "SELECT HOADON.MAHD,HOADON.NGAYLAP,HOADON.MAKH,HOADON.MANV,HOADON.MALOAI,HOADON_CHITIET.MAHANG,HOADON_CHITIET.SOLUONG,HOADON_CHITIET.DONGIA,HOADON_CHITIET.THANHTIEN,HOADON_CHITIET.TIENGTGT\n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD WHERE HOADON.MAHD=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new hoadonchitiet(
                       rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10));
            }
        } catch (Exception e) {
        }
        return null;
    }
   
   public List<Khachhang> getKhachHang() {
        List<Khachhang> list = new ArrayList<>();
        String query = "SELECT * FROM KHACHHANG";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Khachhang(
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
   
   public List<nhanvien> getNHANVIEN() {
        List<nhanvien> list = new ArrayList<>();
        String query = "SELECT * FROM NHANVIEN_KETOAN";
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
   
    public String  getMAXID() {
        String query = "SELECT MAX(right(MAPHIEUTHU,5)) FROM PHIEUTHU ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               int max= rs.getInt(1);
               
               if(max < 9){
                  max=max+1;
                  String id="PT0000"+String.valueOf(max);
                  return id;
               } 
               else if(max < 99){
                  max=max+1;
                  String id="PT000"+String.valueOf(max);
                  return id;
               }
               else if(max < 999){
                  max=max+1;
                  String id="PT00"+String.valueOf(max);
                  return id;
               }
               else if(max < 9999){
                  max=max+1;
                  String id="PT0"+String.valueOf(max);
                  return id;
               }
               else if(max < 99999){
                  max=max+1;
                  String id="PT"+String.valueOf(max);
                  return id;
               }
                                
            }
               
        } catch (Exception e) {
        }
        return null;
    }
    
    public int getTienhoadon(String id ){
        String query = "SELECT SUM(THANHTIEN) FROM HOADON_CHITIET WHERE MAHD=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                int tienhang= rs.getInt(1);
                return tienhang;
            }
        } catch (Exception e) {
        }
        return 0;
    }
    public String getmakh(String id ){
        String query = "SELECT MAKH FROM HOADON WHERE MAHD=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                String makhach= rs.getString(1);
                return makhach;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
//    public String gettienthu(String id ){
//        String query = "SELECT SUM() FROM PHIEUTTHU WHERE MAHD=?";
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(query);
//            ps.setString(1, id);
//            rs = ps.executeQuery();
//            while(rs.next()){
//                String makhach= rs.getString(1);
//                return makhach;
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
    
    
    public void Editphieuthu(String MAPHIEUTHU,String MAHD,String MAKH,String NGAYLAP,String DIENGIAI,double SOTIEN,String MANV,double TKNO,double TKCO,String TKCO_GTGT){
        String query="UPDATE PHIEUTHU SET MAKH=?,NGAYLAP=?,DIENGIAI=?,SOTIEN=?,MANV=?,TKNO=?,TKCO=?,TKCO_GTGT=? WHERE MAHD=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);

            ps.setString(1, MAKH);
            ps.setString(2, NGAYLAP);
            ps.setString(3, DIENGIAI);
            ps.setDouble(4, SOTIEN);
            ps.setString(5, MANV);
            ps.setDouble(6, TKNO);
            ps.setDouble(7, TKCO);
            ps.setString(8, "0");
            ps.setString(9, MAHD);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    
    
    public String getcheck(String id ){
        String query = "SELECT [MAPHIEUTHU] FROM [ASMJAVAWEB_CONG_NO].[dbo].[PHIEUTHU] WHERE [MAHD]=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                String makhach= rs.getString(1);
                return makhach;
            }
        } catch (Exception e) {
        }
        return null;
    }
    //--------------------------------------INSERT------------------------------------------
    public void insertPhieuthu(String MAPHIEUTHU,String MAHD,String MAKH,String NGAYLAP,String DIENGIAI,double SOTIEN,String MANV,double TKNO,double TKCO,String TKCO_GTGT){
        String query="INSERT PHIEUTHU(MAPHIEUTHU,MAHD,MAKH,NGAYLAP,DIENGIAI,SOTIEN,MANV,TKNO,TKCO,TKCO_GTGT) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, MAPHIEUTHU);
            ps.setString(2, MAHD);
            ps.setString(3, MAKH);
            ps.setString(4, NGAYLAP);
            ps.setString(5, DIENGIAI);
            ps.setDouble(6, SOTIEN);
            ps.setString(7, MANV);
            ps.setDouble(8, TKNO);
            ps.setDouble(9, TKCO);
            ps.setString(10, TKCO_GTGT);
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
   
    //--------------------------------------UPDATE------------------------------------------
    
    //--------------------------------------DELETE------------------------------------------
     public void  delete(String id){
        String query="DELETE FROM PHIEUTHU where MAHD=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
   
    //--------------------------------------TIMKIEM------------------------------------------
    //--------------------------------------PHAMTRANG------------------------------------------
    public int getCount(){
        String query = "select COUNT(*) FROM PHIEUTHU";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                int total= rs.getInt(1);
                int countPage=0;
                int limit=5;
                countPage=total/limit;
                if (total % limit !=0) {
                    countPage++;
                }
                return countPage;
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    //Hiện số row theo phân trang
    public List<phieuthu> getPaging(int index){
        List<phieuthu> list = new ArrayList<>();
        String query = "SELECT * FROM PHIEUTHU ORDER BY MAPHIEUTHU OFFSET ? ROWS FETCH FIRST 5 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new phieuthu(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public phieuthu getCheck(String index){
        String query = "SELECT * FROM PHIEUTHU WHERE MAPHIEUTHU=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new phieuthu(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10));
            }
        } catch (Exception e) {
        }
        return null;
    }
}
