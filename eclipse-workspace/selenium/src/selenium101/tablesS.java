package selenium101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		
		// Retrive the total number of tables in page
		 
		 List<WebElement> table= driver.findElements(By.xpath("//*[table]"));
		 System.out.println(table.size());
		
		//total number of rows 
		 
		 List<WebElement> rows= driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr"));
		System.out.println(rows.size());
		int rowsize= rows.size();
		
		//total of columns 
		List <WebElement> columns = driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr[2]/td"));
		System.out.println(columns.size());
		int columnsize= columns.size();
		
		//columns
		int sum=0; 
		for(int i = 2; i<= rowsize; i++) {
			String element= driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr[" + i + "]/td[3]")).getText();
			System.out.println(element);    //gives you the age
			sum= sum + Integer.parseInt(element);  //converts to interger // 45+94+20  // "45" ===> 45  //total of age
			
			
			
			
		}
		System.out.println(sum);
		
	    for(int i = 2; i <= rowsize; i++) {
	    	String anotherelement= driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr[\" + i + \"]/td[2]")).getText();
	    	System.out.println(anotherelement);     //gives you last name but why three times???
	    	if(anotherelement.equals("jackson")) {
	    		System.out.println("test pass");         //didn't give test pass??
	    		break;
	    	}
	    }
	driver.quit();
		
	}

}
