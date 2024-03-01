package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example13_Assertnotequals_failedresult {

	@Test
	public void tc1() {
		
		String actresult = "hi";
		String expresult = "hi";
		
		
		Assert.assertNotEquals(actresult, expresult,"failed-results are same");
		
	}
	
}
