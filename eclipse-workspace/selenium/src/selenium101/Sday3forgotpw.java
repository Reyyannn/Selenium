package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sday3forgotpw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//forgot pw
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
			String currentUrl= driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			if(currentUrl.contains("requestPasswordResetCode")) {
				System.out.println("testcase passed");
			}
			else {
				System.out.println("test case failed");
			}
			
			driver.quit();
		
		
	}

}
