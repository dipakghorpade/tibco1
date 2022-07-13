package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();  Thread.sleep(1000);
		
		WebElement SeleniumButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		//single click using ACTION CLASS
		act.moveToElement(SeleniumButton).click().build().perform();
		
		// right click button
		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.moveToElement(rightclick).contextClick().build().perform();
		
		//double click button
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']']"));
		act.moveToElement(doubleclick).doubleClick().build().perform();
		
		
	}

}
