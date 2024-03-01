package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_timeout {
	
	
    @Test(timeOut = 5000)
	public void tc1() {
		
    	Reporter.log("run tc1", true);
	}
	
}
