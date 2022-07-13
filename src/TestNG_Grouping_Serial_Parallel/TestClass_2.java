package TestNG_Grouping_Serial_Parallel;

import org.testng.annotations.Test;				     
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestClass_2 {			
	
  @Test(groups="regression")
  public void Test1() {
	  System.out.println("TC is pass");
	  Reporter.log("TC is pass",true);
  }     
	 @Test(groups="sanity")
	 
	  public void Test2() {
		  System.out.println("TC is failed");
		  Reporter.log("TC is failed",true);				
  }		  
		  @Test(groups="regression")
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
