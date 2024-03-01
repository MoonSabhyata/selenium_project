package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example18_Softassert {

	@Test
	public void tc1() {
		
		SoftAssert soft=new SoftAssert();
		
		String actresult = "hi";
		String expresult = "hello";
		
		soft.assertEquals(actresult,expresult,"failed-both are diff");
		
		boolean actresult1 = true;
		soft.assertFalse(actresult1,"failed2-result is true");
		
		soft.assertAll();
	}
	
	
	
}
