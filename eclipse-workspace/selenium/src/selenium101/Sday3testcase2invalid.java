package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sday3testcase2invalid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
 //test case 2
		 
		 WebElement user= driver.findElement(By.cssSelector("input[placeholder='Username']"));
		 WebElement pw= driver.findElement(By.cssSelector("input[placeholder='Password']"));
		 WebElement loginbutton= driver.findElement(By.cssSelector("button[type='submit']"));
		 
		 //invalid credintials 
		 
		 user.sendKeys("amnin");
		 pw.sendKeys("ksiu09");
		 loginbutton.click();
		 
		//assertion
		Thread.sleep(5000);
		WebElement errormsg= driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p']"));
		boolean error= errormsg.isDisplayed();
		if(error) {
			System.out.println("testcase has passed");
			
		}
		else {
			System.out.println("test case has failed");
		}
		 
		driver.close();
		
		
	}

}
