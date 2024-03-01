package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_testng_annotations {

	@BeforeClass
	public void browser() {
		Reporter.log("open browse", true);
	}
	
	
	@BeforeMethod
	public void login() {
		Reporter.log("login", true);
	}
	
	@Test
	public void tc1() {
		Reporter.log("run tc1", true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("log out", true);
	}
	
	@AfterClass
	public void closechrome() {
		Reporter.log("close", true);
	}
	
	
	
	
	
	
	
	
	
}
