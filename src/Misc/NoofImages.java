package Misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/search?q=pune+university&sxsrf=ALiCzsZB9P26NGXRs5jsCUJo6ERvYPe6kw:1655002155976&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi_2--886b4AhXFW3wKHfmzD04Q_AUoA3oECAIQBQ&biw=1366&bih=625&dpr=1");
		driver.manage().window().maximize();  Thread.sleep(1000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
			
	//	for(WebElement img:images)           // using for each method to finding the list of images
	//	{
	//		System.out.println(img.getText());
	//	}

	}

}
