package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();  Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		

		 Set<String> Allpageid = driver.getWindowHandles();
	//	 System.out.println(Allpageid); // To find the no of child browser on main web browser 	
		 
		 Iterator<String> it=Allpageid.iterator();
		 
		// while(it.hasNext())         // To find the no of child browser on main web browser 	
		// {
		//	 System.out.println(it.next());
		// }
	 	  
		 String mainpageid=it.next();    //will return main page id 
		 String childPageId=it.next();	// will return child page id
// To switch focus to child window
		 driver.switchTo().window(childPageId);
		 driver.manage().window().maximize();  Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");           Thread.sleep(3000);
//To switch focus to main window
		 driver.switchTo().window(mainpageid);
	}

}
