package SAExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("D:/Test.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(3);
		cell.setCellValue("New Cell");
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("D:/Test.xlsx");
		wbook.write(fos);
		
	}
	
	public static void openExcelForReading(String path) throws Exception
	{
		XSSFWorkbook Workbook  = new XSSFWorkbook(new File(path));  
		XSSFSheet sheet = Workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println("The Value:"+cell.getStringCellValue());
		
	}


}
