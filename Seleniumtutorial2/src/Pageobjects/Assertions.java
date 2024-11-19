package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Assertions {
		@Test
		public void Hardassert() 
		{
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	        driver.get("https://www.flipkart.com");
	        //String actualTitle = driver.getTitle();
	        //Assert.assertTrue(actualTitle.contains("flipkart"), "Title does not contain 'flipkart'");
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertEquals(currentUrl, "https://www.flipkart.com/", "URL does not match the expected URL");
		}
		@Test
		public void Softassert() {
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			SoftAssert softAssert = new SoftAssert();
			driver.get("https://www.flipkart.com");
	        String actualTitle = driver.getTitle();
	        softAssert.assertTrue(actualTitle.contains("flipkart"), "Title does not contain 'flipkart'");
	        String currentUrl = driver.getCurrentUrl();
	        softAssert.assertEquals(currentUrl, "https://www.flipkart.com/", "URL does not match the expected URL");
	        System.out.println("Continuing with the test even after soft assertions");
	        driver.quit();
	        softAssert.assertAll();
		}	
}

