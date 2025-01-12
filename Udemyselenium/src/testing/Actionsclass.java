package testing;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actionsclass{
    public static void main(String[] args) {
    	WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    //Hover on element
        Actions obj = new Actions(driver);
        WebElement Hover=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        WebElement Ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        obj.moveToElement(Ele).click().keyDown(Keys.SHIFT).sendKeys("Mobiles").build().perform();
        obj.moveToElement(Hover).build().perform();       
   } 
}
