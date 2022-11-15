package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase
{
    //Object Repo
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")private WebElement removeProduct;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkOut;
	@FindBy(xpath="//span[@class='title']")private WebElement checkoutSucessFully;
	
    //Constructor	
	public CartPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	//Method which remove one product and checkout and go to page4
	public boolean checkOut()
	{
		checkOut.click();
		return checkoutSucessFully.isDisplayed();
	}
	}
