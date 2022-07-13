package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_eg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/html/html_iframes.htm");
		driver.manage().window().maximize();  Thread.sleep(2000);
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//a[text()='Agree'][2]")).click();
	}

}
