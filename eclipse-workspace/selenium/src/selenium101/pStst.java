package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pStst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://parabank.parasoft.com/parabank/index.htm");
		 driver.manage().window().maximize();
		 
		// Ngeative testcase byname and classname method 
		 WebElement user= driver.findElement(By.name("username"));
		 WebElement pw= driver.findElement(By.name("password"));
		 WebElement login= driver.findElement(By.className("button"));
		 //sendkey method
		 Thread.sleep(2000);
		 user.sendKeys("aastha");
		 pw.sendKeys("acharya");
		 login.click();
		 
		 driver.close(); 
		 
		 boolean errormsg= driver.findElement(By.id("title")).isDisplayed();
		 if(errormsg) {
			 System.out.println("testcase pass");
			 
		 }
		 else {
			 System.out.println("testcase fail");
		 }
		 
		// validation title
		    String Title = driver.getTitle();
		    if (Title.equals("ParaBank")) {
		      System.out.println("Test passed");
		    } else {
		      System.out.println("test has failed");

		    }
		 
		 //positive testcase, id and css method
		 driver.get("https://parabank.parasoft.com/parabank/lookup.htm");
		
		 
		 driver.findElement(By.id("firstName")).sendKeys("aastha");
		 driver.findElement(By.id("lastName")).sendKeys("acharya");
		 driver.findElement(By.id("address.street")).sendKeys("9900 spectrum dr");
		 driver.findElement(By.id("address.city")).sendKeys("austin");
		 driver.findElement(By.id("address.state")).sendKeys("TX");
		 driver.findElement(By.id("address.zipCode")).sendKeys("78653");
		 driver.findElement(By.id("ssn")).sendKeys("9173748393");
		 driver.findElement(By.cssSelector("input[value='Find My Login Info']"));
		 
		 Thread.sleep(2000);
		 
		 boolean element= driver.findElement(By.id("ssn.errors")).isDisplayed();
		 if(element) {
			 System.out.println("true case");
		 }
		 else {
			 System.out.println("false case");
		 }
		 
		 driver.close();
		 //getting url
		
		 
		 driver.findElement(By.cssSelector("href=\"services.htm\"")).click();
		 String url= driver.getCurrentUrl();
		 System.out.println(url);
		 
		 if(url.contains("Email support is available by filling out the following form.")) {
			 System.out.println("testcase has passed");
		 }
		 else {
			 System.out.println("failed");
		 }
		 
		driver.quit();
		
		//getting xpath
		boolean xpath= driver.findElement(By.cssSelector("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).isDisplayed();
		
		if(xpath) {
			System.out.println("passed");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
		
		//tagname method
		boolean tagName= driver.findElement(By.tagName("login")).isDisplayed();
		if(tagName) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		driver.close();
		
		//partial link
		boolean partial= driver.findElement(By.partialLinkText("about.htm")).isDisplayed();
		if(partial) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		//linkText
		boolean linktext= driver.findElement(By.linkText("Services")).isDisplayed();
		if(linktext) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		
	}

}
