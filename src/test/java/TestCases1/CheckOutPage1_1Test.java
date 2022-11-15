package TestCases1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base1.TestBase1_1;
import Page1.CartPage1_1;
import Page1.CheckOutPage1_1;
import Page1.InventoryPage1_1;
import Page1.LoginPage1_1;


public class CheckOutPage1_1Test extends TestBase1_1
{

	LoginPage1_1 login;
	InventoryPage1_1 invent;
	CartPage1_1 cart;
	CheckOutPage1_1 out;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login = new LoginPage1_1();
	    invent = new InventoryPage1_1();
	    cart = new CartPage1_1();
	    out = new CheckOutPage1_1();
	}
	
	@Test
	public void checkOutPage5Test() throws Exception 
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		boolean label = out.fillInformation();
		Assert.assertEquals(label,true);
	}
	
	@AfterMethod
	public void closeBroswer() 
	{
	driver.quit();
	}
}
