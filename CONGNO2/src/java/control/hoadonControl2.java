/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOHOADON;
import entity.Khachhang;
import entity.hanghoa;
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
@WebServlet(name = "hoadonControl2", urlPatterns = {"/hoadon2"})
public class hoadonControl2 extends HttpServlet {

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
       
        
        
        switch(action){
            case "del":
                int counthdct=dao.getCountChitiethoadon(delete2);
                if(counthdct==1){
                  dao.deletehdchitiet(delete,delete2);
                  dao.deletehd(delete2);
                  
                  response.sendRedirect("hoadon");
                }else{
                    dao.deletehdchitiet(delete,delete2);
                    response.sendRedirect("hoadon");
                }

                
                break;
            case "search":
                List<hoadonchitiet> search =dao.getTimkiemMa(mahoadon,loaihoadon,ngaylap);
                if(search.isEmpty()) {
                     request.setAttribute("txtthongbao","Không tìm thấy kết quả");
                     request.getRequestDispatcher("donhang.jsp").forward(request, response);
                     response.sendRedirect("hoadon");
                }else{
                      request.setAttribute("listAll", search);
                      request.setAttribute("txtthongbao","Tìm kiếm thành công");
                      request.getRequestDispatcher("donhang.jsp").forward(request, response);
                }
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
