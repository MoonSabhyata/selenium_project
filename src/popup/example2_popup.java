package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_popup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1111");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Alert alt = driver.switchTo().alert();
	
	alt.getText();
	alt.accept();
	alt.accept();
	
}
}
