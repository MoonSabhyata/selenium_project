package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_getcurrenturl
{
public static void main(String[] args) 
{
 WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");

String url = driver.getCurrentUrl();
	System.out.println(url);
}
}
