package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_eg {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			
	        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			driver.manage().window().maximize();		Thread.sleep(500);
			
		//	driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Dipak");			Thread.sleep(500);
		//	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ghorpade");					Thread.sleep(500);
			
			WebElement date= driver.findElement(By.id("day"));
		    Select s=new Select(date);
		    s.selectByValue("08");       Thread.sleep(1000);
		    //s.deselectByValue("08");      			// used for deselect perticular selected case in the textbox
		    
		    WebElement month= driver.findElement(By.id("month"));
		    Select s2=new Select(month);
		    s2.selectByVisibleText("May");  Thread.sleep(1000);
		   // s2.selectByVisibleText("May");           // used for deselect perticular selected case in the textbox
		    
		    WebElement year= driver.findElement(By.id("year"));
		    Select s3=new Select(year);
		    s3.selectByValue("1994");   Thread.sleep(1000);

		    System.out.println(s.isMultiple());       // checking textbox is multiselected or not the result will show ture or false
		    
		   // s.deselectAll();                        // used for deselect all the selected cases in the textbox
		    
	}

}
