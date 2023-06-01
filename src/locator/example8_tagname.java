package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_tagname {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("C:/Users/P/Desktop/HTML/tagname.html");
	
	driver.findElement(By.tagName("input")).sendKeys("sabhyata");
	
	driver.findElement(By.tagName("input")).sendKeys("moon");
	
	
	
}
}
