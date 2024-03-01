package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1Myaccpage {

	   @FindBy(xpath = "//span[text()=' My profile ']") private WebElement myprofile;
 
	   public PB1Myaccpage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   
	   public void clkmypr() {
		
		   myprofile.click();
	}
	   
	   
}
