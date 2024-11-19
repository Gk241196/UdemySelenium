package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DatafromExcel {
	 
	 WebDriver driver;
	 XSSFWorkbook workbook;
	    XSSFSheet sheet;
	    XSSFCell cell;
	
        @BeforeClass 
        public void setUp() {
        	driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
            driver.manage().window().maximize();
}

@AfterClass
	public void readexcel() throws IOException{
			FileInputStream excel=new FileInputStream("D:\\SDET\\TestExcel.xlsx");
			workbook = new XSSFWorkbook(excel);
		     sheet =  workbook.getSheetAt(0);
		     
		     for (int i = 1; i <= sheet.getLastRowNum(); i++) 
		     {
		         XSSFRow row = sheet.getRow(i);
		         if (row != null) {
		             String username = row.getCell(0).getStringCellValue();
		             String password = row.getCell(1).getStringCellValue();

		             WebElement usernamefield = driver.findElement(By.id("username"));
		 	        usernamefield.sendKeys(username);
		 	        
		 	        WebElement passwordfield = driver.findElement(By.id("password"));
		 	        passwordfield.sendKeys(password);
		         }
}
}
}
