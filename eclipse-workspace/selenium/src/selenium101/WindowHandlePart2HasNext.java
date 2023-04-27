package selenium101;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePart2HasNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/");
		 
	//	 driver.findElement(By.id("contact-us")).click();
	//	String parentt= driver.getWindowHandle();
	//	System.out.println(parentt);         //gives you the id of the contact us website
	//	Set <String> tabwindoww= driver.getWindowHandles();   //goes from one id to another id
	//	System.out.println(tabwindoww);
	//	Iterator<String> is= tabwindoww.iterator();
		
		
	//	while(is.hasNext()) {
//			String childtabwindow= is.next();
	//		if(!parentt.equals(childtabwindow)) {
	//			driver.switchTo().window(childtabwindow);
	//			if(driver.getTitle().contains("WebDriverUniversity.com")) { //or for childclass // WebDriver | Contact Us
	//				System.out.println("testcase has passeddd");
	//			}
	//		}
	//	}
		
	///// trying with button click
		
		driver.findElement(By.id("button-clicks")).click();
		String parentclass= driver.getWindowHandle();
		System.out.println(parentclass);
		Set <String> window= driver.getWindowHandles();
		System.out.println(window);
		Iterator<String> ss= window.iterator();
		
		while(ss.hasNext()) {
			String child= ss.next();
			if(!parentclass.equals(child)) {
				driver.switchTo().window(child);
				if(driver.getTitle().contains("WebDriverUniversity.com")) {
					System.out.println("pass");
				}
			}
		}   /////////errorrr
		
//		driver.findElement(By.id("login-portal")).click();
//		String parenttclass= driver.getWindowHandle();
//		System.out.println(parenttclass);
//		Set <String> windoow= driver.getWindowHandles();
//		System.out.println(windoow);
//		Iterator<String> ww= windoow.iterator();
		
//		while(ww.hasNext()) {
//			String child= ww.next();
//			if(!parenttclass.equals(child)) {
//				driver.switchTo().window(child);
//				if(driver.getTitle().contains("WebDriverUniversity.com")) {
//					System.out.println("passedd");
//				}
//			}
//		}
		
	}

}
