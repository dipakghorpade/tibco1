package KiteApp_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

//1 data members
		@FindBy (xpath="//span[@class='user-id']") private WebElement Id;
		@FindBy (xpath="//a[@target='_self']")private WebElement Logout;
		
//2 construction
		public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
//3 methods
		public void ClickUserId()
		{
			Id.click();
		}
		
		public void checkingUserId()
		{
			String actualUserId = Id.getText();
			String expectedUserId = "TR0863";
			
			if (actualUserId.equals(expectedUserId))
			{
				System.out.println("User ID is matching so TC is Passed ");
			}
			else
			{
				System.out.println("User ID is not matching so TC is Failed ");
			}
		}
		public void Logout()
		{
			Logout.click();
		}
			
		}
		
