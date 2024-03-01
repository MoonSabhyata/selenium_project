package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example16_Assertfalse {

	@Test
	public void tc1() {
		boolean actresult = false;
		
		Assert.assertFalse(actresult);
	}
	
}
