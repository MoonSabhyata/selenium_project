package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example6_enablefalse {

	
	@Test
	public void tc1() {
		Reporter.log("tc1", true);
	}
	
	@Test(enabled = false)
	public void tc2() {
		Reporter.log("tc2", true);
	}
     
	@Test
	public void yc3() {
		Reporter.log("tc3", true);
	}
}
