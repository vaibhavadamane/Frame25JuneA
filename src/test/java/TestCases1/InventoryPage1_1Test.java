package TestCases1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base1.TestBase1_1;
import Page1.InventoryPage1_1;
import Page1.LoginPage1_1;
import utility.ReadData1_1;

public class InventoryPage1_1Test extends TestBase1_1
{

    LoginPage1_1 login; //(Connected to InventoryPage class)
    InventoryPage1_1 invent;      //(Connect to loginapp method which is present into loginPage Class which login successfully.)
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	   login =  new LoginPage1_1();
	   invent = new InventoryPage1_1();
	}

    @Test(enabled = true)
	public void remove2ProductTest() throws Exception
	{
		login.loginSuccessfully();
	    String result1 = invent.remove2Product();
		Assert.assertEquals(result1,ReadData1_1.readExcelFile(4, 0));
	}
	
	@Test(enabled = true)
	public void add2ProductTest() throws Exception
	{
		login.loginSuccessfully();
        String lebel = invent.add2Product();
		Assert.assertEquals(lebel,ReadData1_1.readExcelFile(5, 0));
	}
	
	@Test
	public void add6ProduntTest() throws Exception
	{
	    login.loginSuccessfully();
	    String lebel = invent.add6Product1();
	    Assert.assertEquals(lebel,ReadData1_1.readExcelFile(6,0));
	}
	
	@Test
	public void add6Product() throws Exception
	{
		login.loginSuccessfully();
		boolean lebel = invent.add6Product();
		Assert.assertEquals(lebel, true);
	}
	
	
	@AfterMethod
	public void closeBroswer()
	{
		driver.quit();
	}
}
