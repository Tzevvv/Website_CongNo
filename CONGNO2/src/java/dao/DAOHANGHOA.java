
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
import entity.loaihang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAOHANGHOA {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    //-----------------------------SELECT---------------------------------------
    
    //in ra dan sách khách hàng
    public List<loaihang> getAllLoaihang() {
        List<loaihang> list = new ArrayList<>();
        String query = "SELECT * FROM LOAIHANG ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new loaihang(
                        rs.getString(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
     
     
     public hanghoa getHANGHOADetailID(String id) {
        String query = "SELECT * FROM HANGHOA WHERE MAHANG= ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new hanghoa(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
     public hanghoachitiet getCHITIETDetailID(String id) {
        String query = "SELECT * FROM CHITIET_HANGHOA WHERE MAHANG= ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new hanghoachitiet(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
     
     
    public String  getHangHoaMaxID() {
        String query = "SELECT MAX(right(MAhang,5)) FROM HANGHOA";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               int max= rs.getInt(1);
               
               if(max < 9){
                  max=max+1;
                  String id="HH0000"+String.valueOf(max);
                  return id;
               } 
               else if(max < 99){
                  max=max+1;
                  String id="HH000"+String.valueOf(max);
                  return id;
               }
               else if(max < 999){
                  max=max+1;
                  String id="HH00"+String.valueOf(max);
                  return id;
               }
               else if(max < 9999){
                  max=max+1;
                  String id="HH0"+String.valueOf(max);
                  return id;
               }
               else if(max < 99999){
                  max=max+1;
                  String id="HH"+String.valueOf(max);
                  return id;
               }
                                
            }
               
        } catch (Exception e) {
        }
        return null;
    }
    
    
    //-----------------------------INSERT---------------------------------------
    //Thêm khach hàng
    public void insertHangHoa(String mahang, String tenhang,String dongia ,String gianhap ,String tondau , String slnhap){
        String query="INSERT INTO HANGHOA (MAHANG ,TENHANG ,DONGIA ,GIANHAP ,TONDAU ,TONCUOI ,SLNHAP,SLXUAT) VALUES(?,?,?,?,?,0,?,0)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, mahang);
            ps.setString(2, tenhang);
            ps.setString(3, dongia);
            ps.setString(4, gianhap);
            ps.setString(5, tondau);
            ps.setString(6, slnhap);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public void insertChiTietHangHoa(String mahang,String maloai,String tinhnang ,String dvt,String vat){
        String query="INSERT INTO CHITIET_HANGHOA(MAHANG ,MALOAIHANG,TINHNANG,DVT,TILE_GTGT) VALUES(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, mahang);
            ps.setString(2, maloai);
            ps.setString(3, tinhnang);
            ps.setString(4, dvt);
            ps.setString(5, vat);

            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    //-----------------------------UPDATE---------------------------------------
    
    public void EditHangHoa(String mahang, String tenhang,String dongia ,String gianhap ,String tondau , String slnhap){
        String query="UPDATE HANGHOA SET TENHANG=? ,DONGIA=? ,GIANHAP=? ,TONDAU=? ,SLNHAP=?  WHERE MAHANG=? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, tenhang);
            ps.setString(2, dongia);
            ps.setString(3, gianhap);
            ps.setString(4, tondau);
            ps.setString(5, slnhap);
            ps.setString(6, mahang);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public void EditHangHoaCT(String mahang,String maloai,String tinhnang ,String dvt,String vat){
        String query="UPDATE CHITIET_HANGHOA SET MALOAIHANG=? ,TINHNANG=? ,DVT=? ,TILE_GTGT=? WHERE MAHANG= ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, maloai);
            ps.setString(2, tinhnang);
            ps.setString(3, dvt);
            ps.setString(4, vat);
            ps.setString(5, mahang);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    
    //-----------------------------DELETE---------------------------------------
    public void  deletehanghoa(String id){
        String query="DELETE FROM HANGHOA where  MAHANG=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public void  deletehanghoachitiet(String id){
        String query="DELETE FROM CHITIET_HANGHOA where MAHANG=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    //-----------------------------PHANTRANG------------------------------------
    //đếm số row trong db và chia mỗi trang có 6 csdl hoặc hơn.
    public int getCountHanghoa(){
        String query = "select COUNT(*) FROM CHITIET_HANGHOA";
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
    public List<hanghoachitiet> getPaging(int index){
        List<hanghoachitiet> list = new ArrayList<>();
        String query = "SELECT HANGHOA.MAHANG,CHITIET_HANGHOA.MALOAIHANG,CHITIET_HANGHOA.DVT,HANGHOA.TENHANG,CHITIET_HANGHOA.TINHNANG,HANGHOA.SLNHAP,HANGHOA.GIANHAP,HANGHOA.DONGIA,CHITIET_HANGHOA.TILE_GTGT,HANGHOA.TONDAU,HANGHOA.SLXUAT\n" +
                       "FROM CHITIET_HANGHOA \n" +
                       "LEFT OUTER JOIN HANGHOA\n" +
                       "ON HANGHOA.MAHANG = CHITIET_HANGHOA.MAHANG \n" +
                       "ORDER BY MAHANG OFFSET ? ROWS FETCH FIRST 25 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
             ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new hanghoachitiet(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    //-----------------------------TIMKIEM--------------------------------------
    
    public List<hanghoachitiet> getTimkiemMa(String id ,String name ) {
        List <hanghoachitiet> list=new ArrayList<>();
        String query = "SELECT HANGHOA.MAHANG,CHITIET_HANGHOA.MALOAIHANG,CHITIET_HANGHOA.DVT,HANGHOA.TENHANG,CHITIET_HANGHOA.TINHNANG,HANGHOA.SLNHAP,HANGHOA.GIANHAP,HANGHOA.DONGIA,CHITIET_HANGHOA.TILE_GTGT,HANGHOA.TONDAU,HANGHOA.SLXUAT\n" +
                       "FROM CHITIET_HANGHOA \n" +
                       "LEFT OUTER JOIN HANGHOA\n" +
                       "ON HANGHOA.MAHANG = CHITIET_HANGHOA.MAHANG WHERE HANGHOA.MAHANG like '"+id+"' or HANGHOA.TENHANG like '"+name+"'";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new hanghoachitiet(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<hanghoachitiet> getTimkiemhh(String name ) {
        List <hanghoachitiet> list=new ArrayList<>();
        String query = "SELECT HANGHOA.MAHANG,CHITIET_HANGHOA.MALOAIHANG,CHITIET_HANGHOA.DVT,HANGHOA.TENHANG,CHITIET_HANGHOA.TINHNANG,HANGHOA.SLNHAP,HANGHOA.GIANHAP,HANGHOA.DONGIA,CHITIET_HANGHOA.TILE_GTGT,HANGHOA.TONDAU,HANGHOA.SLXUAT\n" +
                       "FROM CHITIET_HANGHOA \n" +
                       "LEFT OUTER JOIN HANGHOA\n" +
                       "ON HANGHOA.MAHANG = CHITIET_HANGHOA.MAHANG WHERE HANGHOA.MAHANG like '%"+name+"%' or HANGHOA.TENHANG like '%"+name+"%'";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new hanghoachitiet(
                         rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
    
    public static void main(String[] args) {
        DAOHANGHOA dao = new DAOHANGHOA();
        
       String a="1";
       List<hanghoachitiet> pid=dao.getTimkiemMa(a,"a");
        
           for (hanghoachitiet o : pid) {
            System.out.println(o);
        }}
}
