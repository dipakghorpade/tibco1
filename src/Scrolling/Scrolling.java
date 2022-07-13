package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		WebElement ref = driver.findElement(By.xpath("//a[text()='	Dominant England complete whitewash']"));
		
	// scrolling view 	
		//JavascriptExecutor is= ((JavascriptExecutor)driver);		Thread.sleep(2000);
	//	is.executeScript("arguments[0].scrollingtoView(true);",ref);
		
	// setting the position
		JavascriptExecutor e= ((JavascriptExecutor)driver);		Thread.sleep(2000);
		e.executeScript("window.scrollBy(90,-1600);",ref);
	}

}
