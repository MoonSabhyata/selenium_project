package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example5_ismultiple {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/P/Desktop/HTML/multiselect.html");
	
	WebElement channe = driver.findElement(By.xpath("//select[@id='12345']"));
	Select s=new Select(channe);
	
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
	
	Thread.sleep(2000);
	
	s.deselectAll();
	
	boolean result = s.isMultiple();
	System.out.println(result);
	
	
	if(result)
	{
		System.out.println("listbox is multiselect");
	}
	else
	{
		System.out.println("listbox is single selected");
	}
	
	
}
}
