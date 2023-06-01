package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example9_getselectoption {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/P/Desktop/HTML/multiselect.html");
	
	WebElement selectchannel = driver.findElement(By.xpath("//select[@id='12345']"));
	Select s=new Select(selectchannel);
	s.selectByIndex(3);
	s.selectByIndex(2);
	
	WebElement selectoption = s.getFirstSelectedOption();
	String text = selectoption.getText();
	System.out.println(text);
}
}
