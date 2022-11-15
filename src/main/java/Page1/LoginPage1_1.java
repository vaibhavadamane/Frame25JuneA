package Page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base1.TestBase1_1;
import utility.ReadData1_1;

public class LoginPage1_1 extends TestBase1_1
{
	//Object Repo
	@FindBy(xpath = "//input [@id='user-name']")private WebElement usernameTextbox;
	@FindBy(xpath = "//input [@id='password']")private WebElement passwordTextbox;
	@FindBy(xpath = "//input [@id='login-button']")private WebElement loginBtn;
	@FindBy(xpath = "//span[text()='Products']")private WebElement productLabel;

	//Constructor
    public LoginPage1_1()
    {
    	PageFactory.initElements(driver,this);
    }
	
	//Methods 
	//Method to verify the Title
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public String verifyCurrentUrl()
	{
	  return driver.getCurrentUrl();	
	}
	
	//Method to verify login successfully and go to next page
    public boolean loginSuccessfully() throws Exception
    {
        usernameTextbox.sendKeys(ReadData1_1.readPropertyfile("username"));
        passwordTextbox.sendKeys(ReadData1_1.readPropertyfile("password"));
        loginBtn.click();
        return productLabel.isDisplayed();
    }	
    
  //Method to verify the Title of Inventory Page page
  	public String verifyTitle1() throws Exception
  	{
  		loginSuccessfully();
  		return driver.getTitle();
  	}
    
    //Method to login the Application and verify the URL of Inventory page
  	public String verifyCurrentUrl1() throws Exception
  	{
  		loginSuccessfully();
  	    return driver.getCurrentUrl();
    }
  	}
