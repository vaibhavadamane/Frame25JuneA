package Page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base1.TestBase1_1;

public class InventoryPage1_1 extends TestBase1_1
{
	 //Object Repo
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
	@FindBy(xpath = "//div[@id='shopping_cart_container']")private WebElement gotoPage3;
	@FindBy(xpath = "//span[@class='title']")private WebElement yourCart;
		
		//Constructor
		public InventoryPage1_1() 
		{
			PageFactory.initElements(driver,this);
		}
		
		//Method
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
		
		//Method which is verify that 2 product add successfully or not
		public String add2Product()
		{
		Select s = new Select(sortDropDown);
		s.selectByVisibleText("Price (low to high)");
		tshirt1.click();
		tshirt2.click();
	    String count = productCounIcon.getText();
	    return count;
	    }
		
		//Method which is verify the 6 product add successfully or not 
		public String add6Product1()
		{
			Select s = new Select(sortDropDown);
			s.selectByVisibleText("Price (low to high)");
			tshirt1.click();
			tshirt2.click();
			blackBag.click();
			blackTShirt2.click();
		    bikeLight.click();
		    grayJacket.click();
			String count = productCounIcon.getText();
			return count;
		   }
		
		//Method which add 6 product and go to next page successfully.
		public boolean add6Product()
		{
			Select s = new Select(sortDropDown);
			s.selectByVisibleText("Price (low to high)");
			tshirt1.click();
			tshirt2.click();
			blackBag.click();
			blackTShirt2.click();
		    bikeLight.click();
		    grayJacket.click();
		    gotoPage3.click(); 
		    return yourCart.isDisplayed();
		}
	}
