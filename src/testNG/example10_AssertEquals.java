package testNG;


import org.testng.Assert;

import org.testng.annotations.Test;

public class example10_AssertEquals {

	@Test
	public void tc1() {
		
		String actresult = "hi";
	     String expresult = "hi";	
		
	     Assert.assertEquals(actresult, expresult);
	}
	
	
	
}
