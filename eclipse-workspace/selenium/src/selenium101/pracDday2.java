package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracDday2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 driver.manage().window().maximize();
		 WebElement fname= driver.findElement(By.name("first_name"));
		 WebElement lname= driver.findElement(By.name("last_name"));
		 WebElement email= driver.findElement(By.name("email"));
		 WebElement message= driver.findElement(By.name("message"));
		Thread.sleep(2000);
		 
		 fname.sendKeys("aastha");
		 lname.sendKeys("acharya");
		 email.sendKeys("aacharya.lopez@gmail.com");
		 message.sendKeys("larning");
		 driver.findElement(By.cssSelector("input[type='submit']")).click();
		 Thread.sleep(3000);
		 
		 
		//when using submit method you have to find the one that says form on when inspecting 
		//driver.quit();
		
		//assertion
		//WebElement rightmsg= driver.findElement(By.id("contact_reply"));
		//boolean thankyou= rightmsg.isDisplayed();
		
		//if(thankyou) {
		//	System.out.println("pass");
		//}
		//else {
		//	System.out.println("fail");
		//}
		
		//driver.close();    //not working without webelemnt or with webelement 
		
  	WebElement sucessMsg = driver.findElement(By.id("contact_reply"));
       if(sucessMsg.isDisplayed()){
			System.out.println("Test Case Pass 2");
}
         else {		System.out.println("Test Case Fail 2");
	}
	}

}
