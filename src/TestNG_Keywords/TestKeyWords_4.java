package TestNG_Keywords;

import org.testng.annotations.Test;				     
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestKeyWords_4 {			// 4.timeout
								//if method is taking more time to execute than given timeout time then this method will fail 
  @Test(timeOut=1000)
  public void Test1() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  System.out.println("TC is pass");
	  Reporter.log("TC is pass",true);
  }     
	 @Test
	  public void Test2() {
		  System.out.println("TC is failed");
		  Reporter.log("TC is failed",true);				
  }		  
		  @Test
		  public void Test3() {
			  System.out.println("TC is failed");
			  Reporter.log("TC is failed",true);
	  
	  
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
