package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example7_getselectedoption {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/P/Desktop/HTML/multiselect.html");
	
	WebElement selectchanne  =driver.findElement(By.xpath("//select[@id='12345']"));
	Select s=new Select(selectchanne);
	
	s.selectByIndex(2);
	s.selectByIndex(3);
	s.selectByIndex(1);
	
	WebElement selectoption = s.getFirstSelectedOption();
	String text = selectoption.getText();
	System.out.println(text);
}
}
