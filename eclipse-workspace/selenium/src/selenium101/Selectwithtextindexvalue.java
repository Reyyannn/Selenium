package selenium101;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectwithtextindexvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
		
	//	WebElement oravalue= driver.findElement(By.cssSelector("input[value='orange']"));
	//	WebElement purvalue1= driver.findElement(By.cssSelector("input[value='purple']"));
	//	oravalue.click();
	//	if(oravalue.isSelected()) {
	//		System.out.println("testcase 1 has passed");
	//		if(!purvalue1.isSelected()) {
	//			System.out.println("testcase has failed");
	//		}
	//		else {
	//			System.out.println("failed");
	//		}
	//	}
		
		//to iterate through every radio button thats on the group //all of them 
		
	//	List<WebElement> Buttonss = driver.findElements(By.cssSelector("input[name='color']"));
	//	for(int i=0; i<Buttonss.size();i++) {
	//		Buttonss.get(i).click();
	//		Thread.sleep(3000);
			//if next radio button is not already selected then 
	//		if(i < Buttonss.size()-1 && !Buttonss.get(i+1).isSelected()) {
	//			System.out.println("the next button is not selected ");
	//		}
	//	} // what does -1 mean 
		
		//two of them would skip 
		
	//	List<WebElement> rbs= driver.findElements(By.cssSelector("input[name='color'"));
		
	//	Iterator<WebElement> iterator = rbs.iterator();
		
	//	while(iterator.hasNext()){
			//click on radio button 
	//		WebElement rbs1= iterator.next();
	//		rbs1.click();
	//		Thread.sleep(2000);
			
			// check if the next radio button is not already selected
	//		if(iterator.hasNext()&& !iterator.next().isSelected()) {
	//			System.out.println("next button is not selected");
	//		}
			
	//	} //what does this do again 
		
		//individual radio buttons 
		// gives you all the values for the radio buttons
	//	WebElement butBox = driver.findElement(By.id("radio-buttons"));
	//	List <WebElement> button= butBox.findElements(By.cssSelector("input[type='radio']"));
	//	for(int i=0; i<button.size();i++) {
			//System.out.println(button.get(i).getAttribute("value"));
	//		button.get(i).click();
	//	}
		
		//CHECKBOX 
		
	//	List <WebElement> cheBox= driver.findElements(By.cssSelector("input[type='checkbox']"));
	//	for(int i=0; i<cheBox.size();i++) {
	//		if(cheBox.get(i).isSelected()) {
	//			System.out.println("already selected ");
	//		}
	//		else {
	//			cheBox.get(i).click();
	//		}
	//	}
		
		//program3
		
	//	if(driver.findElement(By.cssSelector("input[value='lettuce']")).isEnabled()) {
	//		System.out.println("1test case pass ");
	//	}
		
	//	if(driver.findElement(By.cssSelector("input[value='cabbage']")).isEnabled()) {
	//		System.out.println("2test case pass");  //is not enabled 
	//	}
		
	//	if(driver.findElement(By.cssSelector("input[value='pumpkin']")).isSelected()) {
		//	System.out.println("3 test case has passed");
		//}
		
		//FOR drop down 
		
		//select the element based on test 
//		WebElement option1= driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select OptOne= new Select(option1);
//		OptOne.selectByVisibleText("Python");
//		Thread.sleep(2000);
//		driver.quit();
		
		
//		  Select class only applies to drop down with select as tagNAme
//	      We need to pass select element to constructor
//	      byValue , byIndex , byText		
			
		//selecting elements based on index
		
//	WebElement option11= driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropdown= new Select(option11);
//		dropdown.selectByIndex(2);
//		Thread.sleep(2000);
//		driver.quit();
		
		//selecting element based on value 
//		WebElement option111= driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select Dropdown= new Select(option111);
//		Dropdown.selectByValue("sql");
//		Thread.sleep(2000);
//		driver.quit();
		
		WebElement getoption= driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select dropdownn= new Select(getoption);
		dropdownn.selectByValue("sql");
		Thread.sleep(3000);
		System.out.println(dropdownn.getOptions());
		List <WebElement> cc= dropdownn.getOptions();
		for(int i=0; i<cc.size();i++) {
			System.out.println(cc.get(i).getText());
		}
		
		driver.quit();    //gives you all the select class text/value 
	}

}
