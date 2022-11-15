package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage login;  //it is global variable and useful for all method
	
	//Here we used the Keyword like priority,enabled,count,dependsOnMethods.invacationCount,Timeout
	
    @BeforeMethod
	public void setup() throws Exception 
    {
    	initalization();
        login = new LoginPage(); //to call the method present into the Loginpage class method we can create the object of the method
    }
	
	//Test is use for the Test Cases
    //Priority:-If the priority of the two test cases are same that time it will be run by alphabetically sequences and also when we didn't get a priority.
    //If we didn't get Priority that time priority become zero default.
    //If u can get less priority of the those method which is depend on particular method However the particular method get executed first either it will give more priority.
    //dependsOnMethoda:-more than two method will be depend on one method if this method will not executed that time other 2 depend method will be skipped use when we can't login that next depend tc will be failed
    //InvaocationCount is use to execute the script multiple time to avoid any faluction
    //TimeOut:-we can check the performance of the application if the test case not complied in a particular time which denoted by timeout then it will be failed 
    //The application argument not finding within time.
    
    
    @Test(enabled = true,priority = 1,invocationCount=1,timeOut=50)
	public void verifyTitleTest()
	{
       String title = login.verifyTitle();
       Assert.assertEquals(title, "Swag Labs");
	}
	
    @Test(enabled = false,priority = 2)
    public void verifyCurrentUrlTest()
	{
    	String url = login.verifyCurrentUrl();
    	Assert.assertEquals(url, "https://www.saucedemo.com/");
	}
    
    @Test(enabled = false)
    public void verifySwagLabLogoTest()
    {
    	boolean logo1 = login.verifySwagLabsLogo();
    	Assert.assertEquals(logo1,true);
    }
    
    @Test(enabled = false)
    public void verifyImgTest()
    {
       Assert.assertEquals(login.verifyImg(),true); //Apply different way
    }
    
    @Test(enabled = false,priority = 5,timeOut=4000)
    public void loginApp1Page2Test() throws Exception
    {
    	String label = login.loginApp1();
        Assert.assertEquals(label,"1PRODUCTS");
    }
    
    @Test(enabled = false,dependsOnMethods = "loginApp1Page2Test",priority = 3)
    public void verifyCurrentUrl1Test() throws Exception
    {
    	Assert.assertEquals("https://www.saucedemo.com/inventory.html",login.verifyCurrentUrl1());//Apply different way.
    }
    
    @Test(enabled = false,dependsOnMethods = "loginApp1Page2Test",priority = 4)
    public void verifyTitle1Test() throws Exception
    {
    String title1 = login.verifyTitle1();
    Assert.assertEquals(title1,"Swag Labs");
    }
   
     @AfterMethod
	public void closeBroswer()
	{
       driver.close();
	}
	}
