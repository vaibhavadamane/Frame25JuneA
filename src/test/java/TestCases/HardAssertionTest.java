package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base1.TestBase1_1;
import Page1.LoginPage1_1;
import utility.ReadData1_1;

public class HardAssertionTest extends TestBase1_1
{
 //Here we can see the Total working of "Hard Assertion" in LoginPage
 //By using 3 ways we can failed the test cases purposefully.
 //1)we can change the excepted value.
 //2)we can use timeOut Keyword by give the less time than actual execution time.
 //3)By using the Assert.assertFalse(Condition) here condition will different than assertFalse like condition is true that time our test case is failed.
 //Main Point:-If the our test case got failed that time remaining statements inside the method will be aborted and we can directly go to the
 //or our test suite go to next @Test.To avoid this we can use "Soft Assert"
	
	LoginPage1_1 login;
	
    @BeforeMethod
	public void setup() throws Exception 
	{
		initalization();
        login = new LoginPage1_1();
	}
	
    
    //1)Here we can use "massage" is extra filed  in Assert method but the massage will be appear only when out test case is failed.
	@Test(enabled = false)
	public void verifyTitleTest() throws Exception
	{
		String title = login.verifyTitle();
		Assert.assertEquals(title,ReadData1_1.readExcelFile(1, 0),"We can failed this Test case Purposefully");
	
	}
	
	//2)By using timeOut Keyword we can failed the test case then remaining data will be aborted.
	@Test(enabled = true,timeOut=1000)//Here we can provide less time than real execution time so test case got failed due to this we can check the performance of the test case
    public void verifyCurrentUrlTest() throws Exception
	{
		System.out.println("This method get failed Purposefully By using the timeOut Keyworld");
    	String url = login.verifyCurrentUrl();
    	Assert.assertEquals(ReadData1_1.readExcelFile(1,0),url);
    	//Assert.assertTrue(false);
    	System.out.println("This method didn't excute if the test case got a failed");
	}
	
	//3)By using assertFalse and assertTrue method we can failed the test case
	//for eg. if we can provide the non credential data in login page that time our test case result must be failed so confirm this thing we use this method
	//We can used this method in "Negative Test Cases" because we know about result of this test case is always failed.
	@Test(enabled = false)
	public void loginSucessfullyTest() throws Exception
	{
	    Assert.assertEquals(login.loginSuccessfully(),true);
	    Assert.assertFalse(true);
	    Assert.assertTrue(false); //Here we can pass the different value than method name like assertFalse that time
	    //we can pass the true value instead of false value .so that time our test got failed purposefully.
	}
	
    @Test(enabled = false)
    public void verifyTitle1Test() throws Exception
    {
    String title1 = login.verifyTitle1();
    Assert.assertEquals(title1,ReadData1_1.readExcelFile(2, 0));
    }
	
	@Test(enabled = false)
	public void verifyCurrentUrl1Test() throws Exception
    {
	String url = login.verifyCurrentUrl1();
	Assert.assertEquals(url,ReadData1_1.readExcelFile(3, 0));
	}
	
	@AfterMethod
	public void closeBroswer()
	{
	driver.close();	
	}
}
