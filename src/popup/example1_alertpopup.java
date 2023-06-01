package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_alertpopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("9637798683");
	 driver.findElement(By.xpath("//input[@name='submit']")).click();
	 
	//input[@name='submit']
	 
	 String text = driver.switchTo().alert().getText();
	 System.out.println(text);
	
	 //driver.switchTo().alert().dismiss();
	 
	 driver.switchTo().alert().accept();
	 driver.switchTo().alert().accept();
}
}
