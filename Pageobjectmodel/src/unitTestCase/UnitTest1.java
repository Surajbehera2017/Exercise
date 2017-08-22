package unitTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageClass.Loginpage;

public class UnitTest1 {
	Loginpage login;
	
	@Test
	void testUname()
	{
		
		login = new Loginpage();
		login.settxtUsername("Suraj1");
		Assert.assertEquals("Suraj1", login.gettxtUsername());
		
	}
	
	@Test
	void testpwd()
	{
		login = new Loginpage();
		login.settxtPassword("Suraj1");
		Assert.assertEquals("Suraj1", login.gettxtPassword());
		
	}
	
	
}
