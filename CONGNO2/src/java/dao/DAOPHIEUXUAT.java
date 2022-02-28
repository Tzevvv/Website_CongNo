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
public class DAOPHIEUXUAT {
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
    
    
     
     
    
    public int getChitietsoluongHoadon(String id){
       
        String query = "SELECT HOADON_CHITIET.SOLUONG \n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD \n" +
                       "WHERE HOADON.MAHD=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int sl= rs.getInt(1);
                return sl;
            }
        } catch (Exception e) {
        }
        return 0; 
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
        String query = "SELECT MAX(right(PHIEUXUAT.MAPHIEUXUAT,5))\n" +
                       "FROM PHIEUXUAT\n" +
                       "LEFT OUTER JOIN XUAT_CHITIET\n" +
                       "ON PHIEUXUAT.MAPHIEUXUAT = XUAT_CHITIET.MAPHIEUXUAT ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               int max= rs.getInt(1);
               
               if(max < 9){
                  max=max+1;
                  String id="PX0000"+String.valueOf(max);
                  return id;
               } 
               else if(max < 99){
                  max=max+1;
                  String id="PX000"+String.valueOf(max);
                  return id;
               }
               else if(max < 999){
                  max=max+1;
                  String id="PX00"+String.valueOf(max);
                  return id;
               }
               else if(max < 9999){
                  max=max+1;
                  String id="PX0"+String.valueOf(max);
                  return id;
               }
               else if(max < 99999){
                  max=max+1;
                  String id="PX"+String.valueOf(max);
                  return id;
               }
                                
            }
               
        } catch (Exception e) {
        }
        return null;
    }
    
    //--------------------------------------INSERT------------------------------------------
    public void insertPhieuxuat(String MAPHIEUXUAT,String MAHD,String MAKH,String MANV,String NGAYXUAT,String TONGTIEN,String DIENGIAI){
        String query="INSERT PHIEUXUAT (MAPHIEUXUAT,MAHD,MAKH,MANV,NGAYXUAT,TONGTIEN,DIENGIAI) VALUES(?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, MAPHIEUXUAT);
            ps.setString(2, MAHD);
            ps.setString(3, MAKH);
            ps.setString(4, MANV);
            ps.setString(5, NGAYXUAT);
            ps.setString(6, TONGTIEN);
            ps.setString(7, DIENGIAI);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public void insertPhieuxuat_Chitiet(String MAPHIEUXUAT,String MAHANG,String SOLUONG,String DONGIA,String THANHTIEN){
        String query="INSERT XUAT_CHITIET(MAPHIEUXUAT,MAHANG,SOLUONG,DONGIA,THANHTIEN) VALUES(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, MAPHIEUXUAT);
            ps.setString(2, MAHANG);
            ps.setString(3, SOLUONG);
            ps.setString(4, DONGIA);
            ps.setString(5, THANHTIEN);

            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    //--------------------------------------UPDATE------------------------------------------
    public void EditSLXUAT(String id,int soluong){
        String query="UPDATE HANGHOA SET SLXUAT=(SELECT SLXUAT+? FROM HANGHOA) WHERE MAHANG=(SELECT MAHANG FROM HOADON_CHITIET WHERE MAHD=?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, soluong);
            ps.setString(2, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    //--------------------------------------DELETE------------------------------------------
     public void  delete(String id){
        String query="DELETE FROM PHIEUXUAT where  MAPHIEUXUAT=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public void  deletechitiet(String id){
        String query="DELETE FROM XUAT_CHITIET where MAPHIEUXUAT=?";
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
        String query = "select COUNT(*) FROM PHIEUXUAT";
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
    public List<phieuxuat> getPaging(int index){
        List<phieuxuat> list = new ArrayList<>();
        String query = "SELECT PHIEUXUAT.MAPHIEUXUAT,PHIEUXUAT.MAHD,PHIEUXUAT.MAKH,PHIEUXUAT.MANV,PHIEUXUAT.NGAYXUAT,PHIEUXUAT.DIENGIAI,XUAT_CHITIET.MAHANG,XUAT_CHITIET.SOLUONG,XUAT_CHITIET.DONGIA,XUAT_CHITIET.THANHTIEN\n" +
                       "FROM XUAT_CHITIET\n" +
                       "LEFT OUTER JOIN  PHIEUXUAT\n" +
                       "ON PHIEUXUAT.MAPHIEUXUAT = XUAT_CHITIET.MAPHIEUXUAT\n" +
                       "ORDER BY PHIEUXUAT.MAPHIEUXUAT OFFSET ? ROWS FETCH FIRST 5 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new phieuxuat(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public phieuxuat getCheck(String index){
        String query = "SELECT PHIEUXUAT.MAPHIEUXUAT,PHIEUXUAT.MAHD,PHIEUXUAT.MAKH,PHIEUXUAT.MANV,PHIEUXUAT.NGAYXUAT,PHIEUXUAT.DIENGIAI,XUAT_CHITIET.MAHANG,XUAT_CHITIET.SOLUONG,XUAT_CHITIET.DONGIA,XUAT_CHITIET.THANHTIEN\n" +
                       "FROM XUAT_CHITIET\n" +
                       "LEFT OUTER JOIN  PHIEUXUAT\n" +
                       "ON PHIEUXUAT.MAPHIEUXUAT = XUAT_CHITIET.MAPHIEUXUAT\n" +
                       "WHERE PHIEUXUAT.MAPHIEUXUAT=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new phieuxuat(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    
     public static void main(String[] args) {
        DAOPHIEUXUAT dao=new DAOPHIEUXUAT();
        
       String a="1";
       dao.deletechitiet("HD00005");
       dao.delete("HD00005");
       
       
        }
}
