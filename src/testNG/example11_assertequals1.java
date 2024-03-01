package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example11_assertequals1 {

	@Test
	public void tc1() {
		
		String actresult = "hellow";
		String expresult = "hi";
		
		
		Assert.assertEquals(actresult, expresult,"failed:both tresult are different");
		
		
	}
	
	
	
}
