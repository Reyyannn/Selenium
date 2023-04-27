package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sday3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 //input is tag name 
		 //for id attribute you use #
		 //for class is .class
		 //for any attribute or vale you can use [name = "usename"]
		 
		 Thread.sleep(5000);
		//action 
		 WebElement user= driver.findElement(By.cssSelector("input[placeholder='Username']"));
		 WebElement pw= driver.findElement(By.cssSelector("input[placeholder='Password']"));
		 WebElement loginbutton= driver.findElement(By.cssSelector("button[type='submit']"));
		 WebElement logo= driver.findElement(By.cssSelector("img[alt='company-branding']"));
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 //valid credintials 
		 user.sendKeys("admin");
		 pw.sendKeys("admin123");
		 loginbutton.click();
		 
		 //Assertion
		 boolean logodisplayed= logo.isDisplayed();
		 if(logodisplayed) {
			 System.out.println("testcase passed");
		 }
		 else {
			 System.out.println("testcase failed");
		 }
		 
		 driver.close();
		 
	}

}
