package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadData1_1;

public class TestBase 
{
    //This class will be extended to all page classes and test classes.	
		
	public static WebDriver driver;//Due to the excess in all class we can create it as global and public static
	
	//This method open the browser and enter the application URL.
	
	public void initalization() throws Exception
	{
//	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Eclipse Workplace\\Frame25JuneA\\Driver\\chromedriver.exe");	
	ChromeOptions o = new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
	driver =new ChromeDriver(o);
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.saucedemo.com/");
//	driver.get(ReadData1_1.readPropertyfile1("url"));	
	}
}


