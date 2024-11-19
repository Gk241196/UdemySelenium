import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AlertTutorial {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_overlay\"]/a")).click();
		//Handling Alert
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(5000);
		//confirm or cancel
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(5000);
		//prompt alert
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert alert3=driver.switchTo().alert();
		Thread.sleep(5000);
		alert3.sendKeys("Ok");
		alert3.accept();
		}
}
