package Page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base1.TestBase1_1;
import utility.ReadData1_1;

public class CheckOutPage1_1 extends TestBase1_1 
{
	//Object Repo
	@FindBy(xpath="//input[@id='first-name']")private WebElement firstName;
	@FindBy(xpath="//input[@id='last-name']")private WebElement lastName;
	@FindBy(xpath="//input[@id='postal-code']")private WebElement postalCode;
	@FindBy(xpath="//input[@id='continue']")private WebElement contioueButton;
	@FindBy(xpath="//span[@class='title']")private WebElement checkOutOverview;
		
	//Constructor
	public CheckOutPage1_1()
	{
	  PageFactory.initElements(driver,this);	
	}
		
	//Methods
	//Method which fill Information and go to page no 5
	public boolean fillInformation() throws Exception
	{
		firstName.sendKeys(ReadData1_1.readPropertyfile("firstname"));
		lastName.sendKeys(ReadData1_1.readPropertyfile("lastname"));
		postalCode.sendKeys(ReadData1_1.readPropertyfile("pin"));
		contioueButton.click();
		return checkOutOverview.isDisplayed();
	}
	}
