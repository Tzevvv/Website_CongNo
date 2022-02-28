/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOCONGNO;
import entity.Khachhang;
import entity.congno;
import entity.hoadonchitiet;
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
@WebServlet(name = "CongNoControl2", urlPatterns = {"/congno2"})
public class CongNoControl2 extends HttpServlet {

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
        String timkiem=request.getParameter("search");
         if (delete!=null ) {
            action="del";
           
        }
        
        String macongno=request.getParameter("macongno");
        String mahoadon=request.getParameter("mahoadon");
        String makhachhang=request.getParameter("makhachhang");
        String manhanvienlap=request.getParameter("manhanvienlap");
        String diengiai=request.getParameter("diengiai");
        String sotien=request.getParameter("sotien");
        String taikhoanco=request.getParameter("taikhoanco");
        String ngayghi=request.getParameter("ngayghi");
        String taikhoanno=request.getParameter("taikhoanno");
        String vat=request.getParameter("vat");
        
        
        
        
        
        
        DAOCONGNO dao=new DAOCONGNO();
        
        List<hoadonchitiet> LHOADON=dao.getHOADON();
        request.setAttribute("lhoadon", LHOADON);
        
        List<Khachhang> LKHACHHANG=dao.getKhachHang();
        request.setAttribute("lkhachhang", LKHACHHANG);
        
        List<nhanvien> LNHANVIEN=dao.getAllNhanVien();
        request.setAttribute("lnhanvien",LNHANVIEN);
        
        //MAX ID
         String maxid=dao.getPkMaxID();
         request.setAttribute("maxID", maxid);
        
        
        if(index ==null){index="1";}
        int indexPase=Integer.parseInt(index);
        int indexPaseLui=indexPase-1;
        int indexPaseTien=indexPase+1;
        List<congno> listup = dao.getPaging(indexPase);
        int count =dao.getCount();
        request.setAttribute("listAll", listup);
        request.setAttribute("andP", count);
        request.setAttribute("tag", index);
        request.setAttribute("listLui", indexPaseLui);
        request.setAttribute("listTien", indexPaseTien);
                     
                     
        if (action==null || action.equals("")) {
             request.getRequestDispatcher("congno.jsp").forward(request, response);            

        }
        
        
        switch(action){
           
            
            case "del":
                dao.delete(delete);
                response.sendRedirect("congno");
                break;
                
                
             case "search":
                
                List<congno> search =dao.getTimkiem(macongno,mahoadon);
                if(search.isEmpty()) {
                     request.setAttribute("txtthongbao","Không tìm thấy kết quả");
                     request.getRequestDispatcher("congno.jsp").forward(request, response); 
                     response.sendRedirect("congno");
                }else{
                      request.setAttribute("listAll", search);
                      request.setAttribute("txtthongbao","Tìm kiếm thành công");
                      request.getRequestDispatcher("congno.jsp").forward(request, response);     
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
