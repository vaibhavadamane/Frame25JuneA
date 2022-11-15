package Base1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadData1_1;

public class TestBase1_1
{
    //This class will be extended to all page classes and test classes.	
		
	public static WebDriver driver;//Due to the excess in all class we can create it as global and public static
	
	//This method open the browser and enter the application URL.
	
	public void initalization() throws Exception
	{
		String bro = ReadData1_1.readPropertyfile1("browser");
		if(bro.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(bro.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if(bro.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
//	WebDriverManager.chromedriver().setup();
//  driver =new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get(ReadData1_1.readPropertyfile("url"));
	}
}