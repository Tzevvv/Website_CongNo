

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Khachhang;
import entity.congno;
import entity.hanghoachitiet;
import entity.hoadon;
import entity.hoadonchitiet;
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
public class DAOCONGNO {

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


    public List<nhanvien> getAllNhanVien() {
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

    public congno getCongnoByDetailID(String id) {
        String query = "Select * From CONG_NO WHERE MACONGNO= ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new congno(
                       rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10));
            }
        } catch (Exception e) {
        }
        return null;
    }



      public String  getPkMaxID() {
        String query = "SELECT MAX(right(MACONGNO,5)) FROM CONG_NO";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               int max= rs.getInt(1);

               if(max < 9){
                  int maxx=max+1;
                  String id="CN0000"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 99){
                  int maxx=max+1;
                  String id="CN000"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 999){
                  int maxx=max+1;
                  String id="CN00"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 9999){
                  int maxx=max+1;
                  String id="CN0"+String.valueOf(maxx);
                  return id;
               }
               else if(max < 99999){
                  int maxx=max+1;
                  String id="CN"+String.valueOf(maxx);
                  return id;
               }

            }

        } catch (Exception e) {
        }
        return null;
    }


       public int getTienhoadon(String id ){
        String query = "SELECT THANHTIEN FROM HOADON_CHITIET WHERE MAHD=?";
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
       
      public String getTiennoMakh(String id) {
        
         String query = "SELECT MAKH FROM [HOADON] WHERE MAHD=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
               String makh=rs.getString(1);
               return makh;
            }
        } catch (Exception e) {
        }
        return null;
    }
       
       public int getTiennoMakhSotien(String id) {
         String query = "SELECT SUM(THANHTIEN) FROM HOADON_CHITIET WHERE MAHD=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
              
                       int sotien= rs.getInt(1);
                       return sotien;
                        
            }
        } catch (Exception e) {
        }
        return 0;
    }
       public int getTiennoMakhtkno(String id) {
         String query = "SELECT TKNO FROM [CONG_NO] WHERE MAHD=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                        return rs.getInt(1);
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
        
        
        public String getcheck(String id ){
        String query = "SELECT [MACONGNO] FROM [ASMJAVAWEB_CONG_NO].[dbo].[CONG_NO] WHERE [MAHD]=?";
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
    public void insertCONGNO(String MACONGNO,String NGAYLAP,String MAHD,String MAKH,String MANV,String DIENGIAI,double SOTIEN,double TKCO, double TKNO,String TKNO_GTGT){
        String query="INSERT CONG_NO(MACONGNO,NGAYLAP,MAHD,MAKH,MANV,DIENGIAI,SOTIEN,TKCO,TKNO,TKNO_GTGT) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, MACONGNO);
            ps.setString(2, NGAYLAP);
            ps.setString(3, MAHD);
            ps.setString(4, MAKH);
            ps.setString(5, MANV);
            ps.setString(6, DIENGIAI);
            ps.setDouble(7, SOTIEN);
            ps.setDouble(8, TKCO);
            ps.setDouble(9, TKNO);
            ps.setString(10, TKNO_GTGT);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    //--------------------------------------UPDATE------------------------------------------
    public void EditProduct(String MACONGNO,String NGAYLAP,String MAHD,String MAKH,String MANV,String DIENGIAI,double SOTIEN,double TKCO, double TKNO,String TKNO_GTGT){
        String query="UPDATE CONG_NO SET NGAYLAP=?,MAKH=?,MANV=?,DIENGIAI=?,SOTIEN=?,TKCO=?,TKNO=?,TKNO_GTGT=? WHERE MACONGNO=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);

            ps.setString(1, NGAYLAP);
            ps.setString(2, MAHD);
            ps.setString(3, MAKH);
            ps.setString(4, MANV);
            ps.setString(5, DIENGIAI);
            ps.setDouble(6, SOTIEN);
            ps.setDouble(7, TKCO);
            ps.setDouble(8, TKNO);
            ps.setString(9, TKNO_GTGT);
            ps.setString(10, MACONGNO);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    public void Editcogno(String MACONGNO,String NGAYLAP,String MAHD,String MAKH,String MANV,String DIENGIAI,double SOTIEN,double TKCO, double TKNO,String TKNO_GTGT){
        String query="UPDATE CONG_NO SET NGAYLAP=?,MAKH=?,MANV=?,DIENGIAI=?,SOTIEN=?,TKCO=?,TKNO=?,TKNO_GTGT=? WHERE MACONGNO=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);

            ps.setString(1, NGAYLAP);
            ps.setString(2, MAKH);
            ps.setString(3, MANV);
            ps.setString(4, DIENGIAI);
            ps.setDouble(5, SOTIEN);
            ps.setDouble(6, TKCO);
            ps.setDouble(7, TKNO);
            ps.setString(8, TKNO_GTGT);
            ps.setString(9, MACONGNO);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    
    
    public void Edittkno(String MACONGNO,Double TKNO){
        String query="UPDATE CONG_NO SET TKNO=? WHERE MACONGNO=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);

            ps.setDouble(1, TKNO);
            ps.setString(2, MACONGNO);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    //--------------------------------------DELETE------------------------------------------
    public void  delete(String id){
        String query="DELETE FROM CONG_NO where  MAHD=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    //--------------------------------------TIMKIEM------------------------------------------

    public List<congno> getTimkiem(String name1 ,String name2 ) {
        List <congno> list=new ArrayList<>();
        String query = "Select * From CONG_NO WHERE MACONGNO like '"+name1+"' or  MAHD like '"+name2+"'";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new congno(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)));
            }
        } catch (Exception e) {
        }

        return list;
    }


     
    //--------------------------------------PHANTRANG------------------------------------------
     //đếm số row trong db và chia mỗi trang có 6 csdl hoặc hơn.
    public int getCount(){
        String query = "select COUNT(*) FROM CONG_NO";
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
    public List<congno> getPaging(int index){
        String query="Select * From CONG_NO ORDER BY MAKH OFFSET ? ROWS FETCH FIRST 5 ROWS ONLY";
        List <congno> list=new ArrayList<>();
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add( new congno(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)));
            }
        } catch (Exception e) {
        }
         return list;
    }



     public static void main(String[] args) {
        DAOCONGNO dao = new DAOCONGNO();

        String a="1";
        dao.insertCONGNO("CN00008", "06/02/2022", "HD00004", "KH00003", "NV00001", "2", 0, 0, 0, "0");
//       List<congno> pid=dao.getTiennoMakhSotien("HD00004");
//       for (congno o : pid) {
//       
//            System.out.println(0);
//        }}

     }}
