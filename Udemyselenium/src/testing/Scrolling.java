package testing;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scrolling{
	public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,500)");
	}
}
