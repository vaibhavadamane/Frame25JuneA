package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage;
import Page.CheckOutPage;
import Page.InventoryPage;
import Page.LoginPage;

public class CheckOutPageTest extends TestBase
{
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage out;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login = new LoginPage();
	    invent = new InventoryPage();
	    cart = new CartPage();
	    out = new CheckOutPage();
	}
	
	@Test
	public void checkOutPage5Test() throws Exception 
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		boolean label = out.fillInformation();
		Assert.assertEquals(label,true);
	}
	
	@AfterMethod
	public void closeBroswer() 
	{
	driver.close();	
	}
	}
