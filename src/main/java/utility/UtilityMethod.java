package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethod 
{

	public static void selectClass(WebElement ele,String value)//Here we can pass the webelement and value ,when we use that method we can put webelement and value
	{
		Select s = new Select(ele);
		s.selectByVisibleText(value);
		//we use it on inventory page we use it directly
	}
	
}
