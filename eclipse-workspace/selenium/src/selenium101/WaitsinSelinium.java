package selenium101;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsinSelinium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		 
		 WebElement duration= driver.findElement(By.id("login-portal"));
		 
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		 WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(2));
		 
		 wait.until(ExpectedConditions.visibilityOf(duration));
		 wait1.until(ExpectedConditions.elementToBeClickable(duration));
		 
		 
		// why we required wait 
		 
			// client -- request --- server and create element from reponse
			// If response is delayed elements are not created
			// So we have wait for element to be created 
			
			
			// 1) Implicit wait - dynamic in nature
			// 2) Explicit wait - dynamic in nature
			// 3) Thread.sleep() - static in nature
			// 4) Fluent wait() - dynamic in nature
			
			
			// Static 
			// Thread.sleep(5000) --- 3
			
			
			// Dynamic  - 5 seconds
			// Element in 3 second ---- continue execution
			
			
			// Implicit
		
			
			
			// e1 - 20
			
			// e2 - 3
			
			// e3 -4

			
			// e4- 2
			
			// e5 -5
			
			// e6 - 3
			
			// Explicit wait ----  on one particular element 
		 
		 Wait <WebDriver> waitt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ZERO.ofSeconds(3)).withMessage("learning").ignoring(NoSuchElementException.class);
		 
		 waitt.until(ExpectedConditions.elementToBeClickable(duration));
				 
	}

}
