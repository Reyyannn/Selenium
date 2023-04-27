package selenium101;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sday5getlocationmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		// driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		  
		// getText()
			// getTagName()
			// getCssValue()
			// getArritbute()
			// getSize()
			// getLocation()
		
		//program 1 getText
		 //<h1>hello<h1> these are opening and closing between that we get a text 
		 
		// WebElement gettext= driver.findElement(By.cssSelector("h2"));
		// String textt= gettext.getText();
		// if(textt.contains("CONTACT US")) {
		//	 System.out.println("testcase has passed");
		// }
		// else {
		//	 System.out.println("testcase failed");
		// }
		// driver.quit();
		 
		 //program 2 tagName 
		// WebElement tagname = driver.findElement(By.name("message"));
		// String tagName= tagname.getTagName();
		// System.out.println(tagname.getTagName());
		 
		// driver.quit();    //this will give you the tagname 
		
		 //program 3 get getsize
		// driver.get("https://us.shein.com/");  //when doing getsize for cssselector you need to put the id attribute 
		//WebElement size= driver.findElement(By.cssSelector("#header_logo_icon"));
		 //Dimension dd= size.getSize();
		 //System.out.println(dd);
		 //or
		 //System.out.println(dd.height);
		 //System.out.println(dd.width);
		 
		 //program 4 get location
		// WebElement location= driver.findElement(By.cssSelector("#header_logo_icon"));
		// Point p= location.getLocation();
		// System.out.println(p);
		// System.out.println(p.x);
		// System.out.println(p.y);  //these are coordinates
		
		 //program 5 getAttribute //on string
		// driver.get("https://www.amazon.com/");
		 //WebElement attribute= driver.findElement(By.cssSelector("#nav-logo-sprites"));
		//String getAttri= attribute.getAttribute("href");
		//System.out.println(getAttri);
		
		//driver.quit();  //this gives you the attribute but has to give what class it is
		
		//prgram 6 getCssValue //visualstudio through example
		
//	driver.get("http://127.0.0.1:5501/DOM2/index.html");
//		WebElement e = driver.findElement(By.cssSelector("h1"));
//		String color = e.getCssValue("color");
//		System.out.println(color);
//		driver.quit();
		
		 
		 
		 //MORE PRAC
		//program getAttribute
		//driver.get("https://us.shein.com/");
		//WebElement aa= driver.findElement(By.cssSelector("#header_logo_icon"));
		//String attribute1= aa.getAttribute("id");
		//System.out.println(attribute1);
		
		//driver.quit();  
		
		//getsize 
		// driver.get("https://www2.hm.com/en_us/index.html");
		//WebElement ss= driver.findElement(By.cssSelector("#main-content"));
		//Dimension ddd= ss.getSize();
		//System.out.println(ddd);
		//System.out.println(ddd.height);
		//System.out.println(ddd.width);
		//driver.quit();
		
		//getlocation
		//WebElement ll= driver.findElement(By.cssSelector("#main-content"));
		//Point p= ll.getLocation();
		//System.out.println(p.x);
		//System.out.println(p.y);
		
		//getText
		//WebElement FE= driver.findElement(By.cssSelector("h3"));
		//String text= FE.getText();
		//if(text.contains("Free shipping on all orders!")) {
		//	System.out.println("test case has passed");
		//}
		//else {
		//	System.out.println("fail");
		//}
		
		//tagName
		 driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		WebElement tagname= driver.findElement(By.name("contactme"));
		String name= tagname.getTagName();
		System.out.println(tagname.getTagName()); //should give you h2
	
		
	}

}

//On user action 

		// we create element 
		// we can retrive element 
		// we can update element 
		// we can delete element 
		
		
		// on user action 

		// we can  retrive attribut
		// we can add attribute
		// we can update attribute value
		// we can delete value
