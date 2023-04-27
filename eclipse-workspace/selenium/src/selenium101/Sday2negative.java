package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sday2negative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/login");
		 
		 //Action
		 
		 driver.manage().window().maximize();
		 driver.findElement(By.id("userName")).sendKeys("lily");
		 driver.findElement(By.id("password")).sendKeys("Zorba123#");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(3000);
		 
		 //Assertion
		 boolean errormsg= driver.findElement(By.id("name")).isDisplayed();
		 
		 if(errormsg) {
			 System.out.println("testcase pass");
		 }
		 else{
			 System.out.println("testcase failed");
		 }
		
		
		
		
	}

}
