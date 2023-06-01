package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/P/Desktop/HTML/checkbox.html");
	
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement s1:checkbox)
	{
		s1.click();
	}
}
}
