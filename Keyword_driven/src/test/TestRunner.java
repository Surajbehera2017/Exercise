package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import action.Actions;
import action.HelperMethods;

public class TestRunner 
{
	@BeforeClass
	void OpenHotelApp() throws Exception
	{
		action.Actions.launchApp();
		action.HelperMethods.openExcelForReading("D:/Keyword.xlsx");
		action.HelperMethods.loadSheet(0);
	}
	
	@Test
	void test1()
	{
		for(int rownum=0; rownum<6;rownum++)
		{
			if((HelperMethods.readingcell(rownum, 2)).equalsIgnoreCase("EnterText"))
			Actions.EnterText(HelperMethods.readingcell(rownum, 0), HelperMethods.readingcell(rownum, 1), HelperMethods.readingcell(rownum, 3));
			
			if((HelperMethods.readingcell(rownum, 2)).equalsIgnoreCase("Click"))
				Actions.click(HelperMethods.readingcell(rownum, 0), HelperMethods.readingcell(rownum, 1));
			
			if((HelperMethods.readingcell(rownum, 2)).equalsIgnoreCase("Select"))
				Actions.select(HelperMethods.readingcell(rownum, 0), HelperMethods.readingcell(rownum, 1), HelperMethods.readingcell(rownum, 3));					
		}
		
	}
}
