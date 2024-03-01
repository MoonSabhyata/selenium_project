package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1monumpage {

	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobnum;
	@FindBy(xpath = "(//a[@id='central-loggin-with-pwd'])[2]")   private WebElement signinwithpwd;
	
	
	public  PB1monumpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void entrmonum() {
		mobnum.sendKeys("9637798683");
	}
	
	public void signinwithpwd() {
		signinwithpwd.click();
	}
	
	
}
