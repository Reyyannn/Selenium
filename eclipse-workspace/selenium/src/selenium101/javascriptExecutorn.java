package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutorn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
//		 driver.get("https://www.webdriveruniversity.com/");
		 
//		 System.out.println(driver.getTitle());
		
//		 JavascriptExecutor js= (JavascriptExecutor) driver;
//		 String javascript = "return document.title";
//		 String jss= (String)js.executeScript(javascript);
//		 System.out.println(jss);      //returns you title 
		 
		 //getting the element 
		 
//		 String javascript1= "return document.querySelector('#contact-us')";
//		 WebElement element= (WebElement)js.executeScript(javascript1);
//		 System.out.println(element.getText());   //gives you the text 
		 
		 //program2
		 
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		 WebElement ifram= driver.findElement(By.cssSelector("#iframeResult"));
		 driver.switchTo().frame(ifram);

		 //javascript same implementation to selenium 
		 
		 JavascriptExecutor javascri= (JavascriptExecutor) driver;
		 String javascript2= "myFunction()";
		 javascri.executeScript(javascript2);
		 driver.switchTo().alert().accept();
		 Thread.sleep(5000);
		 
		 driver.quit();
		 
		
		
	}

}
