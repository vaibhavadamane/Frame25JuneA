package Page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base1.TestBase1_1;

public class CartPage1_1 extends TestBase1_1 
{
    //Object Repo
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")private WebElement removeProduct;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkOut;
	@FindBy(xpath="//span[@class='title']")private WebElement checkoutSucessFully;
	
    //Constructor	
	public CartPage1_1()
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
