package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example17_Assertfalse_failedresult {

	@Test
	public void tc1() {
		boolean actresult = true;
		
		Assert.assertFalse(actresult, "failed-result is true");
	}
	
	
	
	
}
