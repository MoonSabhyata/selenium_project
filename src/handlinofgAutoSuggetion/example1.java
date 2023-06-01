package handlinofgAutoSuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		  List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		  
		  String expectedtext="redmi a2";
		  for(WebElement s1:alloption)
		  {
			 String actualtext = s1.getText();
			 if(actualtext.equals (expectedtext))
			 {
				 s1.click();
				 break;
			 }
		  }
		
	}
	
}

