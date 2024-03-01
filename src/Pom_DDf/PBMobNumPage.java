package Pom_DDf;

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
	
	public void inpPBMobNumPageMobNum(String mobilnum) {
		enterMobnum.sendKeys(mobilnum);
	}
	
	public void clickPBMobNumPagesigninwithpwd() {
		signinwithpwd.click();
	}
	
}
