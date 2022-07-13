package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrangAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();  Thread.sleep(1000);
		
		// send keys by using Action class
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		Actions act=new Actions(driver);
		act.sendKeys(textbox,"good morning").perform();
		
		// using action class handle drop down
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		

	}

}
