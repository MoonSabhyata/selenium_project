package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword_innovations {

	@Test( invocationCount = 5)
	public void tc1() {
		Reporter.log("tc1");
	}
}
