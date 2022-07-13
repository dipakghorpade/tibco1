package KiteLogin;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserId_usingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		File Myfile=new File("D:\\selenium\\BALANCE SHEET - Copy.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("sheet1");
		 String userName = mysheet.getRow(2).getCell(1).getStringCellValue();
		 String passWord = mysheet.getRow(3).getCell(1).getStringCellValue();
		 String PIN = mysheet.getRow(4).getCell(1).getStringCellValue();
		 
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");         
			driver.manage().window().maximize();        Thread.sleep(500);
			
			WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
			WebElement PWD = driver.findElement(By.xpath("//input[@type='password']"));
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
			userid.sendKeys(userName);
			PWD.sendKeys(passWord);
			login.click();        Thread.sleep(500);
			
			WebElement pin = driver.findElement(By.xpath("//input[@type='password']"));
			pin.sendKeys(PIN);
			WebElement continuein= driver.findElement(By.xpath("//button[@type='submit']"));
			continuein.click();		 Thread.sleep(500);
			
// for checking result actual name =expected name ...then log out
			
			WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
			username.click();
//          System.out.println(username.getText());
			
			String actualusername = username.getText();
			String expectedusername=userName;
			
			if(actualusername.equals(expectedusername))
			{
				System.out.println("User ID matching so TC is Passed ");
			}
			else
			{
				System.out.println("User ID is not matching so TC is Failed ");
			}
		

	}

}
