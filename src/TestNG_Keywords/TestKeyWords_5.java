package TestNG_Keywords;

import org.testng.annotations.Test;				     
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestKeyWords_5 {			// 4.dependsOnMethods
										//method depend on other method like inheritance 
  @Test
      public void Test4() {
	  System.out.println("TC is pass");
	  Reporter.log("TC is pass",true);
  }     
	 @Test
	      public void Test5(){
		  System.out.println("TC is failed");
		  Reporter.log("TC is failed",true);				
  }		  
		  @Test
		      public void Test6() {
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
