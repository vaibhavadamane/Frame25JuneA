package Page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base1.TestBase1_1;

public class OverviewPage1_1 extends TestBase1_1
{
	
	//Object Repo
    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")private WebElement tshirt1;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")private WebElement bikeLight;
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")private WebElement blackTShirt2;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")private WebElement blackBag;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")private WebElement grayJacket;
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")private WebElement tshirt2;
	@FindBy(xpath = "//div[text()='SauceCard #31337']")private WebElement paymentInformation;
	@FindBy(xpath = "//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement shoppingInformation;
	@FindBy(xpath = "//div[@class='summary_subtotal_label']")private WebElement total;
	@FindBy(xpath = "//div[@class='summary_tax_label']")private WebElement tax;
	@FindBy(xpath = "//div[@class='summary_total_label']")private WebElement totalAmount;
	@FindBy(xpath = "//button[@id='finish']")private WebElement finishButton;
	@FindBy(xpath = "//span[text()='Checkout: Complete!']")private WebElement confirmationComplete;
	    
	//Constructor
	public OverviewPage1_1()
	{
		PageFactory.initElements(driver,this);
	}
		
	//Methods
	//Methods to get the URL of new page
	public String currentUrl() 
	{
		return driver.getCurrentUrl();
	}
		
	//Methods which show that selected product and its praise
	public String product1()
	{
		return tshirt1.getText();
	}
		
	public String product2()
	{
		return bikeLight.getText();
	}
		
	public String product3()
	{
		return blackTShirt2.getText();
	}
	
	public String product4()
	{
		return blackBag.getText();
	}
		
	public String product5()
	{
		return grayJacket.getText();
	}

	public String product6()
	{
		return tshirt2.getText();
	}
		
	//Methods which is information about payment and shopping
	public boolean paymentInfo()
	{
		return paymentInformation.isDisplayed();
	}
		
	public boolean shoppingInfo()
	{
		return shoppingInformation.isDisplayed();
	}

	//Methods which is give information about amount
	public boolean totalLebel()
	{
		return total.isDisplayed();
	}
		
	public boolean taxLebel()
	{
	    return tax.isDisplayed();
	}
		
	public boolean totalAmountlebel()
	{
		return totalAmount.isDisplayed();
	}
		
	//Methods which finish the process and go to final page
	public String finishButton()
	{
		finishButton.click();
		return confirmationComplete.getText();
	}
}
