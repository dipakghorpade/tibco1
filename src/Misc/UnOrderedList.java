package Misc;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();  Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("suzuki");		Thread.sleep(200);  
		
	    List<WebElement> ul = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])//li"));
	    System.out.println(ul.size());
//for loop use to find  unordered list    
	    for(WebElement list:ul)
	    {
	    	System.out.print(list.getText());
	    }
	    
// to get desired selection from unordered list    
	    for(WebElement result:ul)
	    {
	    String actualresult = result.getText();
	    String expectedResult= "suzuki bikes";
	    
	    if(actualresult.equals(expectedResult))
	    {
	    	result.click();
	    	break;
	    }
	    }
	    
	    
	}

}
