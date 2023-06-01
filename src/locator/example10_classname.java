package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example10_classname {
public static void main(String[] args) {
	 WebDriver driver =new ChromeDriver();
	 driver.get("file:///C:/Users/P/Desktop/HTML/classname.html");
	 
	 
	 driver.findElement(By.className("abc123")).sendKeys("sabbu");
	 
	 driver.findElement(By.className("abc123")).sendKeys("moon");
	 
}
}
