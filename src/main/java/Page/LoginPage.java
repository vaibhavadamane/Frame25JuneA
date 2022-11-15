package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import utility.ReadData1_1;

public class LoginPage extends TestBase
{

//TC1:-Verify the Title of Login Page
//TC2:-Verify the URL of the Login Page
//TC3:-Verify the LoginLogo.
//TC4:-Verify the BotLogo
//TC5:-Verify the We Can Login successfully or not as well as verify the text Product present in inventory page
//TC6:-Verify the Title of Inventory page.
//TC7:-Verify the URL of the Inventory Page
	
    //Object Repo
	@FindBy(xpath = "//div[@class='login_logo']")private WebElement loginLobo;
	@FindBy(xpath = "//div[@class='bot_column']")private WebElement botLobo;
	@FindBy(xpath = "//input [@id='user-name']")private WebElement usernameTextbox;
	@FindBy(xpath = "//input [@id='password']")private WebElement passwordTextbox;
	@FindBy(xpath = "//input [@id='login-button']")private WebElement loginBtn;
	@FindBy(xpath = "//span[text()='Products']")private WebElement productLabel;
	
	//Constructor to initialized the element of page to driver
	public LoginPage() //it will be join driver to element
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	//Method to verify to the title of the first page
	public String verifyTitle()
	{
	  return driver.getTitle();
	}
	
	//Method to verify to the current URL of the first page
	public String verifyCurrentUrl()
	{
	  return driver.getCurrentUrl();	
	}
	
	//Method to verify Logo login page
	public boolean verifySwagLabsLogo()
	{
		return loginLobo.isDisplayed();
	}
		
	//Method to verify img login page
    public boolean verifyImg()
	{
	    return botLobo.isDisplayed();
	}
	    
	//Method to login the Application and verify the label of inventory page
	public String loginApp1() throws Exception
	{
		//usernameTextbox.sendKeys("standard_user");
		usernameTextbox.sendKeys(ReadData1_1.readPropertyfile1("username"));
		//passwordTextbox.sendKeys("secret_sauce");
		passwordTextbox.sendKeys(ReadData1_1.readPropertyfile1("password"));
		loginBtn.click();
		return productLabel.getText();
	}
	
	//Method to login the Application and verify the URL of Inventory page
	public String verifyCurrentUrl1() throws Exception
	{
	    loginApp1();
	    return driver.getCurrentUrl();
    }
	
	//Method to verify the Title of Inventory Page page
	public String verifyTitle1() throws Exception
	{
		loginApp1();
		return driver.getTitle();
	}
	
}
