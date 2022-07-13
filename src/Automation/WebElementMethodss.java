package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
		driver.manage().window().maximize();	
		
		WebElement s =driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));     // type1    	s.click();      
		s.click();                          Thread.sleep(500);
		
		WebElement s1 = driver.findElement(By.xpath("//input[@id='autocomplete']"));      // type2      s1.sendKeys("Hi i am Dipak"); 
		s1.sendKeys("Hi i am Dipak");       Thread.sleep(1000);
		
		WebElement s2=driver.findElement(By.xpath("//input[@id='autocomplete']"));        // type3      s2.clear();
		s2.clear();			                Thread.sleep(1000);	
		
		WebElement s3=  driver.findElement(By.xpath(" //h1[text()='Welcome To Practice Page']"));      // type4  getText()
		System.out.println(s3.getText()); 
		//or
		String s4 =  driver.findElement(By.xpath(" //h1[text()='Welcome To Practice Page']")).getText();      // type4  getText()
		System.out.println(s4);
		driver.close();
		
		
		
	}
	
}
