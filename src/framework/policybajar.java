package framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class policybajar {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9637798683");
	
	driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
	
	driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("sabhyata@17");
	
	driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
	
	
	
	WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
	Actions act=new Actions(driver);
	act.moveToElement(myacc).perform();
	
	driver.findElement(By.xpath("//span[text()='My profile']")).click();
	
	
	 Set<String> allids = driver.getWindowHandles();
	 ArrayList<String> al=new ArrayList<String>(allids);
	 
	 driver.switchTo().window(al.get(1));
	 
}
}
