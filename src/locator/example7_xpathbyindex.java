package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_xpathbyindex {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sabhyata");
	
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("moon");
	
	
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("sabhyatamoon8@gmail.com");
	
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("prabhus");
}
}
