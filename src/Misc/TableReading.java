package Misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReading {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38652/ind-vs-rsa-2nd-t20i-south-africa-tour-of-india-2022");
			driver.manage().window().maximize();  Thread.sleep(1000);
			
			List<WebElement> columns = driver.findElements(By.xpath("//div[contains(@class,'cb-col cb-col-100 cb-scrd')]"));
			System.out.println(columns.size());
			
			for(WebElement list:columns)
			{
				System.out.print(list.getText());
				System.out.println("============");
			}
			System.out.println();
	}

}
