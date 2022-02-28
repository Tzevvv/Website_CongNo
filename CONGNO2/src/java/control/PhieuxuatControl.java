/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOPHIEUXUAT;
import entity.Khachhang;
import entity.hoadonchitiet;
import entity.loaihang;
import entity.nhanvien;
import entity.phieuxuat;
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
@WebServlet(name = "PhieuxuatControl", urlPatterns = {"/phieuxuat"})
public class PhieuxuatControl extends HttpServlet {

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
        
        
        String maphieuxuat=request.getParameter("maphieuxuat");
        String mahoadon=request.getParameter("mahoadon");
        String makhachhang=request.getParameter("makhachhang");
        String manhanvienlap=request.getParameter("manhanvienlap");
        String ngaylap=request.getParameter("ngaylap");
        String diengiai=request.getParameter("diengiai");
        
        DAOPHIEUXUAT dao=new DAOPHIEUXUAT();
        
        int soluong_hoadon= dao.getChitietsoluongHoadon(mahoadon);
        
        
        List<hoadonchitiet> LHOADON=dao.getHOADON();
        request.setAttribute("lhoadon", LHOADON);
        
        List<Khachhang> LKHACHHANG=dao.getKhachHang();
        request.setAttribute("lkhachhang", LKHACHHANG);
        
        List<nhanvien> LNHANVIEN=dao.getNHANVIEN();
        request.setAttribute("lnhanvien",LNHANVIEN);
        
        String maxid=dao.getMAXID();
        request.setAttribute("maxID",maxid);
        
        hoadonchitiet detaihoadonchitiet=dao.getDETAIHOADON(mahoadon);
        
        
        
        if(index ==null){index="1";}
        int indexPase=Integer.parseInt(index);
        int indexPaseLui=indexPase-1;
        int indexPaseTien=indexPase+1;
        List<phieuxuat> listup = dao.getPaging(indexPase);
        int count =dao.getCount();
        request.setAttribute("listAllPX", listup);
        request.setAttribute("andP", count);
        request.setAttribute("tag", index);
        request.setAttribute("listLui", indexPaseLui);
        request.setAttribute("listTien", indexPaseTien);
        
         if (action==null || action.equals("")) {
             request.getRequestDispatcher("phieuxuat.jsp").forward(request, response);
        }
        
       
        if (delete!=null ) {
            action="del";
            
        }
        
        switch(action){
            case "del":
                dao.deletechitiet(delete);
                dao.delete(delete);
                response.sendRedirect("phieuxuat");
                break;
            case "add":
                    dao.insertPhieuxuat(maphieuxuat, mahoadon, makhachhang, manhanvienlap, ngaylap, String.valueOf(detaihoadonchitiet.getThanhtien()), diengiai);
                    dao.insertPhieuxuat_Chitiet(maphieuxuat, String.valueOf(detaihoadonchitiet.getMahang()), String.valueOf(detaihoadonchitiet.getSoluong()), String.valueOf(detaihoadonchitiet.getDongia()), String.valueOf(detaihoadonchitiet.getThanhtien()));
                    dao.EditSLXUAT(mahoadon,soluong_hoadon);
                    response.sendRedirect("phieuxuat");
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
