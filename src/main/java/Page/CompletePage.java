package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CompletePage extends TestBase
{
    //Object Repo (If our Webelement is private and method should be public)
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement thankYou;
	@FindBy(xpath="//div[@class='complete-text']")private WebElement notification;
	@FindBy(xpath="//img[@class='pony_express']")
	public WebElement finalBigLogo1;
	@FindBy(xpath="//button[@name='back-to-products']")private WebElement backHome;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement homeLogo;
	
	//Constructor
	public CompletePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	//Methods which gives us to URL of new page
	public String currenUrl()
	{
		return driver.getCurrentUrl();
	}
	
	//Method which is show thank you and notification msg
	public boolean thankYouMsg()
	{
		return thankYou.isDisplayed();
	}
	
	public boolean notificationMsg()
	{
		return notification.isDisplayed();
	}
	
	public boolean finalBigLogo()
	{
		return finalBigLogo1.isDisplayed();
	}
	
	//Method which click the back home button and we go to first page
	public String backHomeButton()
	{
		backHome.click();
	    return driver.getCurrentUrl();
	}
	}
