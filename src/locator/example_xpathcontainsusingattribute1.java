package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_xpathcontainsusingattribute1 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("moonsabhyata@yahoo.in");
	
	driver.findElement(By.xpath("//input[contains(@class,'_9npi')] ")).sendKeys("prabandha");
	
	driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
	
}
}
