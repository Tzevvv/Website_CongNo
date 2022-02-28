/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOHANGHOA;
import entity.Khachhang;
import entity.hanghoa;
import entity.loaihang;
import entity.hanghoachitiet;
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
@WebServlet(name = "HangHoaControl", urlPatterns = {"/hanghoa"})
public class HangHoaControl extends HttpServlet {

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
        
        
        
        String mahang=request.getParameter("mahang");
        String loaihang=request.getParameter("loaihang");
        String donvitinh=request.getParameter("donvitinh");
        String tenhang=request.getParameter("tenhang");
        String soluongnhap=request.getParameter("soluongnhap");
        String tinhnang=request.getParameter("tinhnang");
        String gianhap=request.getParameter("gianhap");
        String giaxuat=request.getParameter("giaxuat");
        String tylechietkhau=request.getParameter("tilechietkhau");
        String soluongton=request.getParameter("soluongtondauky");
        
        DAOHANGHOA dao=new DAOHANGHOA();
        
        List<loaihang> LHang=dao.getAllLoaihang();
        request.setAttribute("loaihang", LHang);
        
        String maxid=dao.getHangHoaMaxID();
        request.setAttribute("maxID", maxid);
        
        
        if(index ==null){index="1";}
        int indexPase=Integer.parseInt(index);
        int indexPaseLui=indexPase-1;
        int indexPaseTien=indexPase+1;
        List<hanghoachitiet> listup = dao.getPaging(indexPase);
        int count =dao.getCountHanghoa();
        request.setAttribute("listAllHH", listup);
        request.setAttribute("andP", count);
        request.setAttribute("tag", index);
        request.setAttribute("listLui", indexPaseLui);
        request.setAttribute("listTien", indexPaseTien);
        
        
        if (edit==null || edit.equals("")) {
        }else{
            hanghoa hh =dao.getHANGHOADetailID(edit);
            hanghoachitiet hhct =dao.getCHITIETDetailID(edit);
            request.setAttribute("detailHH", hh);
            request.setAttribute("detailHHCT", hhct);
            request.getRequestDispatcher("hanghoa.jsp").forward(request, response);
        }
        
        if (action==null || action.equals("")) {
             request.getRequestDispatcher("hanghoa.jsp").forward(request, response);
        }
        
        
        
        switch(action){
            case "add":
                    dao.insertHangHoa(mahang, tenhang, giaxuat, gianhap, soluongton, soluongnhap);
                    dao.insertChiTietHangHoa(mahang, loaihang, tinhnang, donvitinh, tylechietkhau);
                    response.sendRedirect("hanghoa");
                break;
                
            case "edit":
                    dao.EditHangHoa(mahang, tenhang, giaxuat, gianhap, soluongton, soluongnhap);
                    dao.EditHangHoaCT(mahang, loaihang, tinhnang, donvitinh, tylechietkhau);
                    response.sendRedirect("hanghoa");
                break;
                
            case "del":
                dao.deletehanghoachitiet(delete);
                dao.deletehanghoa(delete);
                response.sendRedirect("hanghoa");
                break;
            
            case "search":
                List<hanghoachitiet> search =dao.getTimkiemMa(mahang, tenhang);
               
                
                
                 if(search.isEmpty()) {
                     request.setAttribute("txtthongbao","Không tìm thấy kết quả");
                     request.getRequestDispatcher("hanghoa.jsp").forward(request, response);
                     response.sendRedirect("hanghoa");
                }else{
                      request.setAttribute("listAllHH", search);
                      request.setAttribute("txtthongbao","Tìm kiếm thành công");
                      request.getRequestDispatcher("hanghoa.jsp").forward(request, response);
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
