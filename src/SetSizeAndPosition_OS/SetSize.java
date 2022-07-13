package SetSizeAndPosition_OS;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");			Thread.sleep(1000);
		
// To get size of browser which displayed on screen	
        System.out.println(driver.manage().window().getSize());	
        
 // To use to change desire dimension      
		Dimension D=new Dimension(500,500);
		driver.manage().window().setSize(D);
	}

}
