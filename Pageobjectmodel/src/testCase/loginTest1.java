package testCase;

import org.testng.Assert;
import org.testng.annotations.*;

import pageClass.Base;
import pageClass.Loginpage;
import pageClass.SearchHotel;

public class loginTest1 {

	Loginpage Login;
	SearchHotel Search;
	
	
	@BeforeClass
	void BeforeClass()
	{
		Base.openBrowser();
		Base.navigateToUrl();
		Login = new Loginpage();
		Search = new SearchHotel();
	}
	
	@Test
	void test1()
	{
		Login.settxtUsername("");
		Login.setbtnLogin();
		Assert.assertEquals("Enter Username", Login.geterror());
	}
	
	@Test
	void test2() throws InterruptedException
	{
		Thread.sleep(5000);
		Login.settxtPassword("");
		Login.setbtnLogin();
		Assert.assertEquals("Enter Username", Login.geterror());
	}
	
	@Test
	void test3()
	{
		Login.settxtUsername("suraj2017");
		Login.settxtPassword("Dravid@2017");
		Login.setbtnLogin();
		Assert.assertEquals(Search.gettxtUsernameShow(), "Hello Suraj2017!");
		Search.setselectlocation("London");
		Search.setbtnSubmit();
		
	}
}
