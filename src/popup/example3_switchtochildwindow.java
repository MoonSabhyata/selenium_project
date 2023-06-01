package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_switchtochildwindow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	
	
	Set<String> allid = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(allid);
	String childwindow = al.get(1);
	
	driver.switchTo().window(childwindow);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Training']")).click();
}
}
