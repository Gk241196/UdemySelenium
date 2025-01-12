package testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookies {
	public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	driver.get("https://expandtesting.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

}
}