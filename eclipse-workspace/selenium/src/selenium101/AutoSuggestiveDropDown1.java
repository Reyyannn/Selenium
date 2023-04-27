package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		 
		 driver.findElement(By.name("food-item")).sendKeys("h");
		 driver.findElement(By.name("food-item")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.name("food-item")).sendKeys(Keys.ENTER);
		 driver.findElement(By.id("submit-button")).click();
		 if(driver.getCurrentUrl().contains("honey")) {
			 System.out.println("test pass");
		 }
		
		 driver.quit();
		
	}

}
