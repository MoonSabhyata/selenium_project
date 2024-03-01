package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1pwdpage {

  @FindBy(xpath = "//input[@type='password']") private WebElement password;
	@FindBy(xpath = "//span[text()='Sign in']") private WebElement signin;
	
	public PB1pwdpage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void entrpwd() 
	{
		password.sendKeys("sabhyata@17");
	}
    
	public void signinbtn() {
		signin.click();
	}
}
