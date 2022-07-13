package KiteApp_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");          
		driver.manage().window().maximize();              Thread.sleep(500);
		
//Kite login page	
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUsername();
		login.sendPassword();
		login.clickOnLoginButton();                  	   Thread.sleep(500);
//Kite pin page
		KitePinPage login2=new KitePinPage(driver);
		login2.sendPin();
		login2.clickOnLogin();							   Thread.sleep(500);
//operation----verifying name and logout
//		KiteHomePage home= new KiteHomePage(driver);
//		home.ClickUserId();
//		home.checkingUserId();
//		home.Logout();
//		
//driver.close();
//	}
	}
}
