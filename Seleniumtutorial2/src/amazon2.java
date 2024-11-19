import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class amazon2 {
    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe"); // Update with the path to your chromedriver
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Step 1: Open Amazon website
            driver.get("https://www.amazon.in");

            // Step 2: Search for "iPhone" in the search box
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("iPhone");
            searchBox.submit();

            // Step 3: Wait for search results to load and look for "iPhone 14 Starlight"
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.a-size-medium")));
            List<WebElement> searchResults = driver.findElements(By.cssSelector("span.a-size-medium"));

            // Loop through the results to find "iPhone 14 Starlight"
            for (WebElement result : searchResults) {
                if (result.getText().contains("iPhone 14 Starlight")) {
                    result.click();
                    break;
                }
            }

            // Step 4: Wait until the product page loads and locate the "Add to Cart" button
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));

            // Step 5: Click the "Add to Cart" button
            WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
            addToCartButton.click();

            System.out.println("Product added to cart successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

