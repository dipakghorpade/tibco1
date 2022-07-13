package TestNG_Asserts_SoftAsserts;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;   
// six types of SOFT-ASSERTS---(if the one Soft assert fail in the TEST CLASS then other cases will NOT stop in the same TEST CLASS)
								// need to create object of SoftAssert class then 
								// need to square up will soft.assertAll();
// 1.soft.assertEquals
// 2.soft.assertNotEquals
// 3.soft.assertTrue
// 4.soft.assertFalse
// 5.soft.fail
// 6.soft.assertNotNull
// 7.soft.assertNull



public class SoftAsserts {
  @Test      
  public void Test1() {
	  
	  String a = "pune";
	  String b = "pune";
	 
	  SoftAssert soft= new SoftAssert();
	  
	  soft.assertEquals(a, b,"a and b values are not matching so Tc is failed ");
	  Reporter.log("a and b values are matching so Tc is passed",true);
	  
	  soft.assertNull(a,"TC is failed if value of a is not Null");
	  
	  soft.assertNotNull(b,"TC is failed if value of a is not Null");
	  soft.assertAll();
  }
  
}
