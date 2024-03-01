package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example21_failed_xml {

	@Test
	public void TC1() {
		Reporter.log("running tc1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("running tc2",true);
	}
	
	@Test
	public void TC3() {
		Reporter.log("running tc3",true);
	}
	
	@Test
	public void TC4() {
		Reporter.log("running tc4",true);
	}
	
	@Test
	public void TC5() {
		Reporter.log("running tc5",true);
	}
	
	
	
}
