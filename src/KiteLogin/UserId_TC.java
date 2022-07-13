package KiteLogin;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserId_TC {

	public static void main(String[] args) throws InterruptedException {
		
		
// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");         
		driver.manage().window().maximize();        Thread.sleep(500);
		
		WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement PWD = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	
		userid.sendKeys("TR0863");
		PWD.sendKeys("Deepak018@@");
		login.click();        Thread.sleep(500);
		
		WebElement pin = driver.findElement(By.xpath("//input[@type='password']"));
		pin.sendKeys("545454");
		WebElement continuein= driver.findElement(By.xpath("//button[@type='submit']"));
		continuein.click();		 Thread.sleep(500);
		
// for checking actual name =expected name ...then log out
		
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		username.click();
//	System.out.println(username.getText());
		
		String actualusername = username.getText();
		String expectedusername= "TR0863";
		
		if(actualusername.equals(expectedusername))
		{
			System.out.println("TC is Passed ");
		}
		else
		{
			System.out.println("TC is Failed ");
		}
		
	}

}
