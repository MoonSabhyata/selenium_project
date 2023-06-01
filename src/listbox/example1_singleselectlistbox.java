package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_singleselectlistbox {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(3000);
	
	WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
	
	Select s=new Select(Month);
	s.selectByValue("3");
	
	
	
	
	
	
	
}
}
