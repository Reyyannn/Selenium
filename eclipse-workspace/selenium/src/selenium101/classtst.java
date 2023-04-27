package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classtst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 //Action
		WebElement firstname= driver.findElement(By.cssSelector("input[name='first_name']"));
		 WebElement lastname= driver.findElement(By.cssSelector("input[name='last_name']"));
		 WebElement emailadd= driver.findElement(By.cssSelector("input[name='email']"));
		 WebElement comment= driver.findElement(By.cssSelector("textarea[name='message']"));
		 WebElement submit= driver.findElement(By.cssSelector("input[value='SUBMIT']"));
		 Thread.sleep(3000);
		 
		 //valid credintials
		 firstname.sendKeys("aastha");
		 lastname.sendKeys("acharya");
		 emailadd.sendKeys("aastha.acharya@gmail.com");
		 comment.sendKeys("hello learning");
		 submit.click();
		 Thread.sleep(3000);
		 
		 
		 //Assertion
		 Thread.sleep(5000);
		 boolean msgdisplayed= driver.findElement(By.cssSelector("div [id='contact_reply']")).isDisplayed();
		 if(msgdisplayed) {
			 System.out.println("test caase pass");
		 }
		 else {
			 System.out.println("test case failed");
		 }
		 driver.quit();
		 
		 //negative Testcase
		 
		 firstname.sendKeys("alsliid");
		 lastname.sendKeys("829dmkv");
		 emailadd.sendKeys("aksjiud");
		 comment.sendKeys("wrong");
		 submit.click();
		 Thread.sleep(3000);
		 
		//assertion
		Thread.sleep(5000);
		WebElement errormsg= driver.findElement(By.cssSelector("body[data-new-gr-c-s-check-loaded"));
		boolean error= errormsg.isDisplayed();
		if(error) {
			System.out.println("testcase has passed");
			
		}
		else {
			System.out.println("test case has failed");
		}
		 
		driver.quit();
		
		
		//reset
		
		WebElement firstname1= driver.findElement(By.cssSelector("input[name='first_name']"));
		 WebElement lastname1= driver.findElement(By.cssSelector("input[name='last_name']"));
		 WebElement emailadd1= driver.findElement(By.cssSelector("input[name='email']"));
		 WebElement comment1= driver.findElement(By.cssSelector("textarea[name='message']"));
		 WebElement submit1= driver.findElement(By.cssSelector("input[value='SUBMIT']"));
		 Thread.sleep(3000);
		 
		 //valid credintials
		 firstname1.sendKeys("aastha");
		 lastname1.sendKeys("acharya");
		 emailadd1.sendKeys("aastha.acharya@gmail.com");
		 comment1.sendKeys("hello learning");
		 submit1.click();
		 Thread.sleep(3000);
		
		 //assertion
		boolean resett= driver.findElement(By.cssSelector("input[value='RESET']")).isDisplayed();
		if(resett) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase fail");
		}
		
		driver.close();
		
		
		
	}

}
