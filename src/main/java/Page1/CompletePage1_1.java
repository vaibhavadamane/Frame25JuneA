package Page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base1.TestBase1_1;

public class CompletePage1_1 extends TestBase1_1
{
	//Object Repo
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement thankYou;
	@FindBy(xpath="//div[@class='complete-text']")private WebElement notification;
	@FindBy(xpath="//img[@class='pony_express']")private WebElement finalBigLogo;
	@FindBy(xpath="//button[@name='back-to-products']")private WebElement backHome;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement homeLogo;
		
	//Constructor
	public CompletePage1_1()
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
	public String thankYouMsg()
	{
		return thankYou.getText();
	}
		
	public boolean notificationMsg()
	{
		return notification.isDisplayed();
	}
		
	public boolean finalBigLogo()
	{
		return finalBigLogo.isDisplayed();
	}
		
	//Method which click the back home button and we go to first page
	public String backHomeButton()
	{
		backHome.click();
	    return driver.getCurrentUrl();
	}

}
