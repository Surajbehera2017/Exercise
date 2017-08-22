package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Actions 
{
	static WebDriver driver;
	
	public static void launchApp()
	{		
	System.setProperty("webdriver.gecko.driver","C:/Users/Hvuser/Downloads/chromedriver_win32/chromedriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://www.adactin.com/HotelApp/index.php");
	}
	
	public static void EnterText(String locatortype, String locator, String value)
	{
		if(locatortype.equalsIgnoreCase("id"))
		driver.findElement(By.id(locator)).sendKeys(value);
		
	}
	
	public static void click(String locatortype, String locator)
	{
		if(locatortype.equalsIgnoreCase("id"))
			driver.findElement(By.id(locator)).click();
		
	}
	
	public static void select(String locatortype, String locator,String value)
	{
		if(locatortype.equalsIgnoreCase("id"))
		{
			Select sel = new Select(driver.findElement(By.id(locator)));
			sel.selectByVisibleText(value);
		}
	}
	
	
}
