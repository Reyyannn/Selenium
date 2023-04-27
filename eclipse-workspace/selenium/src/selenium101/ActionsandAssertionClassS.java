package selenium101;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsandAssertionClassS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		
		//double click  //action
		 Actions d= new Actions(driver);
		 
//		 WebElement d1= driver.findElement(By.cssSelector("#double-click"));
//		 d.doubleClick(d1).build().perform();
		 //assertion
//		 if(d1.getAttribute("class").equals("div-double-click double")) {
//			 System.out.println("test case pass");
//		 }
		 
		 //drag and drag option
		 
//		 WebElement drop= driver.findElement(By.cssSelector("#droppable"));
//		 WebElement drag= driver.findElement(By.cssSelector("#draggable"));
//		 System.out.println(drop.getText());
		 
		 //assertion
//		 d.dragAndDrop(drop, drag).build().perform();
//		 System.out.println(drag.getText());
		
		//click and hold 
		 
//		 WebElement clichold= driver.findElement(By.cssSelector("#click-box"));
//		 d.clickAndHold(clichold).build().perform();
//		 System.out.println(clichold.getText());
		 //assertion
//		 if(clichold.getText().equals("Well done! keep holding that click now.....")) {
//			 System.out.println("test pass");     
//		 }
		 
		 //for click and hold second "do not realse me"
//		 clichold.click();
//		 if(clichold.getText().equals("Dont release me!!!")) {
//			 System.out.println("pass");
//		 }
		 
		 //hover over elemnt 
		 
//		 WebElement hh= driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > button"));
//		 d.moveToElement(hh).build().perform();
//		 Thread.sleep(5000);
		 
//		 driver.quit();
		 
		 WebElement mh= driver.findElement(By.cssSelector("#main-header"));
		 d.contextClick(mh).build().perform();
		 
		 
	}

}
