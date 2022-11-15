package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.InventoryPage;
import Page.LoginPage;
import utility.ReadData1_1;

public class GroupTest extends TestBase
{
	//Here we can divided the test cases as per testing type like Sanity,Smoke,Regression Testing then
	//We create TestNG of that class and execute the particular Testing type that only thows test cases will be 
	//Executed which is related to that Testing type. 

	InventoryPage invent; 
	LoginPage login;      
	
	@BeforeMethod(alwaysRun =true)
	public void setup() throws Exception
	{
		initalization();
	    login =new LoginPage();
		invent = new InventoryPage();
	}
	
	@Test(groups="Sanity")
	public void verifyTitleTest() throws Exception
	{
		login.loginApp1();
		String title = invent.verifyTitle();
		//Assert.assertEquals(title,"Swag Labs");
		Assert.assertEquals(title, ReadData1_1.readExcelFile1(0, 0));
	}
	
	@Test(groups="Sanity")
	public void verifyCurrentUrlTest() throws Exception
	{
		login.loginApp1();
		String url = invent.verigyCurrentUrl();
		//Assert.assertEquals(url, "https://www.saucedemo.com/inventory.html");
	    Assert.assertEquals(url, ReadData1_1.readExcelFile1(1,0));
	}
	
	@Test(enabled = true,groups="Sanity")
	public void verifySmallLogoTest() throws Exception
	{
		login.loginApp1();
		boolean logo1 = invent.verifySmallLogo();
		Assert.assertEquals(logo1, true);
	}
	
	@Test(enabled = true,groups="Sanity")
	public void verifyBigLogoTest() throws Exception
	{
		login.loginApp1();
		boolean logo2 = invent.verifyBigLogo();
		Assert.assertEquals(logo2, true);
	}
	
	@Test(enabled = true,groups="Smoke")
	public void add6ProductTest() throws Exception
	{
		login.loginApp1();
	    boolean result = invent.add6Product();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = true,groups="Smoke")
	public void remove2ProductTest() throws Exception
	{
		login.loginApp1();
	    String result1 = invent.remove2Product();
		//Assert.assertEquals(result1,"2");
	    Assert.assertEquals(result1, ReadData1_1.readExcelFile1(2,0));
	}
	
	@Test(enabled = true,groups="Sanity")
	public void verifytwitterlogoTest() throws Exception
	{
		login.loginApp1();
		boolean logo1 = invent.verifytwitterLogo();
		Assert.assertEquals(logo1,true);
	}
	
	@Test(enabled = true,groups="Sanity")
	public void verifyfacebooklogoTest() throws Exception
	{
		login.loginApp1();
		boolean logo2 = invent.verifyfacebookLogo();
		Assert.assertEquals(logo2,true);
	}
	
	@Test(enabled = true,groups="Sanity")
	public void verifylinkedInlogoTest() throws Exception
	{
		login.loginApp1();
		boolean logo3 = invent.verifylinkedInLogo();
		Assert.assertEquals(logo3,true);
	}
	
	@Test(enabled = true,groups="Smoke")
	public void gotoNextPage3Test() throws Exception
	{
		login.loginApp1();
        String lebel = invent.add2Product();
		//Assert.assertEquals(lebel, "2");
        Assert.assertEquals(lebel, ReadData1_1.readExcelFile1(3, 0));
	}
	
	@AfterMethod(alwaysRun =true)
	public void closeBroswer()
	{
		driver.close();
	}
}
