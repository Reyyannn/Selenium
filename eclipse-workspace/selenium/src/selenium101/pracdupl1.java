package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracdupl1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/login");
		 
		 //action
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input[placeholder='UserName']")).sendKeys("rayyenn");
		 driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Zorba123#");
		 driver.findElement(By.cssSelector("button[id='login']")).click();
		 Thread.sleep(2000);
		 
		// driver.close()
		 
		 //assertion 
		 boolean eldashboard= driver.findElement(By.cssSelector("input[id='searchBox']")).isDisplayed();
		 if(eldashboard) {
			 System.out.println("testcase has passed");
		 }
		 else {
			 System.out.println("testcase failed");
		 }
		 
		 driver.close();
		
		
	}

}
