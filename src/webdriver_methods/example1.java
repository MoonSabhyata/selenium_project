package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
}
}
