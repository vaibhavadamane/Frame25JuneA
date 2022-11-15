package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage;
import Page.InventoryPage;
import Page.LoginPage;

public class CartPageTest extends TestBase
{
	CartPage login;
    LoginPage login1;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login1 = new LoginPage();
		invent = new InventoryPage();
		login = new CartPage();
	}
	@Test
	public void checkOutPage4Test() throws Exception
	{
		login1.loginApp1();
		invent.add6Product();
		boolean lebel = login.checkOut();
		Assert.assertEquals(lebel, true);
	}
	
	@AfterMethod
	public void closeBroswer() 
	{
	    driver.close();	
	}
	
	
	
}
