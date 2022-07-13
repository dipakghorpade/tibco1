package SetSizeAndPosition_OS;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");			Thread.sleep(1000);
		
// To get the position of browser
		System.out.println(driver.manage().window().getPosition());

// To set the position of browser at (x,y) directions
		Point P=new Point(500,0);
		driver.manage().window().setPosition(P);

	}

}
