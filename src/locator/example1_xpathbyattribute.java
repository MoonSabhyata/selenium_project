package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpathbyattribute 
{
public static void main(String[] args) 
{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("moonsabhyata@yahoo.in");
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("prabandha");
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
