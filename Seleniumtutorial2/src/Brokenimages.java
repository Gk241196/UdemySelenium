import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
public class Brokenimages {

	
	public static void main(String args[]) 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://practice.expandtesting.com/broken-images");
		driver.manage().window().maximize();
		List <WebElement> Broken=driver.findElements(By.tagName("img"));
		int brokenImageCount = 0;
		for (WebElement webElement : Broken) 
		{
			
			if(webElement.getAttribute("naturalWidth").equals("0")) 
			{
				
                System.out.println("Broken image: " + webElement.getAttribute("src"));
                brokenImageCount++;
			}
		
		}
		System.out.println("Number of broken images are " +brokenImageCount);
	}
}

			      
			     
