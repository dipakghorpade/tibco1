package Dynamci_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicite_Wait_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize(); 
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='	Dominant England complete whitewash']"));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(20000));
		
		wait.until(ExpectedConditions.visibilityOf(aboutus));
		aboutus.click();
		
	}

}
