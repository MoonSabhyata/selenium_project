package POM_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage {

	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement enterMobnum;
	@FindBy(xpath = "(//a[@id='central-loggin-with-pwd'])[2]") private WebElement signinwithpwd;
	
	PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entermobnum() {
		enterMobnum.sendKeys("9637798683");
	}
	
	public void clickonsigninwithpwd() {
		signinwithpwd.click();
	}
	
}
