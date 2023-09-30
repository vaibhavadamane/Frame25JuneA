package TestCases1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base1.TestBase1_1;
import Page1.LoginPage1_1;
import utility.ReadData1_1;


public class LoginPage1_1Test extends TestBase1_1
{
	LoginPage1_1 login;
    @BeforeMethod
	public void setup() throws Exception 
	{
		initalization();
        login = new LoginPage1_1();
	}
	
	@Test(enabled= true,dependsOnMethods="verifyCurrentUrlTest")
	public void verifyTitleTest() throws Exception
	{
		String title = login.verifyTitle();
		Assert.assertEquals(title,ReadData1_1.readExcelFile(0, 0));
	}
	
	@Test(enabled = true)
    public void verifyCurrentUrlTest() throws Exception
	{
    	String url = login.verifyCurrentUrl();
    	Assert.assertEquals(ReadData1_1.readExcelFile(0,0),url);
	}
	
	@Test(enabled= true)
	public void loginSucessfullyTest() throws Exception
	{
		Assert.assertEquals(login.loginSuccessfully(),true);
	 }
	
    @Test(enabled = true)
    public void verifyTitle1Test() throws Exception
    {
    String title1 = login.verifyTitle1();
    Assert.assertEquals(title1,ReadData1_1.readExcelFile(2, 0));
    }
	
	@Test(enabled = false,dependsOnMethods="verifyCurrentUrlTest")
	public void verifyCurrentUrl1Test() throws Exception
    {
	String url = login.verifyCurrentUrl1();
	Assert.assertEquals(url,ReadData1_1.readExcelFile(3, 0));
	}
	
	@AfterMethod
	public void closeBroswer()
	{
	driver.quit();
	}
	
}
