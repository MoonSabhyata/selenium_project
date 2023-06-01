package handlinofgAutoSuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("headphones");
	
	List<WebElement> allopt = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	 
	String exptext=" headphones under 500 ";
	for(WebElement s1:allopt)
	{
		
		String acttext = s1.getText();
		if(acttext.equals(exptext))
		{
			s1.click();
			break;
		}
	}
}
}
