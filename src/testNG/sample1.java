package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {
    
	@Test
	public void tc1() {
		Reporter.log("tc1", true);
	}
	
	@Test
	public void tc2() {
		Reporter.log("tc2", true);
	}
	
	@Test
	public void tc3() {
		Reporter.log("tc3", true);
	}
}
