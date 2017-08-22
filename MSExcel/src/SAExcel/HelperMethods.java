package SAExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HelperMethods 
{
	static XSSFWorkbook Workbook;
	static XSSFSheet sheet;
	
	
	public static void openExcelForReading(String path) throws Exception
	{
		Workbook  = new XSSFWorkbook(new File(path));  
	}
	public static void loadSheet(int sheetnum)
	{
		sheet = Workbook.getSheetAt(sheetnum);
	}
	public static String readingcell(int rownum,int cellnum)
	{
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		System.out.println("The Value:"+cell.getStringCellValue());
		return cell.getStringCellValue();
		
	}
	
	public static void close() throws IOException
	{
		Workbook.close();
	}
	
	public static Object[][] loadAll()
	{
		Object[][] data = new Object[3][2];
		for(Row row:sheet)
			for(Cell cell:row)
				data[row.getRowNum()][cell.getColumnIndex()] = cell.getStringCellValue();
		
		return data;
	}
	
	public static void main(String[] args) throws Exception
	{
		openExcelForReading("D:/Test.xlsx");
		loadSheet(0);
		//readingcell(0, 0);
		loadAll();
		close();
		
	}
	
	
}
