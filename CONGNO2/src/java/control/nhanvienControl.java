/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOLOGIN;
import entity.Khachhang;
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
@WebServlet(name = "nhanvienControl", urlPatterns = {"/nhanvien"})
public class nhanvienControl extends HttpServlet {

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
        
         //lấy dữ liệu tại form
        String action=request.getParameter("action");
         String edit=request.getParameter("edit");
        String delete=request.getParameter("delete");
        if (delete!=null ) {
            action="del";
        }
        
        String manv=request.getParameter("manv");
        String tennv=request.getParameter("tennv");
        String diachi=request.getParameter("diachi");
        String sdt=request.getParameter("sdt");
        String cmt=request.getParameter("cmt");
        
        String username=request.getParameter("user");
        String password=request.getParameter("pass");
        String re_pass=request.getParameter("repass");
        String phanquyen=request.getParameter("phanquyen");
        
        
        DAOLOGIN dao=new DAOLOGIN();
        
        String maxid=dao.getMAXID();
        request.setAttribute("maxid",maxid);
        
        List<nhanvien> listup = dao.nhanvien();
        request.setAttribute("listAllKH", listup);
        
         if (edit==null || edit.equals("")) {
        }else{
            nhanvien nv =dao.getnhanvienByDetailID(edit);
            request.setAttribute("detail", nv);
            request.getRequestDispatcher("nhanvien.jsp").forward(request, response);
        }
        
        
        if (action==null || action.equals("")) {
             request.getRequestDispatcher("nhanvien.jsp").forward(request, response);
        }else{
            switch(action){
                case "singup":
                    //nếu pass khác re_pass thì đẩy lại về trang login nếu k thì chuyển sang đăng nhập
                    if (!password.equals(re_pass)) {
                        request.setAttribute("txtthongbao", "Mật khẩu nhập lại không trùng nhau");
                        request.getRequestDispatcher("nhanvien.jsp").forward(request, response);
                    }else{
                        nhanvien b=dao.checkAccountExit(username);
            
                        //kiểm tra tồn tại chưa : nếu a=null thì cho đăng ký nếu k thì đẩy về login
                        if (b==null) {
                            dao.Singup(manv, tennv, diachi, sdt, cmt, username, password,phanquyen);
                            request.setAttribute("txtthongbao", "Đăng ký thành công vui lòng đăng nhập ");
                            response.sendRedirect("nhanvien");
                        }else{
                           
                           request.setAttribute("txtthongbao", "Tài khoản đã tồn tại ");
                           request.getRequestDispatcher("nhanvien.jsp").forward(request, response);
                        }
                    }
                    break;
                case "del":
                    dao.deletenhanvien(delete);
                    response.sendRedirect("nhanvien");
                    break;
                    
                case "edit":
                    dao.Edit(manv, tennv, diachi, sdt, cmt, re_pass, phanquyen);
                    response.sendRedirect("nhanvien");
                    break;

            }
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
