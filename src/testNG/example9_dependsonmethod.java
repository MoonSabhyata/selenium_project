package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_dependsonmethod {

	
	@Test
	public void login() {
		Reporter.log("log in", true);
	}
	
	
	@Test(dependsOnMethods = {"login"})
	public void logout() {
		Reporter.log("logout",true);
	}
	
	
	
	
	
	
	
}
