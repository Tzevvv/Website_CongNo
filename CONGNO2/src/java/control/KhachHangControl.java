/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOKHACHHANG;
import entity.Khachhang;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
@WebServlet(name = "KhachHangControl", urlPatterns = {"/khachhang"})
public class KhachHangControl extends HttpServlet {

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
            action="delete";
        }
        
        
        String makhach=request.getParameter("makhach");
        String tenkhach=request.getParameter("tenkhach");
        String diachi=request.getParameter("diachi");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String mathue=request.getParameter("mathue");
        String phaithudauky=request.getParameter("phaithudauky");
        String dathudauky=request.getParameter("dathudauky");
        DAOKHACHHANG dao = new DAOKHACHHANG();
        
        
        
        
        if(index ==null){
            index="1";
        }
        int indexPase=Integer.parseInt(index);
        int indexPaseLui=indexPase-1;
        int indexPaseTien=indexPase+1;
        
        List<Khachhang> listup = dao.getPaging(indexPase);
        int count =dao.getCountNhanvien();
        
        List<Khachhang> listAllKH = dao.getAllKhachHang();
        request.setAttribute("listAllKH", listAllKH);

        
        String maxid=dao.getMAXID();
        request.setAttribute("maxID",maxid);
         
        
        
        request.setAttribute("listAllKH", listup);
        request.setAttribute("andP", count);
        request.setAttribute("tag", index);
        request.setAttribute("listLui", indexPaseLui);
        request.setAttribute("listTien", indexPaseTien);
        
        
        if (edit==null || edit.equals("")) {
        }else{
            Khachhang kh =dao.getKhachHangByDetailID(edit);
            request.setAttribute("detail", kh);
            request.getRequestDispatcher("khachhang.jsp").forward(request, response);
        }
        
       
        
        
        if (action==null || action.equals("")) {
           request.getRequestDispatcher("khachhang.jsp").forward(request, response);
        }
        
       
        switch(action){
            case "add":
                 dao.insertkhachhang(makhach, tenkhach, diachi, phone, email, mathue, phaithudauky,dathudauky);
                 response.sendRedirect("khachhang");
                     
                break;
                
            case "edit":
                dao.EditProduct(makhach, tenkhach, diachi, phone, email, mathue, phaithudauky,dathudauky);
                response.sendRedirect("khachhang");
                    
                break;
            case "delete":
                if (delete==null || delete.equals("")) {
                   request.setAttribute("txtthongbao","Xóa thất bại");
                   request.getRequestDispatcher("khachhang.jsp").forward(request, response);
                }
                else{
                  dao.deletekhachhang(delete);
                  response.sendRedirect("khachhang");
                }
                break;
            
            case "search":
                List<Khachhang> search =dao.getTimkiemMakh(makhach, mathue, tenkhach ,phone );
                if(search.isEmpty()) {
                     request.setAttribute("txtthongbao","Không tìm thấy kết quả");
                     request.getRequestDispatcher("khachhang.jsp").forward(request, response);
                     response.sendRedirect("khachhang");
                }else{
                     request.setAttribute("listAllKH", search);
                     request.setAttribute("txtthongbao","Tìm kiếm thành công");
                     request.getRequestDispatcher("khachhang.jsp").forward(request, response);
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
