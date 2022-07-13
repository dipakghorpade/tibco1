package TestNG_Keywords;

import org.testng.annotations.Test;				     
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestKeyWords_2 {								// 2.priority
	
  @Test(priority=-3)
  public void Test1() {
	  System.out.println("TC is pass");
	  Reporter.log("TC is pass",true);
  }     
	 @Test
	  public void Test2() {
		  System.out.println("TC is failed");
		  Reporter.log("TC is failed",true);				//	it will give priority= test1  test3   test2
  }		  
		  @Test(priority=-1)
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
