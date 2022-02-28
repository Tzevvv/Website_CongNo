/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAOCONGNO;
import dao.DAOPHIEUTHU;
import entity.Khachhang;
import entity.hoadonchitiet;
import entity.nhanvien;
import entity.phieuthu;
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
@WebServlet(name = "PhieuthuControl", urlPatterns = {"/phieuthu"})
public class PhieuthuControl extends HttpServlet {

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
        String delete=request.getParameter("delete1");
        String timkiem=request.getParameter("search");
        
        String macongno=request.getParameter("macongno");
        String maphieuthu=request.getParameter("maphieuthu");
        String mahoadon=request.getParameter("mahoadon");
        String makhachhang=request.getParameter("makhachhang");
        String manhanvien=request.getParameter("manhanvien");
        String diengiai=request.getParameter("diengiai");
        String sotien=request.getParameter("sotien");
        String taikhoanco=request.getParameter("taikhoanco");
        String ngaynghi=request.getParameter("ngaynghi");
        String taikhoanno=request.getParameter("taikhoanno");
        String vat=request.getParameter("vat");
        
        
        DAOPHIEUTHU dao=new DAOPHIEUTHU();
        
         List<hoadonchitiet> LHOADON=dao.getHOADON();
        request.setAttribute("lhoadon", LHOADON);
        
        List<Khachhang> LKHACHHANG=dao.getKhachHang();
        request.setAttribute("lkhachhang", LKHACHHANG);
        
        List<nhanvien> LNHANVIEN=dao.getNHANVIEN();
        request.setAttribute("lnhanvien",LNHANVIEN);
        
        String maxid=dao.getMAXID();
        request.setAttribute("maxID",maxid);
        
        
        if(index ==null){index="1";}
        int indexPase=Integer.parseInt(index);
        int indexPaseLui=indexPase-1;
        int indexPaseTien=indexPase+1;
        List<phieuthu> listup = dao.getPaging(indexPase);
        int count =dao.getCount();
        request.setAttribute("listAll", listup);
        request.setAttribute("andP", count);
        request.setAttribute("tag", index);
        request.setAttribute("listLui", indexPaseLui);
        request.setAttribute("listTien", indexPaseTien);
        
        
        
        if (action==null || action.equals("")) {
             request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
        }
        
        DAOCONGNO daocn=new DAOCONGNO();
        
        
        if (delete!=null ) {
             dao.delete(delete);
             daocn.delete(delete);
             response.sendRedirect("phieuthu");
        }
        
        //MAX ID CN
         String maxidcn=daocn.getPkMaxID();
         request.setAttribute("maxIDCN", maxidcn);
        
        //tính thành tiền có vat 
        String makhach=dao.getmakh(mahoadon);
        int tienhoadon=dao.getTienhoadon(mahoadon);
        int tkco=Integer.parseInt(taikhoanco);
        int tkno=Integer.parseInt(taikhoanno);
        double tien=tienhoadon;
        
        double no=tienhoadon-tkco;
        if(no<0){
            no=0;
        }
        
        double no2=tkno-tkco;
        if(no2<0){
            no=0;
        }
        
        
        
        
        
         
        
        
        switch(action){
           
            case "add":
                
                   //tính thành tiền có vat 
//               String makhach=dao.getmakh(mahoadon);
//               int tienhoadon=dao.getTienhoadon(mahoadon);
//               int gtgt=Integer.parseInt(vat);
//               int tkco=Integer.parseInt(taikhoanco);
//               
//               int tien=tienhoadon;
//               int A= tkco/100;
//               int B= tkco-A;
//               int tkno=tienhoadon-B;
//                
//                
//                if(dao.getCheck(maphieuthu)!=null){
//                    request.setAttribute("txtthongbao", "xxx");
//                    request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
//                }else{
//                    dao.insertCONGNO(macongno,ngayghi,mahoadon,makhach,manhanvienlap,diengiai,tien,tkco,tkno01,"0");
//                    dao.insertPhieuthu(maphieuthu, mahoadon,makhach,ngaynghi,diengiai, tien,manhanvien,B,tkno, "0 ");
//                    response.sendRedirect("phieuthu");
//                }
                
                
                
                String checkma=daocn.getcheck(mahoadon);
                String checkma2=dao.getcheck(mahoadon);
                
               // kiểm tra có nhập trùng mã hóa đơn
                if(checkma == null && checkma2 == null && tkno <= 0){
                    
                    if (no > 0) {
                        if(tkco<=tkno){
                            daocn.insertCONGNO(macongno,ngaynghi,mahoadon,makhach,manhanvien,diengiai,tien,tkco,no,"0");
                            dao.insertPhieuthu(maphieuthu, mahoadon,makhach,ngaynghi,diengiai, tien,manhanvien,no,tkco, "0 ");
                            request.setAttribute("txtthongbao", " Lập phiếu thu và công nợ thành công !");
                            request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                            response.sendRedirect("phieuthu");
                        }else{
                            request.setAttribute("txtthongbao", " Lập phiếu thu không thành công. Do tài khoản có lớn hơn tài khoản nợ !");
                            request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                        }
                    }else if(no == 0){
                        if(tkco<=tkno){
                            daocn.delete(macongno);
                            dao.insertPhieuthu(maphieuthu, mahoadon,makhach,ngaynghi,diengiai, tien,manhanvien,no,tkco, "0 ");
                            request.setAttribute("txtthongbao", " Lập phiếu thu thành công. Số tiền nợ của hóa đơn đã hêt !");
                            request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                            response.sendRedirect("phieuthu");
                        }else{
                            request.setAttribute("txtthongbao", " Lập phiếu thu không thành công. Do tài khoản có lớn hơn tài khoản nợ !");
                            request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                        }
                    }else {
                       request.setAttribute("txtthongbao", " Lập phiếu thu không thành công. Do tài khoản có lớn hơn số tiền của hóa đơn !");
                       request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                    }
                }
                
                
                
                else{
                    if (no > 0) {
                        if(tkco <= tkno){
                            daocn.Editcogno(macongno,ngaynghi,mahoadon,makhach,manhanvien,diengiai,tien,tkco,no2,"0");
                            dao.Editphieuthu(maphieuthu, mahoadon, makhach, ngaynghi, diengiai, tien, manhanvien, no2,tkco, macongno);
                            request.setAttribute("txtthongbao", " Sửa phiếu thu và công nợ thành công !");
                            request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                            response.sendRedirect("phieuthu");
                        }else{
                            request.setAttribute("txtthongbao", " Sửa phiếu thu không thành công. Do tài khoản có lớn hơn tài khoản nợ !");
                            request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                        }
                    }else if(no == 0){
                        if(tkco<=tkno){
                            daocn.delete(macongno);
                            dao.Editphieuthu(maphieuthu, mahoadon, makhach, ngaynghi, diengiai, tien, manhanvien, no2 ,tkco, macongno);
                            request.setAttribute("txtthongbao", " sửa phiếu thu thành công . Số tiền nợ của hóa đơn đã hêt  !");
                            request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                            response.sendRedirect("phieuthu");
                        }else{
                            request.setAttribute("txtthongbao", " sửa phiếu thu không thành công. Do tài khoản có lớn hơn tài khoản nợ !");
                            request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                        }
                    }else {
                       request.setAttribute("txtthongbao", " sửa phiếu thu không thành công. Do tài khoản có lớn hơn số tiền của hóa đơn !");
                       request.getRequestDispatcher("phieuthu.jsp").forward(request, response);
                    }
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
