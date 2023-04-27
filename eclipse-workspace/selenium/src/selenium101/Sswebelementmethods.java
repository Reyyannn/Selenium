package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sswebelementmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//second set of methods 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		 //isenabled
		boolean css = driver.findElement(By.cssSelector("input[value='option-1']")).isEnabled();
		boolean css1= driver.findElement(By.cssSelector("input[value='option-3']")).isDisplayed();
		System.out.println(css);
		System.out.println(css1);
		
		boolean css2= driver.findElement(By.cssSelector("input[value='cabbage']")).isEnabled();
		System.out.println(css2);      //cabbage is not clickable so it is not enabled 
		
		
		//isselected 
		driver.findElement(By.cssSelector("input[value='yellow']")).click();
		boolean selected= driver.findElement(By.cssSelector("input[value='pumpkin']")).isSelected();
		boolean notselected= driver.findElement(By.cssSelector("input[value='blue']")).isSelected();
		
		System.out.println(selected);      //pumpkin is selected so its true 
		System.out.println(notselected);   //blue is not selected so it is false
		
		//submit 
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.name("first_name")).sendKeys("aastha");
		driver.findElement(By.name("last_name")).sendKeys("acharya");
		driver.findElement(By.name("email")).sendKeys("ajhi.skueee");
		driver.findElement(By.name("message")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='SUBMIT']")).submit();
		
		
		//javascript retrives attributes, update, delete
		
		//element retrives, delete, add, update
		
		//Database     ------ API    ----------- UI(html , css , javascript)
				// html hypertext markup language 
				// css
				// javascript
				// element - html elements
				// html will attribute and value 
				// on user actions 
				// element are created , updated , retrieve and deleted
				// based on user action 
				// html element's attribute are created , updated , retrive , deleted
	}

}
