package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest 
{
	
//If we need to save the execution time that time we will use the parallel method 
//In that method we can execute a different different tests in more than 1 browser means we can open the more than 1 browser.
//and we can also open the multiple type of browser at time like Chrome,firefox,edge,Safari etc.(CrosssBroswer Testing)	
	
	@Test
	public void openGoogle() throws Exception //Chrome Browser.
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void openSwagLabs() throws Exception //Firefox Browser.
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void amzonApp() throws Exception //Edge Broswer
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		//Thread.sleep(3000);
		driver.close();
	}
	
	@Test(enabled = true)
	public void rediffMail() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		//Thread.sleep(3000);
		driver.close();
	}
}
