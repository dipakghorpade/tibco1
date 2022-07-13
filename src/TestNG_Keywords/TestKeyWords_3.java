package TestNG_Keywords;

import org.testng.annotations.Test;				
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestKeyWords_3 {					// 3.enabled= false
  @Test															// if it is use then test will not be run it will skip
	  public void test() {
		  System.out.println("TC is pass");
		  Reporter.log("TC is pass",true);
 }	            
  @Test(enabled= false)
  public void enabledUse() {
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
