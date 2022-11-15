package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOutPage extends TestBase
{

	//Object Repo
	@FindBy(xpath="//input[@id='first-name']")private WebElement firstName;
	@FindBy(xpath="//input[@id='last-name']")private WebElement lastName;
	@FindBy(xpath="//input[@id='postal-code']")private WebElement postalCode;
	@FindBy(xpath="//input[@id='continue']")private WebElement contioueButton;
	@FindBy(xpath="//span[@class='title']")private WebElement checkOutOverview;
	
	//Constructor
	public CheckOutPage()
	{
	  PageFactory.initElements(driver,this);	
	}
	
	//Methods
	//Method which fill Information and go to page no 5
	public boolean fillInformation()
	{
		firstName.sendKeys("Vivek");
		lastName.sendKeys("Patel");
		postalCode.sendKeys("409032");
		contioueButton.click();
		return checkOutOverview.isDisplayed();
	}
}
