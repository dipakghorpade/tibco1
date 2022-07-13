package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		//WebElement hide = driver.findElement(By.id("hide-textbox"));         // type 6 isDisplayed
		WebElement show = driver.findElement(By.id("show-textbox"));
        WebElement textbox=driver.findElement(By.name("show-hide"));
        
        
		//hide.click();
		show.click();
       // System.out.println("textbox is displayed"+show.getText());
        if(textbox.isDisplayed())
        {
        	System.out.println("textbox is displayed");
        }
        else
        {
       	System.out.println("textbox is not displayed");
        }
	}

}
