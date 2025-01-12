package testing;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locators {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		    driver.get("https://www.amazon.in");
		    driver.manage().window().maximize();	
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus");
            driver.findElement(By.className("nav-right")).click();
            driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][text()='Get It by Tomorrow']")).click();
//            WebElement obj1= driver.findElement(By.name("field-keywords"));
//            obj1.click();
            System.out.println(driver.findElement(By.tagName("h2")).getText());
            Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "See personalized recommendations");
		  //  driver.quit(); 
	}

}
