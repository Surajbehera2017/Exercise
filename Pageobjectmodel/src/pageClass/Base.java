package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	static WebDriver driver;
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hvuser/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void navigateToUrl()
	{
		driver.get("http://www.adactin.com/HotelApp/index.php");
	}
}
