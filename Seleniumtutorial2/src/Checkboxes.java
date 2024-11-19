import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkboxes {
	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.leafground.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"menuform:m_checkbox\"]/a/span")).click();
			//Check disabled checkbox
			WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]"));
			boolean disabledcheck=checkbox1.isEnabled();
			System.out.println("Web Element status is"+disabledcheck);
			//select multiple elements and printing it
			WebElement multiple=driver.findElement(By.id("j_idt87:multiple"));
			multiple.click();
			List<WebElement> multiples = driver.findElements(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//label"));
            for (WebElement checkbox : multiples) {
            	 String checkboxText = checkbox.getText();
		            if (checkboxText.equals("Miami") || checkboxText.equals("London")) {
		                checkbox.click();
		                System.out.println("Selected Options: " + checkboxText);
		            }
		        }	
			}				
	}


