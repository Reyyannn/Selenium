package selenium101;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/");
		
		 driver.findElement(By.id("contact-us")).click();
		 String parentclass= driver.getWindowHandle();
		 System.out.println(parentclass);
		 Set <String> tabwindow = driver.getWindowHandles();  //goes to id to id2 (another tab id)
		 System.out.println(tabwindow);     //gives you both the windows 
		 
		 Iterator<String> Is= tabwindow.iterator();
		 String parent= Is.next();        //goes to next tab (to the next tab id)
		 String parentchild= Is.next();
		 System.out.println(parent);    //gives you all the two windows  //moving from parent to child
		 System.out.println(parentchild);  //gives you parentchild id 
		
		
		 //window handle onlly returns parent 
		 //window handles gives you all the tabs, all the ids for the tabs opened 
		 //with window handles you can create iterator 
		
		driver.switchTo().window(parentchild);     //switches back to parent if you want to go back to just parent id
		driver.findElement(By.cssSelector("h2[name='contactme']")).isDisplayed(); // whichever tab you switched
		driver.switchTo().window(parent);
		if(driver.getTitle().equals("WebDriverUniversity.com")) {
			System.out.println("testcase has passed");
		}
		else {
			System.out.println("it has failed");
		}
		
		driver.quit();
		
		
	}

}
