package testing;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.findElement(By.xpath("//input[@name='field-keywords']")).click();
    //sibling and parent traverse
    
}
}