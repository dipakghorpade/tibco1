package Dynamci_wait;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicite_Wait_1 {

	public static void main(String[] args) {
// There are two types of wait
		// 1. Static wait--------------- wait time is fixed (Thread.sleep(1000)).Script will be hold for mentioned seconds.
		// 2.Dynamic wait---------------  a.Implicit wait= wait up to the given wait to found the element  if not found TIMEOUTEXCEPTION throws the error
		//                                b.Explicite wait= 2000ms->100ms required time remaining -> 1900ms release time .it is most useful for AJAX based application which objects are already disable on webpage. 
		//                                c.Fluent wait =
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();  
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
// or		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		

	}

}
