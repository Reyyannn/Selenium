package selenium101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		 
		 driver.findElement(By.id("myInput")).sendKeys("H");
		List <WebElement> listing= driver.findElements(By.cssSelector("#myInputautocomplete-list >div"));
		
		for(int i=0; i<listing.size();i++) {
			System.out.println(listing.get(i).getText());
			
			if(listing.get(i).getText().equals("Honey")) {
				listing.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("submit-button")).click();
		if(driver.getCurrentUrl().contains("Honey")) {
			System.out.println("case passed");
		}
		Thread.sleep(3000);
		driver.quit();
		
	}    

}
