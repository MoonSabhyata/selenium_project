package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_mouse_Left_click {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//Thread.sleep(2000);
	//WebElement leftclick = driver.findElement(By.xpath("////span[text()='Cart']"));
	WebElement leftclick = driver.findElement(By.xpath("//span[text()='Become a Seller']"));
	Thread.sleep(200);
	Actions act=new Actions(driver);
	
	act.moveToElement(leftclick).perform();
	act.click().perform();
	
	//act.contextClick(leftclick).perform();
	
	
}
}
