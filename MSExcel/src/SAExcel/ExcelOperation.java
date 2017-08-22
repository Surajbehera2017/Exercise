package SAExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {

	public static void main(String[] args) throws Exception
	{
		
		XSSFWorkbook Workbook  = new XSSFWorkbook(new File("D:/Test.xlsx"));  
		XSSFSheet sheet = Workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println("The Value:"+cell.getStringCellValue());
		
		System.out.println("Calling M1");
		M1();
		Workbook.close();
		
		
	}
	
	public static void M1() throws Exception, Exception
	{
		XSSFWorkbook wbook = new XSSFWorkbook(new File("D:/Test.xlsx"));
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		for(Row row:sheet)
			for(Cell cell:row)
				System.out.println(cell.getStringCellValue());
		
	}
}
