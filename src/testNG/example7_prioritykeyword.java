package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example7_prioritykeyword {

	@Test(priority = 3)
	public void tc1() {
		Reporter.log("tc1", true);
	}
	
	
	@Test(priority = 1)
	public void tc2() {
		Reporter.log("tc1", true);
	}
	
	
	@Test(priority =2)
	public void tc3() {
		Reporter.log("tc1", true);
	}
	
	
}
