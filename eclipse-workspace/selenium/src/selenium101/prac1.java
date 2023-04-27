package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("aastha");
		 driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("acharya");
		 driver.findElement(By.cssSelector("input[name='email']")).sendKeys("aastha.acharya@gmail.com");
		 driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("hi");
		
		 driver.findElement(By.cssSelector("input[type='submit']")).click();
		 
		 driver.quit();
		
		
		
	}

}
