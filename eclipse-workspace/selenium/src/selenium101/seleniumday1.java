package selenium101;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
		 driver.close();

		
		
		
		
	}

}
