package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_xpathcontainsusingtext2 {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
}
}
