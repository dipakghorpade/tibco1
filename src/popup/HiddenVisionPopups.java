package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenVisionPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();  Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("I phone 13 pro max");
		
		WebElement popup1=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		popup1.click();

	}

}
