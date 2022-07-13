package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod_isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");         
		driver.manage().window().maximize();        Thread.sleep(5000);
		//driver.manage().window().minimize();
		
		WebElement checkbox1 =driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//checkbox1.click();                            Thread.sleep(5000);
		
		if(checkbox1.isSelected())                     //type 5    isSelected()
		{
			System.out.println("Checkbox is already selcted");
		}
		else
	{
			checkbox1.click();
			System.out.println("checkbox is now slected");
	}
	}

}
