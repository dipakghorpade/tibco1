package TestNG_Asserts_SoftAsserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;   
// six types of ASSERTS---(if the one assert fail in the TEST CLASS then other cases will stop in the same TEST CLASS)

// 1.Assert.assertEquals
// 2.Assert.assertNotEquals
// 3.Assert.assertTrue
// 4.Assert.assertFalse
// 5.Assert.fail
// 6.Assert.assertNotNull
// 7.Assert.assertNull



public class Asserts {
  @Test      
  public void Test1() {
	  
	  String a = "pune";
	  String b = "pune";
	  
	  Assert.assertEquals(a, b,"a and b values are not matching so Tc is failed ");
	  Reporter.log("a and b values are matching so Tc is passed",true);
  }
  
  @Test
  public void Test2() {
	  
	  String a = "pune1";
	  String b = "pune";
	  
	  Assert.assertNotEquals(a, b,"a and b values are matching so Tc is failed ");
	  Reporter.log("a and b values are not matching so Tc is passed",true);
  }
  
  @Test
  public void Test3() {
	  
	 boolean a = true;
	 boolean b= false;
	 
	  Assert.assertTrue(a,"Tc is failed if value is false");
	  Reporter.log("Tc is passed if value is true",true);
	  
	  Assert.assertFalse(b,"Tc is failed if value is true");
	  Reporter.log("Tc is passed if value is false",true);
  }
  
  @Test
  public void Test5() {
	  
	 Assert.fail(); 
  }
  
  @Test
 public void Test7() {
	  
	  String a = null;
	  String b = "pune";
	 
	  Assert.assertNotNull(b,"b is null then TC is failed");
	  Assert.assertNull(a,"a is not null then TC is failed");
	  
  }
}
