package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement firstname = driver.findElement(By.name("first_name"));
		
		//sendkeys -- 2 method input and text area
		
		firstname.sendKeys("aastha");
		
		//click()
		driver.findElement(By.name("first_name")).sendKeys("aastha");
		driver.findElement(By.name("last_name")).sendKeys("acharya");
		driver.findElement(By.name("email")).sendKeys("aasthaacharya@gmail.com");
		driver.findElement(By.name("message")).sendKeys("I gali khaing only");
		driver.findElement(By.cssSelector("input[type='reset']")).click();  //css is needed for unique ids 
		
		//isdislayed()
		boolean aa= driver.findElement(By.cssSelector("h2[name]")).isDisplayed(); //contact us 
		System.out.println(aa);
	}

}
