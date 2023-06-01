package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampl11_name {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/P/Desktop/HTML/name.html");
	
	driver.findElement(By.name("xyz123")).sendKeys("sabhyata");
	driver.findElement(By.name("xyz123")).sendKeys("moon");
}
}
