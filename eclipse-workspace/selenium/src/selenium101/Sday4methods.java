package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sday4methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://webdriveruniversity.com/");
		
		 WebElement checking= driver.findElement(By.cssSelector("input[name=\"email"));
		
		 //methods 
		 
		 //sendkeys- if it sent or not 
		 //isdisplayed- if it is displayed or not 
		 //isselected- if it is selected or not 
		 //submit- form: if it has the form attribute if there is button you can use that 
		 //is enabled- when the element is not intractable , it is not unable
		 //getLocation- the location where it is located
		 //clear- clearing everything
		 //getText- getting the text
		 //getTagName
		 //getCssValue
		 //getAttribute
		 
		
	}

}
