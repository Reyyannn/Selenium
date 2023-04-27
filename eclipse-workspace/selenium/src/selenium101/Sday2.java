package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sday2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Arrangement 
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
		 boolean elementonthewebsite = driver.findElement(By.id("books-wrapper")).isDisplayed();
		 if(elementonthewebsite) {
			 System.out.println("test case passed");
		 }
		 else {
			 System.out.println("test case failed");
		 }
		 
		 driver.close();
		
		
		
		
	}

}
