package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod_isEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login");         
		driver.manage().window().maximize();	
		
	   WebElement s= driver.findElement(By.xpath("//input[@id='mobileNumber']"));	
	   s.sendKeys("8660105216");
	   WebElement s2=driver.findElement(By.xpath("//button[text()='Get OTP']"));  //  type 4   isEnabled()
	   System.out.println(s2.isEnabled());      // result in console is "true" if the get opt button is working if not the result will be "false"
	   
	}

}
