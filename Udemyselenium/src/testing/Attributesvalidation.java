package testing;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Attributesvalidation {
	WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	if(driver.findElement(By.id("Div1")).getDOMAttribute("style").contains("1"))
	{
	System.out.println("its enabled");
	Assert.assertTrue(true);
	}
	else
{
	Assert.assertTrue(false);
	}
}
}
