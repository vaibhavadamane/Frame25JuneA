package utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1_1 
{

	public static String readPropertyfile(String value) throws Exception
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\TestData\\conifig.Property");
	    prop.load(file);
		return prop.getProperty(value);
	//Here we can store the data into file variable and load this file into properties class then return value form
	//property class through readPropertyfile method and call this method to another class/Package declare it as static	
   }
	
    public static String readExcelFile(int rowNum,int colNum) throws Exception
    {
    	FileInputStream file1 = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\TestData\\SwagLabLoginPage.xlsx");
    	Sheet excel = WorkbookFactory.create(file1).getSheet("Sheet1");
    	String value = excel.getRow(rowNum).getCell(colNum).getStringCellValue();
    	return value;
    }
    
    //Read the excel sheet by using the for loop
    public static void main(String [] args) throws Exception
    {
    	FileInputStream f = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\TestData\\SwagLabLoginPage.xlsx");
    	Sheet excel = WorkbookFactory.create(f).getSheet("Sheet1");
    for(int row=0;row<17;row++)
    {
    for(int col=0;col<1;col++)
    {
    	String value = excel.getRow(row).getCell(col).getStringCellValue();
        System.out.print(value);
    }
        System.out.println();	
    }
     }
    
    public static String readPropertyfile1(String value) throws Exception 
    {
    	Properties prop = new Properties();
    	FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\TestData\\property.file");
    	prop.load(file);
    	return prop.getProperty(value);
     }
    
    public static String readExcelFile1(int row,int col) throws Exception
    {
    	FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Frame25JuneA\\TestData\\demoexcelsheet.xlsx");
    	Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
    	return excel.getRow(row).getCell(col).getStringCellValue();
    }
}