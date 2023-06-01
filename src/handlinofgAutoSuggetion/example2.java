package handlinofgAutoSuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("headphones");
	
	List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	String expectext="headphones boat";
	for(WebElement s1:alloption)
	{
		//String acttext = s1.getText();
	//System.out.println(s1.getText());	
		String acttext = s1.getText();
		if(acttext.equals (expectext))
		{
			s1.click();
			break;
		}
		
	}
	
	
}
}
