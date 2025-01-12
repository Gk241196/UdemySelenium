package testing;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calendar {
	public static void main(String args[]) throws InterruptedException {
	 // Setup ChromeDriver
    	WebDriver driver=new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Navigate to the website
        driver.get("https://www.redbus.in/"); // Use the actual URL
        driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div")).click();
	    String desired_month = "JUN 2025";
	    String desired_date = "24";
	        while (true) {
	       String actual_month = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[2]")).getText();
	            System.out.println(actual_month);
	            if (actual_month.contains(desired_month)) {
	                System.out.println(actual_month);
	                break;
	            } else {
	                driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[3]")).click(); // next month
	            }
	        }
	        driver.findElement(By.xpath("//td[contains(@class, 'day') and text()='" + desired_date + "']")).click();
	}
}
//	        int column_size = 7; // as per the days (Mon - Sun)
//	        int flag = 0;
//	        int row_size = driver.findElements(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div")).size(); // 8
//	        for(int i = 2; i<=row_size; i++){ // row
//
//	            for(int j = 1; j<= column_size; j++){ // column
//
//	                String actual_date = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div["+i+"]/span/div["+j+"]")).getText();
//
//	                if(actual_date.equals(desired_date)){
//	                    driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div["+i+"]/span/div["+j+"]")).click();
//	                    flag = 1; // set flag = 1
//	                    Thread.sleep(3000);
//	                    break; // breaking out of inner loop
//	                }
//	                else{
//	                    continue;
//	                }
//	            }
//	            if(flag == 1){ // selection of the date is done
//	                break;
	            //}
	     
	   
	


