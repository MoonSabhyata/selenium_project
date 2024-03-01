package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_timeout1 {

	@Test(timeOut = 5000)
	public void tc1() throws InterruptedException {
		
		Thread.sleep(7000);
		Reporter.log("running tc1", true);
	}
}
