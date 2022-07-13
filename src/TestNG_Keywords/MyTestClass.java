package TestNG_Keywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class MyTestClass {
  @Test
  public void Test1() {
	  System.out.println("TC is pass");	  // it will displayed on console window 
	  Reporter.log("TC is pass",true);   // it will displayed in xml file and console window
	  Reporter.log("TC is pass");       // it will displayed in xml file
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
