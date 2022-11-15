package TestCases1;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base1.TestBase1_1;
import Page1.CartPage1_1;
import Page1.CheckOutPage1_1;
import Page1.CompletePage1_1;
import Page1.InventoryPage1_1;
import Page1.LoginPage1_1;
import Page1.OverviewPage1_1;
import utility.CaptureScreenshot;
import utility.ReadData1_1;


public class CompletePage1_1Test extends TestBase1_1
{

	LoginPage1_1 login;
	InventoryPage1_1 invent;
	CartPage1_1 cart;
	CheckOutPage1_1 check;
	OverviewPage1_1 over;
	CompletePage1_1 com;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage1_1();
		invent = new InventoryPage1_1();
		cart = new CartPage1_1();
		check = new CheckOutPage1_1();
		over = new OverviewPage1_1();
	    com = new CompletePage1_1();
	}
	
	@Test(enabled = false)
	public void currnturlTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		over.finishButton();
		String lebel = com.currenUrl();
		Assert.assertEquals(lebel,ReadData1_1.readExcelFile(14,0));
	}
	
	@Test(enabled = false)
	public void thankYouMsgTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		over.finishButton();
		String lebel = com.thankYouMsg();
		Assert.assertEquals(lebel, ReadData1_1.readExcelFile(15,0));
	}
	
	@Test(enabled = false)
	public void notificationMsgTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		over.finishButton();
		boolean lebel = com.notificationMsg();
		Assert.assertEquals(lebel,true);
	}
	
	@Test(enabled = true)
	public void finalLogoTest() throws Exception
	{
		login.loginSuccessfully();
		invent.add6Product();
		cart.checkOut();
		check.fillInformation();
		over.finishButton();
		boolean lebel = com.finalBigLogo();
		Assert.assertEquals(lebel,false);
	}
	
	@Test(enabled = false)
	public void backHomeButtonTest() throws Exception
	{
		Thread.sleep(3000);
		login.loginSuccessfully();
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
		Assert.assertEquals(lebel,ReadData1_1.readExcelFile(16,0));
	}
	
	@AfterMethod
	public void closeBroswer(ITestResult it) throws Exception
	{
		if(ITestResult.FAILURE==it.getStatus())
		{
			CaptureScreenshot.fullScrrenShot();
		}
		driver.quit();
	}
}
