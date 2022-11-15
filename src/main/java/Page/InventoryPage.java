package Page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import utility.UtilityMethod;

public class InventoryPage extends TestBase
{
	
   
	//Object Repo
	@FindBy(xpath = "//div[@class='app_logo']")private WebElement smallLogo1;
	@FindBy(xpath = "//div[@class='peek']")private WebElement bigLogo;
	@FindBy(xpath = "//select[@class='product_sort_container']")private WebElement sortDropDown;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement tshirt1;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLight;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement blackTShirt2;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement blackBag;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement grayJacket;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement tshirt2;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")private WebElement productCounIcon;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")private WebElement grayJacketRemove;
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")private WebElement tshirt2Remove;
	@FindBy(xpath = "//li[@class='social_twitter']")private WebElement twitterLogo;
	@FindBy(xpath = "//li[@class='social_facebook']")private WebElement facebookLogo;
	@FindBy(xpath = "//li[@class='social_linkedin']")private WebElement linkedInLogo;
	@FindBy(xpath = "//div[@id='shopping_cart_container']")private WebElement gotoPage3;
	@FindBy(xpath = "//span[@class='title']")private WebElement yourCart;
	
	//Constructor
	public InventoryPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	//Method to verify title 
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	//Method to verify the current URL
	public String verigyCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
    //Method to verify the smallLogo
	public boolean verifySmallLogo() 
	{
		return smallLogo1.isDisplayed();
	}
	
	//Method to verify the bigLogo
	public boolean verifyBigLogo()
	{
		return bigLogo.isDisplayed();
		
	}
	
	//Method to verify product add to cart correctly or not give the total product counting and go to next page.
	public boolean add6Product()
	{
//		Select s = new Select(sortDropDown);
//		s.selectByVisibleText("Price (low to high)");
		UtilityMethod.selectClass(sortDropDown,"Price (low to high)");
		tshirt1.click();
		tshirt2.click();
		blackBag.click();
		blackTShirt2.click();
	    bikeLight.click();
	    grayJacket.click();
	    gotoPage3.click(); 
	    return yourCart.isDisplayed();
	}
	
	//Method which is get the all option present into Drop down.
    public List<WebElement> getoptions()
	{
		Select s = new Select(sortDropDown);
		List<WebElement> cartOption = s.getOptions();
	    return cartOption;
	}
	
	//Method to remove product from cart
	public String remove2Product()
	{   tshirt1.click();
	    tshirt2.click();
	    blackBag.click();
	    grayJacket.click();
		grayJacketRemove.click();
		tshirt2Remove.click();
		String count = productCounIcon.getText();
	    return count;
	}
	
	//Method to verify Twitter logo.
	public boolean verifytwitterLogo()
	{
		return twitterLogo.isDisplayed();
	}
	
	//Method to verify FaceBook logo.
	public boolean verifyfacebookLogo()
	{
		return facebookLogo.isDisplayed();
	}
		
	//Method to verify LinkedIn logo.
	public boolean verifylinkedInLogo()
	{
		return linkedInLogo.isDisplayed();
	}
	
	//Method to add a 2 product
	public String add2Product()
	{
	Select s = new Select(sortDropDown);
	s.selectByVisibleText("Price (low to high)");
	tshirt1.click();
	tshirt2.click();
    String count = productCounIcon.getText();
    return count;
    }

}
