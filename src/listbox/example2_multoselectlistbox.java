package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_multoselectlistbox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/P/Desktop/HTML/multiselect.html");
	
	WebElement channel = driver.findElement(By.xpath("//select[@id='12345']"));
	
	Select s=new Select(channel);
	//s.selectByValue(null)
	
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
}
}
