package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracD22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 //ChromeDriver driver = new ChromeDriver();
		// driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
	//WebElement user= driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	//WebElement lastname= driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	//WebElement email= driver.findElement(By.cssSelector("input[placeholder='Email Address']"));
	//WebElement msg= driver.findElement(By.cssSelector("textarea[placeholder='Comments']"));
	//WebElement sub= driver.findElement(By.cssSelector("input[value='SUBMIT']"));
	//WebElement tagName= driver.findElement(By.tagName("h2"));
	
	//if(tagName.isDisplayed()) {
		//System.out.println("true and test case passed");
	//}
	//else {
		//System.out.println("failed");
	//}
	
	//Thread.sleep(2000);
	//user.sendKeys("aastha");
	//lastname.sendKeys("acharya");
	//email.sendKeys("aastha.acharya@gmail.com");
	//msg.sendKeys("learningg");
	
	//sub.submit();
	
	//driver.close();
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	 
	 System.out.println(driver.findElement(By.cssSelector("input[value= 'cabbage']")).isDisplayed());
	 System.out.println(driver.findElement(By.cssSelector("input[value= 'lettuce']")).isEnabled());
	 System.out.println(driver.findElement(By.cssSelector("input[value= 'pumpkin']")).isSelected());
	
	 
	 driver.quit();
	}

}
