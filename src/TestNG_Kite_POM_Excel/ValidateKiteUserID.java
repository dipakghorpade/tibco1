package TestNG_Kite_POM_Excel;

import org.testng.annotations.Test;

import KiteApp_POM_Excel.KiteHomePage3;
import KiteApp_POM_Excel.KiteLoginPage1;
import KiteApp_POM_Excel.KitePinPage2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateKiteUserID {
	WebDriver driver;
	Sheet mysheet;
//	KitePinPage2 pin;
//	 KiteLoginPage1 login;
//	 KiteHomePage3 home;
	
  @Test
  public void myTest() {
	  KiteHomePage3 home= new KiteHomePage3(driver);
	  String ActualUserId = home.ActualUserId();
	  String ExpectedUserId = mysheet.getRow(2).getCell(1).getStringCellValue();
	  Assert.assertEquals(ActualUserId, ExpectedUserId,"Actual and Expected are not matching then TC is failed");
	  Reporter.log("Actual and Expected are matching then TC is Passed");
		
  }
  
  @BeforeClass
  public void LaunchBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	    
	    //ChromeOptions opt=new ChromeOptions();
	   // opt.addArguments("headless");                   // to run browser at background
	  //  opt.addArguments("disable-notifications");     //for remove notifications from browsers
	    
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");          
		driver.manage().window().maximize();               
        Reporter.log("Launch Browser",true);	
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, EncryptedDocumentException, IOException {
	     File myfile=new File("D:\\selenium\\BALANCE SHEET - Copy.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	     String userName = mysheet.getRow(2).getCell(1).getStringCellValue();
		 String passWord = mysheet.getRow(3).getCell(1).getStringCellValue();
		 String PIN = mysheet.getRow(4).getCell(1).getStringCellValue();
		 
	  KiteLoginPage1 login=new KiteLoginPage1(driver);
	  login.sendUsername(userName);
	  Reporter.log("Enter user name",true);
	  login.sendPassword(passWord);
	  Reporter.log("Enter the password",true);
	  login.clickOnLoginButton();			
	  Reporter.log("Login User ",true);	  		Thread.sleep(1000);
	  
	  KitePinPage2 pin=new KitePinPage2(driver);
	  pin.sendPin(PIN);
	  Reporter.log("Enter the pin",true);
	  pin.clickOn();					
	  Reporter.log("click on continue butten",true);	Thread.sleep(100);
	  
  }

  @AfterMethod
  public void afterMethod() {
	    KiteHomePage3 home=new KiteHomePage3(driver);
	    home.ClickUserId();
		home.Logout();
		Reporter.log("user logout",true);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(100);
	  driver.close();
  }

}
