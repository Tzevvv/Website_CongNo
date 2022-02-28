
package dao;

import context.DBContext;
import entity.Khachhang;
import entity.hanghoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class DAOKHACHHANG {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    
    //--------------------------------------SELECT------------------------------------------
    
    //in ra dan sách khách hàng
    public List<Khachhang> getAllKhachHang() {
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
    
public String  getMAXID() {
        String query = "SELECT MAX(right(MAKH,5)) FROM KHACHHANG";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               int max= rs.getInt(1);
               
               if(max < 9){
                  max=max+1;
                  String id="KH0000"+String.valueOf(max);
                  return id;
               } 
               else if(max < 99){
                  max=max+1;
                  String id="KH000"+String.valueOf(max);
                  return id;
               }
               else if(max < 999){
                  max=max+1;
                  String id="KH00"+String.valueOf(max);
                  return id;
               }
               else if(max < 9999){
                  max=max+1;
                  String id="KH0"+String.valueOf(max);
                  return id;
               }
               else if(max < 99999){
                  max=max+1;
                  String id="KH"+String.valueOf(max);
                  return id;
               }
                                
            }
               
        } catch (Exception e) {
        }
        return null;
    }
    
    //--------------------------------------INSERT------------------------------------------
     //Thêm khach hàng
    public void insertkhachhang(String makhach, String tenkhach,String diachi ,String phone ,String email ,String mathue, String phaithu ,String dathu){
        String query="INSERT KHACHHANG (MAKH,TENKH,DIACHI,SDT,EMAIL,MASOTHUE,PHAITHUDAUKY,DATHUDAUKY) VALUES(?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, makhach);
            ps.setString(2, tenkhach);
            ps.setString(3, diachi);
            ps.setString(4, phone);
            ps.setString(5, email);
            ps.setString(6, mathue);
            ps.setString(7, phaithu);
            ps.setString(8, dathu);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    //--------------------------------------Detail------------------------------------------
    
    public Khachhang getKhachHangByDetailID(String id) {
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
    
    public int  getPkhachhangMaxID() {
        String query = "SELECT MAX(MAKH) FROM KHACHHANG ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               int max= rs.getInt(1);
               return max+1;
            }
               
        } catch (Exception e) {
        }
        return 0;
    }
    //--------------------------------------UPDATE------------------------------------------
     //Sửa sản phẩm
    public void EditProduct(String makhach, String tenkhach,String diachi ,String phone ,String email ,String mathue, String phaithu ,String dathu){
        String query="UPDATE KHACHHANG SET TENKH=? ,DIACHI=? ,SDT=? ,EMAIL=? ,MASOTHUE=? ,PHAITHUDAUKY=? ,DATHUDAUKY=? WHERE MAKH=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, tenkhach);
            ps.setString(2, diachi);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, mathue);
            ps.setString(6, phaithu);
            ps.setString(7, dathu);
            ps.setString(8, makhach);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    
    //--------------------------------------DELETE------------------------------------------
    public void  deletekhachhang(String id){
        String query="DELETE FROM KHACHHANG where MAKH=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    //--------------------------------------PHANTRANG---------------------------------------
    //đếm số row trong db và chia mỗi trang có 6 csdl hoặc hơn.
    public int getCountNhanvien(){
        String query = "select count(*) from khachhang";
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
    public List<Khachhang> getPaging(int index){
        String query="Select * From KHACHHANG ORDER BY MAKH OFFSET ? ROWS FETCH FIRST 5 ROWS ONLY";
        List <Khachhang> list=new ArrayList<>();
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add( new Khachhang( rs.getString(1),
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
    
    
    //--------------------------timg kiếm --------------------------------------Ư
    public List<Khachhang> getTimkiemMakh(String id ,String masothue ,String name ,String sdt) {
        List <Khachhang> list=new ArrayList<>();
        String query = "SELECT * FROM KHACHHANG WHERE MAKH like ? OR MASOTHUE like ? OR TENKH like ? OR SDT like ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, masothue);
            ps.setString(3, name);
            ps.setString(4, sdt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add( new Khachhang(
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
    public List<Khachhang> getTimkiemkhachhang(String timkiem) {
        List <Khachhang> list=new ArrayList<>();
        String query = "SELECT * FROM KHACHHANG WHERE MAKH like '%"+timkiem+"%' or TENKH like '%"+timkiem+"%'  or MASOTHUE like '%"+timkiem+"%'  or SDT like '%"+timkiem+"%'   ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add( new Khachhang(
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

    

    
    
  
    
    
    
    

    public static void main(String[] args) {
        DAOKHACHHANG dao = new DAOKHACHHANG();
        
        String a="1";
       List<Khachhang> pid=dao.getTimkiemkhachhang("99");
        for (Khachhang o : pid) {
            System.out.println(o);
        }}
        

}
