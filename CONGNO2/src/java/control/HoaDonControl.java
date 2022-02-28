/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOHOADON;
import entity.Khachhang;
import entity.hanghoa;
import entity.hanghoachitiet;
import entity.hoadonchitiet;
import entity.loaihoadon;
import entity.nhanvien;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "HoaDonControl", urlPatterns = {"/hoadon"})
public class HoaDonControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        HttpSession session=request.getSession();
        if(session.getAttribute("acc")==null){
          request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
        
       String action=request.getParameter("action");
        String index=request.getParameter("index");
        String edit=request.getParameter("edit");
        String delete=request.getParameter("delete");
        String delete2=request.getParameter("del2");
        String timkiem=request.getParameter("search");
         if (delete!=null || delete2!=null ) {
            action="del";
        }
        
        String mahoadon=request.getParameter("mahoadon");
        String loaihoadon=request.getParameter("loaihoadon");
        String makhachhang=request.getParameter("makhachhang");
        String manhanvien=request.getParameter("manhanvien");
        String ngaylap=request.getParameter("ngaylap");
        String mahang=request.getParameter("mahang");
        String soluong=request.getParameter("soluong");
        String vat=request.getParameter("vat");
        
        DAOHOADON dao=new DAOHOADON();
        //loại hóa đơn
        List<loaihoadon> loaihd = dao.getAllLoaiHOADON();
        request.setAttribute("loaihd", loaihd);
        
        //mahànghoa
         List<hanghoa> hangh = dao.getHANGHOA();
        request.setAttribute("hangh", hangh);
        
        String maxid=dao.getMAXID();
        request.setAttribute("maxID",maxid);
        
        
         List<Khachhang> LKHACHHANG=dao.getKhachHang();
        request.setAttribute("lkhachhang", LKHACHHANG);
        
        List<nhanvien> LNHANVIEN=dao.getNHANVIEN();
        request.setAttribute("lnhanvien",LNHANVIEN);
        
        
        //tổng tiền
        int sumthanhtien=dao.getSumAllThanhTien();
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
        
        
        request.setAttribute("sumtongtien", sum);
        
        
        //check mã kh
        Khachhang makh=dao.getCheckIDkh(makhachhang);
        if(makh!=null){
            request.setAttribute("txtthongbao", "Nhập sai mã khach !");
        }
        
        
        //check mã nv
        nhanvien manv=dao.getCheckIDNV(manhanvien);
        if(manv!=null){
            request.setAttribute("txtthongbao", "Nhập sai nhan vien !");
        }
        
        
        if(index ==null){index="1";}
        int indexPase=Integer.parseInt(index);
        int indexPaseLui=indexPase-1;
        int indexPaseTien=indexPase+1;
        List<hoadonchitiet> listup = dao.getPaging(indexPase);
        int count =dao.getCountHOADON();
        request.setAttribute("listAll", listup);
        request.setAttribute("andP", count);
        request.setAttribute("tag", index);
        request.setAttribute("listLui", indexPaseLui);
        request.setAttribute("listTien", indexPaseTien);
       
         
        if (edit==null || edit.equals("")) {
        }else{
            hoadonchitiet ct =dao.getCHITIETDetailID(edit);
            request.setAttribute("detail", ct);
            request.getRequestDispatcher("donhang.jsp").forward(request, response);
        }
        
        if (action==null || action.equals("")) {
             request.getRequestDispatcher("donhang.jsp").forward(request, response);
        }
       
        
        
       
        
        //tính thành tiền có vat 
        int tienhang=dao.getTienHangByID(mahang);
        int gtgt=Integer.parseInt(vat);
        int sl=Integer.parseInt(soluong);
        
       double A=tienhang*sl;
       double B=A/100;
       double C=B*gtgt;
       double thanhtien=A+C;
       
        
        switch(action){
            case "add":
                    dao.insertHOADON(mahoadon, ngaylap, makhachhang, manhanvien, tienhang, loaihoadon, vat);
                    dao.insertHOADONCHITIET(mahoadon, mahang, soluong,tienhang ,thanhtien, vat);
//                    dao.EditSLXUAT(mahang);
                    response.sendRedirect("hoadon");
                     
                break;
                
            case "edit":
                 dao.Edit(mahoadon, ngaylap, makhachhang, manhanvien, tienhang, loaihoadon, vat);
                 dao.EditCT(mahoadon, mahang, soluong,tienhang ,thanhtien, vat);
                 response.sendRedirect("hoadon");
                break;
             }
        
        

        
        
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
