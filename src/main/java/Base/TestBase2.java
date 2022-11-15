package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase2 
{
	 public static WebDriver driver;
public void initalization()
{
 
	System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\Driver\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/");
	}
}
