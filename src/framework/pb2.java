package framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pb2 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
driver.findElement(By.xpath("//a[text()='Sign in']")).click();

driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9637798683");
driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sabhyata@17");
driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	
WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
Thread.sleep(2000);
Actions act=new Actions(driver);
act.moveToElement(myacc).perform();

driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
Thread.sleep(2000);
Set<String> allids = driver.getWindowHandles();
ArrayList<String> al=new ArrayList<String>(allids);
driver.switchTo().window(al.get(1));
Thread.sleep(2000);
String actval = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	String expval = "sabhyata sanjay moon";
	if(actval.equals(expval))
	{
		System.out.println("tc pass");
	}
	else
	{
		System.out.println("failed");
	}
	
	
	driver.quit();
	
	
	
}
}
