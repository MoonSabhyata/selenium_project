package Pom_DDF1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage {

	@FindBy(xpath = "//input[@type='password']") private WebElement enterPwd;
	@FindBy(xpath = "//span[text()='Sign in']") private WebElement signin;
	
	public PBPwdPage(WebDriver driver)
	{
       PageFactory.initElements(driver,this);
	}
	
	public void inpPBPwdPagePWD() {
		enterPwd.sendKeys("sabhyata@17");
	}
	
	public void clickPBPwdPageSignin() {
		signin.click();
	}
	
}
