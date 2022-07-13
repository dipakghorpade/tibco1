package KiteApp_POM_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage2 {

	
	
//1. data members
		@FindBy (xpath= "//input[@type='password']") private WebElement PIN;
		@FindBy (xpath= "//button[@type='submit']") private WebElement continueButton;
		
//2. construction		
		public KitePinPage2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

//3. methods
		public void sendPin(String c)
		{
			PIN.sendKeys(c);
		}
		public void clickOn()
		{
			continueButton.click();
		}
		

	}

