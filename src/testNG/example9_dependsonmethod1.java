package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_dependsonmethod1 {
 
	@Test
	public void login() {
		Reporter.log("login", true);
	}
	
	@Test
	public void login1() {
		Reporter.log("login1", true);
	}
	
	@Test(dependsOnMethods = {"login","login1"})
    public void logout() {
	Reporter.log("logout",true);
    }	
	
}
