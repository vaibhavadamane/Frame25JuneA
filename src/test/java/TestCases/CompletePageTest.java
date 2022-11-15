package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage;
import Page.CheckOutPage;
import Page.CompletePage;
import Page.InventoryPage;
import Page.LoginPage;
import Page.OverviewPage;
import utility.CaptureScreenshot;

public class CompletePageTest extends TestBase
{

	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage check;
	OverviewPage over;
	CompletePage com;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		check = new CheckOutPage();
		over = new OverviewPage();
	    com = new CompletePage();
	}
	
	@Test(enabled = false)
	public void currnturlTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		over.finishButton();
		String lebel = com.currenUrl();
		Assert.assertEquals(lebel, "https://www.saucedemo.com/checkout-complete.html");
	}
	
	@Test(enabled = false)
	public void thankYouMsgTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		over.finishButton();
		boolean lebel = com.thankYouMsg();
		Assert.assertEquals(lebel,true);
	}
	
	@Test(enabled = false)
	public void notificationMsgTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		over.finishButton();
		boolean lebel = com.notificationMsg();
		Assert.assertEquals(lebel,true);
	}
	
	@Test(enabled = true,invocationCount=5)
	public void finalLogoTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		over.finishButton();
		boolean lebel = com.finalBigLogo();
		Assert.assertEquals(lebel, true);
	}
	
	@Test(enabled = false)
	public void backHomeButtonTest() throws Exception
	{
		Thread.sleep(3000);
		login.loginApp1();
		Thread.sleep(3000);
		invent.add6Product();
		Thread.sleep(3000);
		cart.checkOut();
		Thread.sleep(3000);
		check.fillInformation();
		Thread.sleep(3000);
		over.finishButton();
		Thread.sleep(3000);
		String lebel = com.backHomeButton();
		Assert.assertEquals(lebel, "https://www.saucedemo.com/inventory.html");
	}
	
	@AfterMethod
	public void closeBroswer(ITestResult it) throws Exception
	{
		if(ITestResult.SUCCESS==it.getStatus())
		{
		    CaptureScreenshot.Screenshot1(it.getName()); //Getname method give us the method name is failed and it will be pass on screenshot1 method.	
		}
		driver.close();
	}
}
