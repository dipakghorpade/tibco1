package TestNG_CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
  @Parameters("browser")
  @Test
  public void Test(String name) throws InterruptedException {
	  WebDriver driver=null;
	  
	  if(name.equals("firefox"))
	  {
		    System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
	  }
	  else if(name.equals("chrome"))
	  {
		    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			driver=new ChromeDriver();
	  }
	
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  Thread.sleep(5000);
	  driver.close();
	  
  }
  
}
