package apachePoi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch {
	public static void main(String[] args) throws Exception {
// take control of the file
		File f = new File("C:\\Apache poi\\test.xlsx");
// take file in read mode
		FileInputStream fis = new FileInputStream(f);
// take control of entire workbook
		Workbook wb = WorkbookFactory.create(fis);
// take control of sheet
		Sheet sh = wb.getSheet("Sheet1");
//take control of row
		Row r = sh.getRow(2);
// take control of cell
		Cell c = r.getCell(0);
String user = c.getStringCellValue();		
String pwd = r.getCell(1).getStringCellValue();		
		System.out.println(user);
		System.out.println(pwd);
// close the workbook
		wb.close();
	}
}
