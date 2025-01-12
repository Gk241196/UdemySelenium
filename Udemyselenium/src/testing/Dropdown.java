package testing;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//select by value
		WebElement obj1=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown1=new Select(obj1);
		dropdown1.selectByValue("AED");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		//select by Text
		dropdown1.selectByValue("INR");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		//select by index
		dropdown1.selectByIndex(2);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		//select dropdown to click multiple times
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		   driver.findElement(By.id("btnclosepaxoption")).click();
		   Assert.assertEquals((driver.findElement(By.id("divpaxinfo")).getText()), "5 Adult");
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
}