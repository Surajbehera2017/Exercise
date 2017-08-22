package Data_Driven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SAExcel.HelperMethods;

public class DataDriven_multipleTest {

	static WebDriver driver;
	
	@BeforeClass
	void OpenHotelApp() throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/Hvuser/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		SAExcel.HelperMethods.openExcelForReading("D:/Test.xlsx");
	}
	
	
	
	@Test
	void main1() throws Exception
	{
	
		
		SAExcel.HelperMethods.loadSheet(0);
		
		
		for(int rownum=0; rownum<3;rownum++)
		{
			login(SAExcel.HelperMethods.readingcell(0, 0),SAExcel.HelperMethods.readingcell(0, 1));
			Assert.assertTrue(isExist("username_show"));
		}
		HelperMethods.close();
	}	
	
	
	@Test
	void main2() throws Exception
	{
		SAExcel.HelperMethods.loadSheet(0);
		for(int rownum=0; rownum<3;rownum++)
		{
			login(SAExcel.HelperMethods.readingcell(1, 0),SAExcel.HelperMethods.readingcell(1, 1));
			Assert.assertTrue(isExist("username_show"));
		}
		HelperMethods.close();
	}
	
	
	@Test
	void main3() throws Exception
	{
	
		
		SAExcel.HelperMethods.loadSheet(0);
		
		
		for(int rownum=0; rownum<3;rownum++)
		{
			login(SAExcel.HelperMethods.readingcell(2, 0),SAExcel.HelperMethods.readingcell(2, 1));
			Assert.assertTrue(isExist("username_show"));
		}
		HelperMethods.close();
	}
	
	Boolean isExist(String InputId)
	{
		try
		{	
			WebElement ele = driver.findElement(By.id(InputId));
			return true;
		}catch(NoSuchElementException e)
		{
			return false;
		}
		
	}
	
	public static void login(String uname, String pwd)
	{
		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	

}
