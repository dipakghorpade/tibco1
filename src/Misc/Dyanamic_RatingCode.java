package Misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_RatingCode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/mobiles/~cs-9ilgnhxaqb/pr?sid=tyy%2C4io&collection-tab-name=iPhone+12+&param=92839&otracker=hp_bannerads_3_2.bannerAdCard.BANNERADS_A_UBO3UGG9GXKV");
		driver.manage().window().maximize();  Thread.sleep(1000);
		
		
		WebElement DynElement = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		System.out.println(DynElement.getText());
	
	}
	

}
