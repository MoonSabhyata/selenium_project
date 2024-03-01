package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example2_testNGtestclass {

	@Test
	public void testcase1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
