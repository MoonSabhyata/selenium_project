package POM_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PBLogINPage {
  @FindBy(xpath = "//a[text()='Sign in']") private WebElement signIN;
  
  public PBLogINPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void clickonsignINbtn() {
	
	  signIN.click();
}
  
}