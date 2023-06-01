package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9_ID {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("C:/Users/P/Desktop/HTML/id.html");
	
	driver.findElement(By.id("1234")).sendKeys("sabhyata");
	
	driver.findElement(By.id("4567")).sendKeys("moon"); 
}
}
