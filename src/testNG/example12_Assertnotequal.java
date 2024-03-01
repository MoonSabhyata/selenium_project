package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example12_Assertnotequal {

	@Test
	public void tc1() {
		
		String actresult = "hi";
		String expresult = "hellow";
		
		Assert.assertNotEquals(actresult,expresult);
				
				
	}
	
	
}
