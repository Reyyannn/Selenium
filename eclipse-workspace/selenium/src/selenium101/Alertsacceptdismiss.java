package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsacceptdismiss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
	//	 driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		 //alert 
		 
		//driver.findElement(By.id("button1")).click();
		//driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		//driver.quit();
		
		//confirm
		
	//	driver.findElement(By.id("button4")).click();
	//	driver.switchTo().alert().accept();
	//	String text= driver.findElement(By.id("confirm-alert-text")).getText();
	//	System.out.println(text);
	//	driver.quit();
		
		
		//dismiss
		
//		driver.findElement(By.id("button4")).click();
//		driver.switchTo().alert().dismiss();
//		String dismiss= driver.findElement(By.id("confirm-alert-text")).getText();
//		System.out.println(dismiss);
//		driver.quit();
		
		//prompt alert //for cancel
		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
//		driver.switchTo().alert().sendKeys("Textsomething");
//		driver.switchTo().alert().accept();
//		String value= driver.findElement(By.id("result")).getText();
//		if(value.equals("You entered: Textsomething")) {
//			System.out.println("testcase pass");
//		}
//		else {
//			System.out.println("fail");
//		}
//		driver.quit();
		
		//re practiced Confirm alert   // when you click on ok for alert 
    //    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		 driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
//		driver.switchTo().alert().sendKeys("I am a JS Confirm");
//		driver.switchTo().alert().accept();
//		String valuee= driver.findElement(By.id("result")).getText();
//		if(valuee.equals("You clicked: Ok")){
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
		
//		driver.quit();    //why is it an arrow
		
		//REEEE
//	 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
//		driver.switchTo().alert().sendKeys("I am a JS Alert");
//		driver.switchTo().alert().accept();
//		String result = driver.findElement(By.id("result")).getText();
//		if(result.contains("You successfully clicked an alert")) {
//			System.out.println("passs");
//		}
//		else {
//			System.out.println("fail");   ////don't work errorr
//		}
		
		//prompt alert dismiss 
		
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		 driver.switchTo().alert().dismiss();
		 String dismissvalue= driver.findElement(By.id("result")).getText();
		 if(dismissvalue.contains("You entered: null")) {
			 System.out.println("passedddd");
		 }
		 else {
			 System.out.println("failllll");
		 }
		
		
	}

}
