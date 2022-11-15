package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base1.TestBase1_1;
import Page1.LoginPage1_1;
import utility.ReadData1_1;

public class SoftAssertion extends TestBase1_1
{
	//Here we can used the "Soft Assert"
	
	LoginPage1_1 login;
    @BeforeMethod(enabled= true)
	public void setup() throws Exception 
	{
		initalization();
        login = new LoginPage1_1();
	}
	
    //If we use the SA that time if test case is failed the then rest of the thing present in our method will be executed
    //IMP Think:-**If we used Soft Assert that time our test case got failed (excepted result not equals to actual result) However our 
    //Test Case got passed** Because Soft Assert is collect the error During @Test.
    //It does not throw exception .If u want it will throw exception that time we use assertAll() method at last in a statement in @Test.
    
	@Test(enabled= true)
	public void verifyTitleTest() throws Exception
	{
		SoftAssert s = new SoftAssert();
		System.out.println("This Test doesn't failed because we can use the Soft Assert");
		String title = login.verifyTitle();
		s.assertEquals(title, ReadData1_1.readExcelFile(1,0));
		System.out.println("This Test case failed due to actual and excepted result not matched");
		s.assertAll();//By using this we can get all exception occur in this @Test.
	}
	
	@Test(enabled = false)
    public void verifyCurrentUrlTest() throws Exception
	{
    	String url = login.verifyCurrentUrl();
    	Assert.assertEquals(ReadData1_1.readExcelFile(1,0),url);
	}
	
	@AfterMethod
	public void closeBroswer()
	{
	driver.close();	
	}
}
