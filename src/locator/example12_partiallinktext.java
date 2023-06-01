package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example12_partiallinktext {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/P/Desktop/HTML/linktext.html");
	
	driver.findElement(By.partialLinkText("face")).click();
}
}
