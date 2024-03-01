package Pom_DDF1;

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
	
	public void inpPBMobNumPageMobNum() {
		enterMobnum.sendKeys("9637798683");
	}
	
	public void clickPBMobNumPagesigninwithpwd() {
		signinwithpwd.click();
	}
	
}
