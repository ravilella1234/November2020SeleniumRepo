package dataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWriterByColumnNumber 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testdatanew.xlsx");
		FileOutputStream fos = null;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		
		XSSFFont font = wb.createFont();
		XSSFCellStyle style = wb.createCellStyle();
		
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(4);
		
		font.setFontName("Algerian");
		font.setFontHeight(20.0);
		font.setBold(true);
		
		style.setFont(font);
		cell.setCellStyle(style);
		
		cell.setCellValue("Passed");
		
		fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\testdatanew.xlsx");
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
		

	}

}
