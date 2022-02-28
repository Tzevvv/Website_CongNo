/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOTHONGKE;
import entity.Khachhang;
import entity.danhsachcongno;
import entity.thongkecongnochitiet;
import entity.thongkenhatky;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ThongkeControlIn", urlPatterns = {"/thongkein"})
public class ThongkeControlIn extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        HttpSession session=request.getSession();
//        if(session.getAttribute("acc")==null){
//          request.getRequestDispatcher("Login.jsp").forward(request, response);
//        }
//        
//         String action=request.getParameter("action");
//        String A=request.getParameter("A");
//        String B=request.getParameter("B");
//        String tongtien=request.getParameter("TONGTIEN");
//        
        
        DAOTHONGKE dao = new DAOTHONGKE();
        dao.INNHATKY();
        
       

//        String a=dao.INNHATKY();
//        request.setAttribute("txtthongbao",a);
//        request.getRequestDispatcher("thongke.jsp").forward(request, response);
                
                
        
        
        
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
