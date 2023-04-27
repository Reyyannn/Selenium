package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
	//	 driver.get("https://www.webdriveruniversity.com/IFrame/index.html");
		 
	//	boolean xpath= driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")).isDisplayed();
		
	//	if(xpath) {
	//		System.out.println("testcase pass");
	//	}
	//	else {
	//		System.out.println("fail");
	//	}    //it will show error bc you have to enter iframe, you can do iframe from three id, name, and webelement 
		
	//	WebElement ff= driver.findElement(By.id("frame"));     //iframe you can do it with three (name, webelement, id)
	//	driver.switchTo().frame(ff);
		
	//	boolean xpath= driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")).isDisplayed();
	//	if(xpath) {
	//		System.out.println("testcase pasas");
	//	}
	//	else {
	//		System.out.println("fail");
	//	}
		
		
		//for w3school
		//with index 
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		
	//	WebElement byid= driver.findElement(By.id("iframeResult")); //from id
	//	WebElement byname= driver.findElement(By.name("iframeResult"));// from name 
		
//		driver.switchTo().frame("iframeResult");
//		boolean schoolwbsite= driver.findElement(By.xpath("/html/body/h1")).isDisplayed();
//		if(schoolwbsite) {
//			System.out.println("testcase pass");
//		}
//		else {
//			System.out.println("faillll");       //gives you the xpath for body 
//		}
		
		
		//getting total number of iframe inside the page 
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
	}

}
