package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sday4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		// driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		
		// driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 
		//locate by ID attribute 
		// driver.findElement(By.id("checkboxes")).isDisplayed();
		 
		//locate element by attribute Name 
		 //driver.findElement(By.name("vegetable")).isDisplayed();
		 
		 //locate the element by tagName
		 //driver.findElement(By.tagName("form")).isDisplayed();
		 
		 //locate the element by Css selector 
		 //driver.findElement(By.cssSelector("#checkboxes")).isDisplayed();
		 
		 
		 
		 driver.get("http://webdriveruniversity.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		//locate the element by Link
		 driver.findElement(By.linkText("Automationteststore")).isDisplayed();
		 
		 //locate the element by partial link 
		 driver.findElement(By.partialLinkText("PORTAL")).isDisplayed();
		 
		 // attribute EX: id= "a"
		 //webelement: opening tag "h1"
		 //to get elemwnt: "driver.findelement"
		 //method: is displayed,click, gettext,get attribute
		 
		 
		 //locate the element by classNamw
		 driver.findElement(By.className("navbar-brand")).isDisplayed();
		 
		 //locate the element by xpath 
		 driver.findElement(By.xpath("//*[@id=\"to-do-list\"]/div/div[1]")).isDisplayed();
		 
		 //locate the element by css selector 
		 driver.findElement(By.cssSelector("#login-portal > div > div.caption")).isDisplayed();
		 
		 
	}

}
