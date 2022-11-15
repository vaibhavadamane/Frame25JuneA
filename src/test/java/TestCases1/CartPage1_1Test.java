package TestCases1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base1.TestBase1_1;
import Page1.CartPage1_1;
import Page1.InventoryPage1_1;
import Page1.LoginPage1_1;


public class CartPage1_1Test extends TestBase1_1
{

	CartPage1_1 login;
    LoginPage1_1 login1;
	InventoryPage1_1 invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login1 = new LoginPage1_1();
		invent = new InventoryPage1_1();
		login = new CartPage1_1();
	}
	@Test
	public void checkOutPage4Test() throws Exception
	{
		login1.loginSuccessfully();
		invent.add6Product();
		boolean lebel = login.checkOut();
		Assert.assertEquals(lebel, true);
	}
	
	@AfterMethod
	public void closeBroswer() 
	{
	    driver.quit();
	}
	
}
