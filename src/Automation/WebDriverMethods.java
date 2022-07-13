package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
	//By.id['    ']
	//By.name['    '] 
	//By.xpath  1. [@attributes='  '] 2. [text()='     ']    3.a. contains[text(),'    ']                     text means          ><   
	//													     3.b. contains[@attributes,'     ']               attributes means    <>
	
	//driver.close();    open tab remove
	//driver.quit();     all tab remove
	//driver.manage().window().maximize();
	//driver.manage().window().minimize();
   // Thread.sleep(2000);
	//driver.navigate().to("https://www.google.co.in");    open new tab from same tab
	//driver.navigate().refresh();
	//driver.navigate().back();
	//driver.navigate().forward();
	
	//System.out.println(driver.getTitle());    //or
	//String title = driver.getTitle();
	//System.out.println(title);
	
	//System.out.println(driver.getCurrentUrl());
    
	}

}
