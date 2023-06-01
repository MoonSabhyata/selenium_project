package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example6_getselectedoptionfromsinglelistbx {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/P/Desktop/HTML/multiselect.html");
	WebElement selectchannel = driver.findElement(By.xpath("//select[@id='12345']"));
	 Select s=new Select(selectchannel);
	 s.selectByIndex(0);
	 s.selectByIndex(1);
	 
	  WebElement selecoption = s.getFirstSelectedOption();
	  String text = selecoption.getText();
	  System.out.println(text);
	
}
}
