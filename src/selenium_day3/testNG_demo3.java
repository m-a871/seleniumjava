package selenium_day3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNG_demo3 {
  @Test
  public void testMethod1() {
	 SoftAssert sa=new SoftAssert();
	 System.out.println("checking 1st validation");
	 sa.assertEquals(10,11);
	 
	 System.out.println("checking 2nd validation");
	 sa.assertEquals("Hello","Hello");
	 
	 System.out.println("checking 3rd validation");
	 sa.assertEquals(12,12);
	 
	 sa.assertAll();
  }
  @Test
  public void testMethod2() {
	  SoftAssert sa=new SoftAssert();
		 System.out.println("checking 1st validation");
		 sa.assertEquals(10,10);
		 
		 sa.assertAll();
  }
  
}
