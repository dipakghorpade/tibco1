package TestNG_Keywords;

import org.testng.annotations.Test;				
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestKeyWords_1 {					// 1.invocationCount
	
  @Test(invocationCount=4)
  public void invocationCountUse() {
	  System.out.println("TC is pass");
	  Reporter.log("TC is pass",true);
            
	  
	  
	  
  }
  @BeforeClass
  public void LaunchBrowser() {
	  
  }
  
  @BeforeMethod
  public void LoginToKite() {
  }

  @AfterMethod
  public void Logout() {
  }

  @AfterClass
  public void closeBrowser() {
  }
  
  
 

  

}
