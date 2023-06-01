package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2_mouseRightclick {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement right_cliclk = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions act=new Actions(driver);
	
	//act.moveToElement(right_cliclk).perform();
	//act.contextClick().perform();
	
	act.contextClick(right_cliclk).perform();
}
}
