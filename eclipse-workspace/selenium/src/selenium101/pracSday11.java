package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracSday11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement user= driver.findElement(By.cssSelector("input[placeholder='Username']"));
		 WebElement pw= driver.findElement(By.cssSelector("input[placeholder='Password']"));
		 WebElement loginbutton= driver.findElement(By.cssSelector("button[type='submit']"));
		 
		 user.sendKeys("Admin");
		 pw.sendKeys("admin123");
		 loginbutton.click();
		 
		 
		 //assertion 
		 Thread.sleep(2000);
		 WebElement token = driver.findElement(By.cssSelector("img[alt='profile picture']"));
		 
		 
		 boolean tokenisdisplayed = token.isDisplayed();
		 if(tokenisdisplayed) {
			 System.out.println("true and testcase pass");
		 }
		 else {
			 System.out.println("test case failed");
		 }
		 
		
		driver.quit();
		
		
		
		
	}

}
