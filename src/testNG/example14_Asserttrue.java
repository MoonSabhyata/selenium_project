package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example14_Asserttrue {

	@Test
	public void tc1() {
		
		boolean actresult = true;
		
		Assert.assertTrue(actresult);
		
	}
	
	
	
}
