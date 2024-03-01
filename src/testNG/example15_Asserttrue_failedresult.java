package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example15_Asserttrue_failedresult {

	@Test
	public void tc1() {
		boolean actresult = false;
		
		Assert.assertTrue(actresult,"failed-result is false");
		
	}
	
	
	
}
