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
import Page.OverviewPage;

public class OverviewPageTest extends TestBase 
{
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage check;
	OverviewPage over;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		check = new CheckOutPage();
		over = new OverviewPage();
	}
	
	@Test
	public void currentUrlTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.currentUrl();
		Assert.assertEquals(lebel1, "https://www.saucedemo.com/checkout-step-two.html");
	}
	
	@Test
	public void product1Test() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.product1();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void product2Test() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.product2();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void product3Test() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.product3();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void product4Test() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.product4();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void product5Test() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.product5();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void product6Test() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.product6();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void paymentInfoTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.paymentInfo();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void shioppingInfoTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.shoppingInfo();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void totallLabelTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.totalLebel();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void taxLabelTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.taxLebel();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void totalAmountLabelTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.totalAmountlebel();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test
	public void finishButtonTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.finishButton();
		Assert.assertEquals(lebel1,true);
	}
	
	@AfterMethod
	public void closeBroswer()
	{
		driver.close();
	}
	
}