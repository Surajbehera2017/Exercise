package Data_Driven;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SAExcel.HelperMethods;

public class DataDriven {

	static WebDriver driver;
	
	@BeforeClass
	void OpenHotelApp()
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/Hvuser/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		
	}
	
	@Test
	void main() throws Exception
	{
	
		SAExcel.HelperMethods.openExcelForReading("D:/Test.xlsx");
		SAExcel.HelperMethods.loadSheet(0);
		
		
		for(int rownum=0; rownum<3;rownum++)
		{
			login(SAExcel.HelperMethods.readingcell(rownum, 0),SAExcel.HelperMethods.readingcell(rownum, 1));
			try{
				Assert.assertEquals("Hello Suraj2017!", driver.findElement(By.id("username_show")).getAttribute("value"));
			}catch(NoSuchElementException e){
				System.out.println("Failed");
			}catch(AssertionError e){
				Assert.fail();
			}
		}
		HelperMethods.close();
			
	}	
	
	public static void login(String uname, String pwd)
	{
		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		
	}
	

}
