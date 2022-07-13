package KiteApp_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
// 1. data members
		@FindBy (id="userid")   private WebElement username;
		@FindBy (id="password")   private WebElement password;
		@FindBy (xpath="//button[@type='submit']")   private WebElement login;
		
// 2. constructor
		public KiteLoginPage(WebDriver driver)
		{
		PageFactory.initElements(driver, this );
		}

// 3. methods
		public void sendUsername()
		{
			username.sendKeys("TR0863");
		}
		
		public void sendPassword()
		{
			password.sendKeys("Deepak018@@");
		}
			
		public void clickOnLoginButton()
		{
			login.click();
		}
	}


