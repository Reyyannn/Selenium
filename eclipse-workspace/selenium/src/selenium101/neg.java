package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class neg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//negative
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		
		 WebElement firstname= driver.findElement(By.cssSelector("input[name='first_name']"));
		 WebElement lastname= driver.findElement(By.cssSelector("input[name='last_name']"));
		 WebElement emailadd= driver.findElement(By.cssSelector("input[name='email']"));
		 WebElement comment= driver.findElement(By.cssSelector("textarea[name='message']"));
		 WebElement submit= driver.findElement(By.cssSelector("input[value='SUBMIT']"));
		 Thread.sleep(3000);
		 
		 firstname.sendKeys("alsliid");
		 lastname.sendKeys("829dmkv");
		 emailadd.sendKeys("aksjiud");
		 comment.sendKeys("wrong");
		 submit.click();
		 Thread.sleep(3000);
		 
		//assertion
		 
		 
		Thread.sleep(5000);
		
		if(driver.getCurrentUrl().contains("contact_us.php")) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase failed");
		}
		
		
	//	WebElement errormsg= driver.findElement(By.cssSelector("contact_us.php"));
		//boolean error= errormsg.isDisplayed();
		//if(error) {
			//System.out.println("testcase has passed");
			
		//}
		//else {
			//System.out.println("test case has failed");
		//}
		 
		//driver.quit();
		
		
		
		
	}

}
