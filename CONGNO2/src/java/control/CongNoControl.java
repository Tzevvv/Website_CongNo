/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOCONGNO;
import entity.Khachhang;
import entity.congno;
import entity.hanghoa;
import entity.hanghoachitiet;
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
@WebServlet(name = "CongNoControl", urlPatterns = {"/congno"})
public class CongNoControl extends HttpServlet {

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
                     
                     
        if (edit==null || edit.equals("")) {
        }else{
            congno hh =dao.getCongnoByDetailID(edit);
            request.setAttribute("detail", hh);
             request.getRequestDispatcher("congno.jsp").forward(request, response);
        }
        if (action==null || action.equals("")) {
             request.getRequestDispatcher("congno.jsp").forward(request, response);            

        }
         if (delete!=null ) {
            action="del";
            dao.delete(delete);
            response.sendRedirect("congno");
        }
        
        switch(action){
            case "search":
                if (macongno==null & mahoadon==null) {
                     response.sendRedirect("congno");
                }
                else{
                    List<congno> search =dao.getTimkiem(macongno,mahoadon);
                    request.setAttribute("listAll", search);
                    request.getRequestDispatcher("congno.jsp").forward(request, response);            
                }
                break;
            
            case "searchone":
                break;
                
            case "del":
                 
                break;
           
             }
        
       
       
        
        //tính thành tiền có vat 
        String makhach=dao.getmakh(mahoadon);
        int tienhoadon=dao.getTienhoadon(mahoadon);
//        int gtgt=Integer.parseInt(vat);
        int tkco=Integer.parseInt(taikhoanco);
        int tkno=Integer.parseInt(taikhoanno);

        
       
        double tien=tienhoadon;
//        
//        double A= tkco/100;
//        double B= tkco-A;
        
            //tk no ==0
             double tkno01=tienhoadon-tkco;
             //Trừ tiền nợ
             double tkno02=tienhoadon-tkco;
             if (tkno02<0) {
               tkno02=0;
             }
            
             
             //tkno>0
            double tkno1=tkno-tkco;
            //Trừ tiền nợ
             double tkno2=tkno-tkco;
             if (tkno2<0) {
               tkno2=0;
             }
        
        
        
         
         
        
       
      
        
        
        switch(action){
            case "add":
                String checkma=dao.getcheck(mahoadon);
                
               // kiểm tra có nhập trùng mã hóa đơn
                if(checkma == null && tkno <= 0){
                    //kiểm tra xem tkco có lớn hơn số tiền k
                    if (tkno01 >= 0) {
                        dao.insertCONGNO(macongno,ngayghi,mahoadon,makhach,manhanvienlap,diengiai,tien,tkco,tkno01,"0");
                        //kiểm tra tkco có lớn hơn tk no hay không
                        if(tkno02 <= 0){
                            dao.Edittkno(macongno, tkno02);
                            request.setAttribute("txtthongbao", "Thành công !");
                            request.getRequestDispatcher("congno.jsp").forward(request, response);
                            response.sendRedirect("congno");
                        }else{
                            request.setAttribute("txtthongbao", "Thành công !");
                            request.getRequestDispatcher("congno.jsp").forward(request, response);
                            response.sendRedirect("congno");
                        }
                    }else{
                        request.setAttribute("txtthongbao", "Thanh toán vượt mức với số tiền hóa đơn !");
                        request.getRequestDispatcher("congno.jsp").forward(request, response);
                    }
                }
                   
                else{
                    if (tkno1 > 0) {
                        //kiểm tra tkco có lớn hơn tk no hay không
                         dao.Editcogno(macongno,ngayghi,mahoadon,makhach,manhanvienlap,diengiai,tien,tkco,tkno1,"0");
                        if(tkno02 <= 0){
                            dao.Edittkno(macongno, tkno02);
                            request.setAttribute("txtthongbao", "Thành công !");
                            request.getRequestDispatcher("congno.jsp").forward(request, response);
                            response.sendRedirect("congno");
                        }else{
                            request.setAttribute("txtthongbao", "Thành công !");
                            request.getRequestDispatcher("congno.jsp").forward(request, response);
                            response.sendRedirect("congno");
                        }
                    }else{
                        request.setAttribute("txtthongbao", "Thanh toán vượt mức với số tiền hóa đơn !");
                        request.getRequestDispatcher("congno.jsp").forward(request, response);
                    }
                }
                

                
                break;
                
            case "edit":
                
                 if (tkno1 > 0) {
                        //kiểm tra tkco có lớn hơn tk no hay không
                         dao.Editcogno(macongno,ngayghi,mahoadon,makhach,manhanvienlap,diengiai,tien,tkco,tkno1,"0");
                        if(tkno02 <= 0){
                            dao.Edittkno(macongno, tkno02);
                            request.setAttribute("txtthongbao", "Thành công !");
                            request.getRequestDispatcher("congno.jsp").forward(request, response);
                            response.sendRedirect("congno");
                        }else{
                            request.setAttribute("txtthongbao", "Thành công !");
                            request.getRequestDispatcher("congno.jsp").forward(request, response);
                            response.sendRedirect("congno");
                        }
                    }else{
                        request.setAttribute("txtthongbao", "Thanh toán vượt mức với số tiền hóa đơn !");
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
