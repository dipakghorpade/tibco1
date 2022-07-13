package KiteApp_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

	
	
//1. data members
		@FindBy (xpath= "//input[@type='password']") private WebElement PIN;
		@FindBy (xpath= "//button[@type='submit']") private WebElement continueButton;
		
//2. construction		
		public KitePinPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

//3. methods
		public void sendPin()
		{
			PIN.sendKeys("545454");
		}
		public void clickOnLogin()
		{
			continueButton.click();
		}
		

	}

