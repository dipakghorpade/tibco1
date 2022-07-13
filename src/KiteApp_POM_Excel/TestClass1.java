package KiteApp_POM_Excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
//Exel_Sheet
		File Myfile=new File("D:\\selenium\\BALANCE SHEET - Copy.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("sheet1");
		 String userName = mysheet.getRow(2).getCell(1).getStringCellValue();
		 String passWord = mysheet.getRow(3).getCell(1).getStringCellValue();
		 String PIN = mysheet.getRow(4).getCell(1).getStringCellValue();
		 
//Web_server		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");          
		driver.manage().window().maximize();              Thread.sleep(500);
		
//Kite login page	
		KiteLoginPage1 login=new KiteLoginPage1(driver);
		login.sendUsername(userName);
		login.sendPassword(passWord);
		login.clickOnLoginButton();                  	   Thread.sleep(500);
//Kite pin page
		KitePinPage2 login2=new KitePinPage2(driver);
		login2.sendPin(PIN);
		login2.clickOn();							   Thread.sleep(500);
//operation----verifying name and logout
		KiteHomePage3 home= new KiteHomePage3(driver);
		home.ClickUserId();
		home.checkingUserId(userName);
		home.Logout();
		
driver.close();
	}

}
