package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 
//		 driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
//		 driver.switchTo().alert().accept();
//		String r= driver.findElement(By.id("result")).getText();
//		if(r.equals("You successfully clicked an alert")) {
//			System.out.println("testcase has passed");
//		}
//		else {
//			System.out.println("it has failed");
//		}
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		driver.switchTo().alert().accept();
		String c= driver.findElement(By.id("result")).getText();
		if(c.equals("You clicked: Ok")) {
			System.out.println("passed");
		}
		else {
			System.out.println("fail");
		}
		
		
		//for cancel //dismiss
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		driver.switchTo().alert().dismiss();
		String dismiss= driver.findElement(By.id("result")).getText();
		if(dismiss.equals("You clicked: Cancel")) {
			System.out.println("passeddd");
		}
		else {
			System.out.println("failll");
		}
		
		String msg= "idkk";
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys(msg);
		driver.switchTo().alert().accept();
		String prompt= driver.findElement(By.id("result")).getText();
		if(prompt.contains("msg")) {
			System.out.println("again it has passed");     //why didn't we put else if
		}
		
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		driver.switchTo().alert().dismiss();
		String dd= driver.findElement(By.id("result")).getText();
		if(dd.contains("null")) {
			System.out.println("it has passed");
		}
		
	}

}
