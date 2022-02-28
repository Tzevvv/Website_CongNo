/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Khachhang;
import entity.hanghoa;
import entity.hanghoachitiet;
import entity.hoadonchitiet;
import entity.loaihoadon;
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
public class DAOHOADON {
     Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    //-----------------------------SELECT---------------------------------------
    public List<loaihoadon> getAllLoaiHOADON() {
        List<loaihoadon> list = new ArrayList<>();
        String query = "SELECT * FROM LOAI_HOADON ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new loaihoadon(
                        rs.getString(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<hanghoa> getHANGHOA() {
        List<hanghoa> list = new ArrayList<>();
        String query = "SELECT * FROM HANGHOA";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new hanghoa(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
        } catch (Exception e) {
        }
        return list;
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
    
    
     public Khachhang getCheckIDkh(String id) {
        String query = "SELECT * FROM KHACHHANG WHERE MAKH= ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Khachhang(
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
     
     public nhanvien getCheckIDNV(String id) {
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
     
     
     //lấy ra tiền hàng theo id
     public int getTienHangByID(String id ){
        String query = "select DONGIA FROM HANGHOA WHERE MAHANG=?";
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
     
     public String  getMAXID() {
        String query = "SELECT MAX(right(MAHD,5)) FROM HOADON";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               int max= rs.getInt(1);
               
               if(max < 9){
                  int maxx=max+1;
                  String id="HD0000"+String.valueOf(maxx);
                  return id;
               } 
               else if(max < 99){
                  int maxx=max+1;
                  String id="HD000"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 999){
                  int maxx=max+1;
                  String id="HD00"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 9999){
                  int maxx=max+1;
                  String id="HD0"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 99999){
                  int maxx=max+1;
                  String id="HD"+String.valueOf(maxx);
                  return id;
               }
                                
            }
               
        } catch (Exception e) {
        }
        return null;
    }
    
     
     
   
    //-----------------------------INSERT---------------------------------------
      public void insertHOADON(String MAHD,String NGAYLAP,String MAKH,String MANV,int dongia ,String MALOAI ,String vat){
        String query="INSERT INTO HOADON(MAHD,NGAYLAP,MAKH,MANV,TIENHANG,MALOAI,TIEN_GTGT) VALUES (?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, MAHD);
            ps.setString(2, NGAYLAP);
            ps.setString(3, MAKH);
            ps.setString(4, MANV);
            ps.setInt(5, dongia);
            ps.setString(6, MALOAI);
            ps.setString(7, vat);
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
      
      public void insertHOADONCHITIET(String MAHD,String MAHANG,String SOLUONG,int DONGIA,double THANHTIEN,String vat){
        String query="INSERT INTO HOADON_CHITIET(MAHD,MAHANG,SOLUONG,DONGIA,THANHTIEN,TIENGTGT)VALUES(?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, MAHD);
            ps.setString(2, MAHANG);
            ps.setString(3, SOLUONG);
            ps.setInt(4, DONGIA);
            ps.setDouble(5, THANHTIEN);
            ps.setString(6, vat);
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
     
     
    //-----------------------------UPDATE---------------------------------------
       public void Edit(String MAHD,String NGAYLAP,String MAKH,String MANV,int dongia ,String MALOAI ,String vat){
        String query="UPDATE HOADON SET NGAYLAP=? ,MANV=? ,TIENHANG=?,MALOAI=?,TIEN_GTGT=?  WHERE MAHD=? AND MAKH=? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, NGAYLAP);
            ps.setString(2, MANV);
            ps.setInt(4, dongia);
            ps.setString(4, MALOAI);
            ps.setString(5, vat);
             ps.setString(6, MAHD);
              ps.setString(7, MAKH);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public void EditCT(String MAHD,String MAHANG,String SOLUONG,int DONGIA,double THANHTIEN,String vat){
        String query="UPDATE HOADON_CHITIET SET SOLUONG=? ,DONGIA=? ,THANHTIEN=? ,TIENGTGT=? WHERE MAHD=? AND MAHANG=? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, SOLUONG);
            ps.setInt(2, DONGIA);
            ps.setDouble(3, THANHTIEN);
            ps.setString(4, vat);
            ps.setString(5, MAHD);
            ps.setString(6, MAHANG);

            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
//     public void EditSLXUAT(String id){
//        String query="UPDATE HANGHOA SET SLXUAT=(SELECT SLXUAT+1 FROM HANGHOA WHERE MAHANG=?) WHERE MAHANG=?";
//        try {
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            ps.setString(1, id);
//            ps.setString(2, id);
//            ps.executeUpdate();
//            
//        } catch (Exception e) {
//        }
//    }
    
    //-----------------------------DELETE---------------------------------------
      public void  deletehd(String id){
        String query="DELETE FROM HOADON where MAHD=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    
    public int getCountChitiethoadon(String id){
        String query = "select COUNT(*) FROM HOADON_CHITIET Where MAHD=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
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
    
    public void  deletehdchitiet(String id,String id2){
        String query="DELETE FROM HOADON_CHITIET where MAHANG=? and MAHD=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, id2);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    //-----------------------------PHANTRANG------------------------------------
      //đếm số row trong db và chia mỗi trang có 6 csdl hoặc hơn.
    public int getCountHOADON(){
        String query = "select COUNT(*) \n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD ";
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
    public List<hoadonchitiet> getPaging(int index){
        List<hoadonchitiet> list = new ArrayList<>();
        String query = "SELECT HOADON.MAHD,HOADON.NGAYLAP,HOADON.MAKH,HOADON.MANV,HOADON.MALOAI,HOADON_CHITIET.MAHANG,HOADON_CHITIET.SOLUONG,HOADON_CHITIET.DONGIA,HOADON_CHITIET.THANHTIEN,HOADON_CHITIET.TIENGTGT\n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD \n" +
                       "ORDER BY MAHANG OFFSET ? ROWS FETCH FIRST 5 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
             ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new hoadonchitiet(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
    
     public hoadonchitiet getCHITIETDetailID(String id) {
        String query = "SELECT HOADON.MAHD,HOADON.NGAYLAP,HOADON.MAKH,HOADON.MANV,HOADON.MALOAI,HOADON_CHITIET.MAHANG,HOADON_CHITIET.SOLUONG,HOADON_CHITIET.DONGIA,HOADON_CHITIET.THANHTIEN,HOADON_CHITIET.TIENGTGT\n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD  WHERE HOADON.MAHD= ?";
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
    //-----------------------------TIMKIEM--------------------------------------
     
     //tổng tiền 
      public int getSumAllThanhTien(){
        String query = "SELECT SUM(CAST(THANHTIEN  AS BIGINT) ) AS [SUM] \n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                int sum= rs.getInt(1);
                return sum;
            }
        } catch (Exception e) {
        }
        return 0;
    }
     
    //tổng tiền theo tháng
      public int getSumMonthThanhTien(String start ,String end){
        String query = "SELECT SUM(CAST(THANHTIEN  AS BIGINT) ) AS [SUM] \n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD\n" +
                       "WHERE NGAYLAP between ? and ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, start);
            ps.setString(2, end);
            rs = ps.executeQuery();
            while(rs.next()){
                int sum= rs.getInt(1);
                return sum;
            }
        } catch (Exception e) {
        }
        return 0;
    }
      
       public List<hoadonchitiet> getTimkiemMa(String id ,String loai ,String ngay ) {
        List <hoadonchitiet> list=new ArrayList<>();
        String query = "SELECT HOADON.MAHD,HOADON.NGAYLAP,HOADON.MAKH,HOADON.MANV,HOADON.MALOAI,HOADON_CHITIET.MAHANG,HOADON_CHITIET.SOLUONG,HOADON_CHITIET.DONGIA,HOADON_CHITIET.THANHTIEN,HOADON_CHITIET.TIENGTGT\n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD \n" +
                       "where HOADON.MAHD like ? or HOADON.MALOAI  like ? or HOADON.NGAYLAP like ?  ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, loai);
            ps.setString(3, ngay);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new hoadonchitiet(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
       
    public List<hoadonchitiet> getTimkiem(String name ) {
        List <hoadonchitiet> list=new ArrayList<>();
        String query = "SELECT HOADON.MAHD,HOADON.NGAYLAP,HOADON.MAKH,HOADON.MANV,HOADON.MALOAI,HOADON_CHITIET.MAHANG,HOADON_CHITIET.SOLUONG,HOADON_CHITIET.DONGIA,HOADON_CHITIET.THANHTIEN,HOADON_CHITIET.TIENGTGT\n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD \n" +
                       "WHERE HOADON.MAHD like '%"+name+"%'";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new hoadonchitiet(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
    //tổng tiền sau tìm kiếm 
     //tổng tiền 
      public int getSumAlltikiemThanhTien(String name ){
        String query = "SELECT SUM(HOADON_CHITIET.THANHTIEN) \n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD \n" +
                       "WHERE HOADON.MAHD like '%"+name+"%'";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                int sum= rs.getInt(1);
                return sum;
            }
        } catch (Exception e) {
        }
        return 0;
    }
     
    
      
      
      
      
      
      
      
      
      
      
      
     
      public static void main(String[] args) {
        DAOHOADON dao = new DAOHOADON();
        
       String a="1";
       List<hoadonchitiet> pid =dao.getTimkiemMa("hd00001","LHD00001","2021-11-01");
            for (hoadonchitiet o : pid) {
            System.out.println(o);
        }
        }
}
