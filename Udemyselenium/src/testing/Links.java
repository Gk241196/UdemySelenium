package testing;
import java.net.HttpURLConnection;
import java.net.URI;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Links {
	public static void main(String args[]) throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//count total number of links
	System.out.println(driver.findElements(By.tagName("a")).size());
	//count total links in the footer section limiting webdriver scope
	WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
    System.out.println(footerdriver.findElements(By.tagName("a")).size());	
    //count links inside the footer and check all links are working
    WebElement columndriver=footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
    System.out.println(columndriver.findElements(By.tagName("a")).size());
    List<WebElement> links = columndriver.findElements(By.tagName("a"));
    System.out.println("Total links in the footer column: " + links.size());
    for(int i=1;i<links.size();i++) {
    	String linkopennewtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
    	links.get(i).sendKeys(linkopennewtab);
    }
     Thread.sleep(2000);
     //print the title of the links in all tabs
        Set<String> obj=driver.getWindowHandles();
        Iterator<String> it=obj.iterator();
        while(it.hasNext()){
        	driver.switchTo().window(it.next());
        	System.out.println(driver.getTitle());
        }
        try {
            // Use URI for better parsing and validation
            URI uri = new URI(links);
            HttpURLConnection connection = (HttpURLConnection) uri.toURL().openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode = connection.getResponseCode();

            if (responseCode >= 200 && responseCode < 400) {
                System.out.println("Working: " + uri);
            } else {
                System.out.println("Broken: " + uri + " (Response Code: " + responseCode + ")");
            }
        } catch (Exception e) {
            System.out.println("Error: Unable to connect to " + uri + " (" + e.getMessage() + ")");
        }
        
    }  
}

