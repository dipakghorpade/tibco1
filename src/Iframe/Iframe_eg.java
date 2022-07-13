package Iframe;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_eg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();  Thread.sleep(2000);
		
		//driver.switchTo().frame("iframeResult");// if the no. of sub-webpages in the same main webpage, then need to switch on perticuler page
		//or
		driver.switchTo().frame(1);       // 0,1,2,3,4,5......series of frames(currently we click on frame 2 )
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}

}
