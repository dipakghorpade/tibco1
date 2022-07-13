package KiteApp_POM_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {
	
// 1. data members
		@FindBy (id="userid")   private WebElement username;
		@FindBy (id="password")   private WebElement password;
		@FindBy (xpath="//button[@type='submit']")   private WebElement login;
		
// 2. constructor
		public KiteLoginPage1(WebDriver driver)
		{
		PageFactory.initElements(driver, this );
		}

// 3. methods
		public void sendUsername(String a)
		{
			username.sendKeys(a);
		}
		
		
		public void sendPassword(String b)
		{
			password.sendKeys(b);
		}
			
		public void clickOnLoginButton()
		{
			login.click();
		}
	}


