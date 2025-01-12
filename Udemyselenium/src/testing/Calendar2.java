package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Calendar2 {
	    public static void main(String[] args) {
	        // Setup ChromeDriver
	    	WebDriver driver=new ChromeDriver();
	    	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        // Navigate to the website
	        driver.get("https://www.redbus.in/"); // Use the actual URL
	        driver.manage().window().maximize();
	        // Open the date picker
	       WebElement calendar= driver.findElement(By.xpath("//div[@class='sc-kAzzGY cCrHkP']"));
	        // Loop to navigate to the correct month and year
	       calendar.sendKeys("13/06/2025");	 
	    }
}