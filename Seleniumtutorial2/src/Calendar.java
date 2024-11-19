import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	driver.get("https://www.leafground.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("menuform:j_idt41")).click();
	driver.findElement(By.xpath("//*[@id=\"menuform:m_calendar\"]")).click();
}
}