package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
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
