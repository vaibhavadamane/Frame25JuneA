package utility;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import Base1.TestBase1_1;
import Page.CompletePage;

public class CaptureScreenshot extends TestBase1_1
{
	static CompletePage com;
	public void object()
	{
	    com = new CompletePage();
	}

	//This method give us the screenshot of that Webpage which is test case will be failed.and it will be declared at closebroswer method
	public static void Screenshot() throws Exception  
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\ScreenShots/Photo1.jpeg");
		FileHandler.copy(source, dest);
	}
	
	//This gives the failed test case screenshot with the test case or method name
	public static void Screenshot1(String name) throws Exception //Here this method give us method name which give by it.getName(); method 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\ScreenShots/"+name+".jpeg");
		FileHandler.copy(source, dest);
	}
	
	//This Method give us to takeScrrenshot of particular area which is test case is get failed.
	public static void Sreenshots2(String name) throws Exception
	{
        File source = com.finalBigLogo1.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\ScreenShots/"+name+".jpeg");
        FileHandler.copy(source, dest);
	}
	
	public static void fullScrrenShot() throws Exception
	{
        File sourse = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\ScreenShots/Photo2.jpeg");
		FileHandler.copy(sourse, dest);
		
	}
	
}
