package selenium101;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonCheckBoxDay6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		 //radio
		 
		 WebElement blue= driver.findElement(By.cssSelector("input[value='blue']"));
		 WebElement yellow= driver.findElement(By.cssSelector("input[value='yellow']"));
		 blue.click();
		 if(blue.isSelected()) {
			 System.out.println("testcase pass");
			 if(!(yellow.isSelected())) {               //! if this operator is used then it means that if it is false it turns to true 
				 System.out.println("testcase pass 1");
			 }
			 else {
				 System.out.println("testcase fail");
			 }
		 }
		 
		 //radio buttons
		 
		WebElement radiobutt= driver.findElement(By.id("radio-buttons"));
		 List <WebElement> box1= driver.findElements(By.cssSelector("input[type='radio']"));
		 for(int i=0; i< box1.size();i++) {
		 System.out.println(box1.get(i).getAttribute("value")); //this gives you the input name value
			 
 	 box1.get(i).click();
		 }   //why is this giving the attribute name as vegetables?
		 
		 //checkbox for is selected 
		 
		 WebElement allchekbox= driver.findElement(By.cssSelector("input[type='checkbox']"));
		 List <WebElement> option= driver.findElements(By.cssSelector("input[type='checkbox']"));
		 for(int i=0; i<option.size();i++) {
			 if(option.get(i).isSelected()) {
				 System.out.println("already selected");
			 }
			 else {
				 option.get(i).click();
			 }
		 }
		for(int i=0; i<option.size();i++) {
		 System.out.println(option.get(i).isSelected());
		 
		}
		 
		WebElement allbutton= driver.findElement(By.id("radio-buttons-selected-disabled"));
			List <WebElement> disabled= driver.findElements(By.cssSelector("input[type='radio']"));
			for(int i=0; i< disabled.size();i++) {
				if(disabled.get(i).isDisplayed())	{
					System.out.println("it is disabled");
				}
				else {
					disabled.get(i).click();
				}
					
				
				}
			//when one radio button is selected how to validate the others arent? 
			
			WebElement disSel= driver.findElement(By.id("radio-buttons-selected-disabled"));
			List <WebElement> boxes= driver.findElements(By.cssSelector("input[value='lettuce']"));
			ArrayList<Integer> boxes1= new ArrayList<Integer>();
			
			
			
			
			
			boolean dd= driver.findElement(By.cssSelector("input[value='lettuce']")).isEnabled();
			if(dd) {
				System.out.println("testcase has passed and is enabled");
			}
			else {
				System.out.println("fail");
			}
			
			boolean cc= driver.findElement(By.cssSelector("input[value='cabbage']")).isEnabled();
			if(!cc) {
				System.out.println("testcase pass it is disabled so can't click");
			}
			else {
				System.out.println("fail");
			}
			
			boolean ee= driver.findElement(By.cssSelector("input[value='pumpkin']")).isSelected();
			if(ee) {
				System.out.println("pass bc it is selected");
			}
			else {
				System.out.println("fail");
			}
			
			
			 Thread.sleep(2000);
			 driver.quit();
		 }
		 
	}
	


