package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import testbase.Baseclass;

public class TC_001_Login extends Baseclass
{
	@Test
	public void test_login()
	{
		
		try
		{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
}
