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
@WebServlet(name = "ThongkeControl", urlPatterns = {"/thongke"})
public class ThongkeControl extends HttpServlet {

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
        String btn=request.getParameter("btn");
        String index=request.getParameter("index");
        String edit=request.getParameter("edit");
        String delete=request.getParameter("delete");
        String timkiem=request.getParameter("search");
        
        String A=request.getParameter("A");
        String B=request.getParameter("B");
        
        DAOTHONGKE dao=new DAOTHONGKE();
        
        List<Khachhang> khachhang = dao.getAllKhachHang();
        request.setAttribute("khachhang", khachhang);
        

               
                
                
        
        
        if (action==null || action.equals("")) {
             request.getRequestDispatcher("thongke.jsp").forward(request, response);
        }
        switch(action){
            case "search": 
                List<thongkenhatky> nhatky=dao.nhatky(A,B);
                String sumtongtien=dao.SUMNHATKY(A, B);
                request.setAttribute("nhatky", nhatky);
                request.setAttribute("sumtongtien", sumtongtien);
                request.setAttribute("A", A);
                request.setAttribute("B", B);
                request.getRequestDispatcher("thongke.jsp").forward(request, response);
                break;
            case "searchcongno": 
                List<danhsachcongno> danhsachdauu=dao.congno_dau(A,B);
                List<danhsachcongno> danhsachcuoii=dao.congno_cuoi(A,B);
                request.setAttribute("congno", danhsachdauu);
                request.setAttribute("congno2", danhsachcuoii);
                request.getRequestDispatcher("thongke.jsp").forward(request, response);
                break;
            case "searchchitiet": 
                List<thongkecongnochitiet> chitiet=dao.congnoCHITIET(A,B);
                request.setAttribute("chitiet", chitiet);
                request.getRequestDispatcher("thongke.jsp").forward(request, response);
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
