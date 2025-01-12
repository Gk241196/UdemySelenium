package testing;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Addtocart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver, itemsNeeded);
		validateCartItemCount(driver, itemsNeeded.length);
	}
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++)
		{
			// Brocolli - 1 Kg
			// Brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether name you extracted is present in arrayList or not-
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName))
			{
				j++;
				// click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
				{
					break;

				}
			}
		}
	}
	public static void validateCartItemCount(WebDriver driver, int expectedItemCount) {
	    // Extract the text containing "Items: X" from the cart header
	    WebElement itemCountElement = driver.findElement(By.xpath("//strong[normalize-space()='3']"));
	    String itemCountText = itemCountElement.getText(); // Example: "Items: 3"
	    // Extract the number after "Items:" using split or regex
	    String displayedCount = itemCountText.split(":")[1].trim();
	    int displayedItemCount = Integer.parseInt(displayedCount); // Convert to integer
	    // Validate that the displayed count matches the expected count
	    if (displayedItemCount == expectedItemCount) {
	        System.out.println("Test Passed: Displayed item count matches the expected count.");
	    } else {
	        System.out.println("Test Failed: Expected " + expectedItemCount + " but got " + displayedItemCount);
	    }
	}
}
