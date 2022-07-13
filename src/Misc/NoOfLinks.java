package Misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();  Thread.sleep(1000);
// No of links		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
// list of links		
		Iterator<WebElement> it = links.iterator();          // using iterator method
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}

	}

}
