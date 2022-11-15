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
import Page1.OverviewPage1_1;
import utility.ReadData1_1;


public class OverviewPage1_1Test extends TestBase1_1
{
	LoginPage1_1 login;
	InventoryPage1_1 invent;
	CartPage1_1 cart;
	CheckOutPage1_1 check;
	OverviewPage1_1 over;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage1_1();
		invent = new InventoryPage1_1();
		cart = new CartPage1_1();
		check = new CheckOutPage1_1();
		over = new OverviewPage1_1();
	}
	
	@Test(enabled = true)
	public void currentUrlTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.currentUrl();
		Assert.assertEquals(lebel1, "https://www.saucedemo.com/checkout-step-two.html");
	}
	
	@Test(enabled = true)
	public void product1Test() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.product1();
		Assert.assertEquals(lebel1,ReadData1_1.readExcelFile(7,0));
	}
	
	@Test(enabled = true)
	public void product2Test() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.product2();
		Assert.assertEquals(lebel1, ReadData1_1.readExcelFile(8,0));
	}
	
	@Test(enabled = true)
	public void product3Test() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.product3();
		Assert.assertEquals(lebel1,ReadData1_1.readExcelFile(9,0));
	}
	
	@Test(enabled = true)
	public void product4Test() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.product4();
		Assert.assertEquals(lebel1, ReadData1_1.readExcelFile(10,0));
	}
	
	@Test
	public void product5Test() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.product5();
		Assert.assertEquals(lebel1, ReadData1_1.readExcelFile(11,0));
	}
	
	@Test(enabled = true)
	public void product6Test() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.product6();
		Assert.assertEquals(lebel1, ReadData1_1.readExcelFile(12,0));
	}
	
	@Test(enabled = true)
	public void paymentInfoTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.paymentInfo();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test(enabled = true)
	public void shioppingInfoTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.shoppingInfo();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test(enabled = true)
	public void totallLabelTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.totalLebel();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test(enabled = true)
	public void taxLabelTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.taxLebel();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test(enabled = true)
	public void totalAmountLabelTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		boolean lebel1 = over.totalAmountlebel();
		Assert.assertEquals(lebel1,true);
	}
	
	@Test(enabled = true)
	public void finishButtonTest() throws Exception {
	
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		String lebel1 = over.finishButton();
		Assert.assertEquals(lebel1, ReadData1_1.readExcelFile(13,0));
	}
	
	@AfterMethod
	public void closeBroswer()
	{
		driver.quit();
	}
}
