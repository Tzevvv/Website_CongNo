/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

 
import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
 


import context.DBContext;
import entity.Khachhang;
import entity.danhsachcongno;
import entity.thongkecongnochitiet;
import entity.thongkenhatky;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAOTHONGKE {
     Connection conn = null;
     PreparedStatement ps = null;
     ResultSet rs = null;
     
     
     
     
    //NHẠT KY-------------------------------------------------------------------------------
     public List<thongkenhatky> nhatky(String start ,String end){
         List <thongkenhatky> list=new ArrayList<>();
        String query = "SELECT HOADON.NGAYLAP,HOADON_CHITIET.MAHD,CHITIET_HANGHOA.TINHNANG,CONG_NO.TKNO,CONG_NO.TKCO,HOADON_CHITIET.THANHTIEN\n" +
                       "FROM HOADON,HOADON_CHITIET,HANGHOA,CONG_NO,CHITIET_HANGHOA\n" +
                       "WHERE \n" +
                       "HANGHOA.MAHANG = HOADON_CHITIET.MAHANG\n" +
                       "AND CONG_NO.MAHD=HOADON_CHITIET.MAHD\n" +
                       "AND HOADON.MAHD=HOADON_CHITIET.MAHD\n" +
                       "AND CHITIET_HANGHOA.MAHANG=HANGHOA.MAHANG\n" +
                       "AND HOADON.NGAYLAP  BETWEEN ? AND ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, start);
            ps.setString(2, end);
            rs = ps.executeQuery();
            while(rs.next()){
                 list.add( new thongkenhatky(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     
     
    public String SUMNHATKY(String start ,String end){
        String query = "SELECT SUM(CAST(THANHTIEN  AS BIGINT) ) AS [SUM]\n" +
                       "FROM HOADON_CHITIET\n" +
                       "LEFT OUTER JOIN HOADON\n" +
                       "ON HOADON_CHITIET.MAHD = HOADON.MAHD \n" +
                       "WHERE HOADON.NGAYLAP BETWEEN ? AND ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, start);
            ps.setString(2, end);
            rs = ps.executeQuery();
            while(rs.next()){
                int sumthanhtien= rs.getInt(1);
                
                String sum=String.valueOf(sumthanhtien);
                if(sum.length()==5){
                    sum = sum.substring(0, 2) + "." +sum.substring(2, sum.length());
                }
                else if(sum.length()==6){
                    sum = sum.substring(0, 3) + "." +sum.substring(3, sum.length());
                }
                else if(sum.length()==7){
                   sum = sum.substring(0, 1) + "." +sum.substring(1, sum.length());
                   sum = sum.substring(0, 5) + "." +sum.substring(5, sum.length());
                }
                else if(sum.length()==8){
                   sum = sum.substring(0, 2) + "." +sum.substring(2, sum.length());
                   sum = sum.substring(0, 6) + "." +sum.substring(6, sum.length());
                }
                else if(sum.length()==9){
                   sum = sum.substring(0, 3) + "." +sum.substring(3, sum.length());
                   sum = sum.substring(0, 7) + "." +sum.substring(7, sum.length());
                }
                else if(sum.length()==10){
                   sum = sum.substring(0, 1) + "." +sum.substring(1, sum.length());
                   sum = sum.substring(0, 5) + "." +sum.substring(5, sum.length());
                   sum = sum.substring(0, 9) + "." +sum.substring(9, sum.length());
                }
                return sum;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    
    
    //In nhật ký
     public String INNHATKY() {
         
         
          String query = "SELECT HOADON.NGAYLAP,HOADON_CHITIET.MAHD,CHITIET_HANGHOA.TINHNANG,CONG_NO.TKNO,CONG_NO.TKCO,HOADON_CHITIET.THANHTIEN\n" +
                       "FROM HOADON,HOADON_CHITIET,HANGHOA,CONG_NO,CHITIET_HANGHOA\n" +
                       "WHERE \n" +
                       "HANGHOA.MAHANG = HOADON_CHITIET.MAHANG\n" +
                       "AND CONG_NO.MAHD=HOADON_CHITIET.MAHD\n" +
                       "AND HOADON.MAHD=HOADON_CHITIET.MAHD\n" +
                       "AND CHITIET_HANGHOA.MAHANG=HANGHOA.MAHANG\n" +
                       "";
        try {
             //Blank Document
            XWPFDocument document = new XWPFDocument();
        
           //Write the Document in file system
            FileOutputStream out = new FileOutputStream(new File("NhatKy.docx"));
      
            //Bước 2: Tạo tiêu đề bài viết left

            XWPFParagraph titleleft = document.createParagraph();
            String titleL = "CONG TY TZEV-THANH";
            String titleL2 = "THANH XUAN -HA NOI";
            XWPFRun titleRunleft = titleleft.createRun();
            titleRunleft.setText(titleL);
            titleRunleft.addBreak();
            titleRunleft.setText(titleL2);

            //Bước 2: Tạo tiêu đề bài viết

            XWPFParagraph titleGraph = document.createParagraph();
            titleGraph.setAlignment(ParagraphAlignment.CENTER);
            String title = "SỔ NHẬT KÝ BÁN HÀNG ";
//            String title2 = "(Từ ngày:"+start+" - Đến ngày:"+end+" )";
            
            XWPFRun titleRun = titleGraph.createRun();
            titleRun.setBold(true);
            titleRun.setText(title);
//            titleRun.addBreak();
//            titleRun.setText(title2);
            titleRunleft.addBreak();
           
            
        
      //create table
      XWPFTable table = document.createTable();
      //create first row
      XWPFTableRow tableRowOne = table.getRow(0);
      tableRowOne.getCell(0).setText("Ngày tháng ghi");
      tableRowOne.addNewTableCell().setText("Mã hóa đơn");
      tableRowOne.addNewTableCell().setText("Diễn giải");
      tableRowOne.addNewTableCell().setText("Ghi nợ");
      tableRowOne.addNewTableCell().setText("Ghi có");
      tableRowOne.addNewTableCell().setText("Số tiền");
      
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
//            ps.setString(1, start);
//            ps.setString(2, end);
            rs = ps.executeQuery();
             while(rs.next()){
                String nl= rs.getString(1);
                String mahd= rs.getString(2);
                String tinhng= rs.getString(3);
                String tkno= rs.getString(4);
                String tkco= rs.getString(5);
                String thanhtien= rs.getString(6);
                
                XWPFTableRow tableRowTwo = table.createRow();
                table.getRow(0).getCell(0).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(2000));
                table.getRow(0).getCell(1).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(2000));
                table.getRow(0).getCell(2).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(2000));
                table.getRow(0).getCell(3).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(2000));
                table.getRow(0).getCell(4).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(2000));
                table.getRow(0).getCell(5).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(2000));
                
                tableRowTwo.getCell(0).setText(" "+nl+" ");
                tableRowTwo.getCell(1).setText(" "+mahd+" ");
                tableRowTwo.getCell(2).setText(" "+tinhng+" ");
                tableRowTwo.getCell(3).setText(" "+tkno+" ");
                tableRowTwo.getCell(4).setText(" "+tkco+" ");
                tableRowTwo.getCell(5).setText(" "+thanhtien+" ");
                
             }
             
             
//             
//            XWPFParagraph tt = document.createParagraph();
//            tt.setAlignment(ParagraphAlignment.RIGHT);
//            String tong = "Tông tiền :"+tongtien+" VNĐ";
//            XWPFRun tRun = tt.createRun();
//            titleRunleft.addBreak();
//            tRun.setText(tong);
//            
            document.write(out);
            out.close();
            
            System.out.println("dao.DAOTHONGKE.INNHATKY()");
            return "xXXX";
            
            
        } catch (Exception e) {
        }
    
      return null;
     }
    
    
    //DANH SACH CONG NO-------------------------------------------------------------
    public List<danhsachcongno> congno_dau(String start ,String end){
         List <danhsachcongno> list=new ArrayList<>();
        String query = "SELECT CONG_NO.MAKH,KHACHHANG.TENKH,TKNO AS TKNO_DAUKY ,TKCO AS TKCO_DAUKY \n" +
                       "FROM CONG_NO ,KHACHHANG\n" +
                       "WHERE KHACHHANG.MAKH=CONG_NO.MAKH\n" +
                       "AND MACONGNO IN (SELECT  MIN(MACONGNO) FROM CONG_NO GROUP BY MAKH) \n" +
                       "AND  NGAYLAP BETWEEN ? AND ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, start);
            ps.setString(2, end);
            rs = ps.executeQuery();
            while(rs.next()){
                 list.add( new danhsachcongno(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<danhsachcongno> congno_cuoi(String start ,String end){
         List <danhsachcongno> list=new ArrayList<>();
        String query = "SELECT SUM(TKNO)AS TKNO_CUOIKY,SUM(TKCO) AS TKCO_CUOIKY \n" +
                       "FROM CONG_NO \n" +
                       "WHERE NGAYLAP BETWEEN ? AND ?\n" +
                       "GROUP BY MAKH";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, start);
            ps.setString(2, end);
            rs = ps.executeQuery();
            while(rs.next()){
                 list.add( new danhsachcongno(
                       
                        rs.getInt(1),
                        rs.getInt(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
     //CHI TIẾT CONG NO-------------------------------------------------------------
    public List<thongkecongnochitiet> congnoCHITIET(String id ,String name){
         List <thongkecongnochitiet> list=new ArrayList<>();
        String query = "SELECT CONG_NO.NGAYLAP,CONG_NO.MAHD,CONG_NO.DIENGIAI,HOADON.TIENHANG,CONG_NO.TKCO\n" +
                       "FROM CONG_NO,KHACHHANG,HOADON\n" +
                       "WHERE KHACHHANG.MAKH=CONG_NO.MAKH\n" +
                       "AND HOADON.MAHD=CONG_NO.MAHD\n" +
                       "AND KHACHHANG.MAKH=? AND KHACHHANG.TENKH=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);
            rs = ps.executeQuery();
            while(rs.next()){
                 list.add( new thongkecongnochitiet(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
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
    
     
     
//      public static void main(String[] args) throws IOException {
//        DAOTHONGKE dao = new DAOTHONGKE();
//        
//        String a="1";
//        dao.INNHATKY();
////        String pid=dao.SUMNHATKY("2021-11-1","2021-11-1");
//        
////            System.out.println(pid);
//      }
    
}
