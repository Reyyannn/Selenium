package selenium101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframetotalnumberofinsideapage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.webdriveruniversity.com/");
		
		 //finding total number of links inside a page 
		 
		 List<WebElement> someList= driver.findElements(By.tagName("a"));
		
		 System.out.println(someList.size());    //total number of links

		 //this gives you how many links are inside the tagname a 
		 //gives you all the a, the anchor type of the page 
		 
		 
		 
		 for(int i=0; i<someList.size();i++) {
		//	 System.out.println(someList.get(i).getText()); //gives you of all the text with the link 
			 System.out.println(someList.get(i).getAttribute("href"));
		 }// this gives you the proper link that gives you href attribute 
		 
		 driver.quit();
		 
		 
		
		
	}

}
