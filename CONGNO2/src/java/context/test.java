
package context;

 
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

 * @author HAITHANH

 */

public class test {   

 
    public static void main(String[] args)throws Exception {

      //Blank Document
      XWPFDocument document = new XWPFDocument();
        
      //Write the Document in file system
      FileOutputStream out = new FileOutputStream(new File("create_table.docx"));
      
      
      

            //Bước 2: Tạo tiêu đề bài viết left

            XWPFParagraph titleleft = document.createParagraph();
            String titleL = "CONG TY TZEV-THANH";
            String titleL2 = "THANH XUAN -HA NOI";
            XWPFRun titleRunleft = titleleft.createRun();
            titleRunleft.setText(titleL);
            titleRunleft.addBreak();
            titleRunleft.setText(titleL2);

            //Bước 2: Tạo tiêu đề bài viết

            XWPFParagraph titleGraph = document.createParagraph();
            titleGraph.setAlignment(ParagraphAlignment.CENTER);
            String title = "SỔ NHẬT KÝ BÁN HÀNG ";
            String title2 = "(Từ ngày: - Đến ngày: )";
            
            XWPFRun titleRun = titleGraph.createRun();
            titleRun.setBold(true);
            titleRun.setText(title);
            titleRun.addBreak();
            titleRun.setText(title2);
            
        
      //create table
      XWPFTable table = document.createTable();
		
      //create first row
      XWPFTableRow tableRowOne = table.getRow(0);
      tableRowOne.getCell(0).setText("Ngày tháng ghi");
      tableRowOne.addNewTableCell().setText("Mã hóa đơn");
      tableRowOne.addNewTableCell().setText("Diễn giải");
      tableRowOne.addNewTableCell().setText("Ghi nợ");
      tableRowOne.addNewTableCell().setText("Ghi có");
      tableRowOne.addNewTableCell().setText("Số tiền");

		
      //create second row
      XWPFTableRow tableRowTwo = table.createRow();
      tableRowTwo.getCell(0).setText("col one, row two");
      tableRowTwo.getCell(1).setText("col two, row two");
      tableRowTwo.getCell(2).setText("col three, row two");
       tableRowTwo.getCell(3).setText("col one, row two");
      tableRowTwo.getCell(4).setText("col two, row two");
      tableRowTwo.getCell(5).setText("col three, row two");
		
    
	
      document.write(out);
      out.close();
      System.out.println("ghi thành công");
   }

}