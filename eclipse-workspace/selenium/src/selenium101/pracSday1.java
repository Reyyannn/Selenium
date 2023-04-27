package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracSday1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/login");
		
		 
		 
		 //Action 
		 driver.manage().window().maximize();
		 driver.findElement(By.id("userName")).sendKeys("rayyenn");
		 driver.findElement(By.id("password")).sendKeys("Zorba123#");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(2000);
		
		 
		 
		// driver.close();
		 
		 
		 //Assertion
		 WebElement searchbox= driver.findElement(By.id("searchBox"));
		 boolean img= searchbox.isDisplayed();
		 if(img) {
			 System.out.println("testcase passed");
		 }

		 else {
			 System.out.println("test fail");
		 }
		 
		 driver.close();
		 
		 
		
		
		
		
		
		
	}

}
