package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@title='Change Theme'])[2]")).click();
	
	
	
}
}
