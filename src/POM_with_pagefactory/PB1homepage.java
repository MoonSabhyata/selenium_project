package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1homepage {

	 @FindBy(xpath = "//div[text()='My Account']")   private WebElement myAcc;
      WebDriver driver1;
	 public PB1homepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
		 driver1=driver;
	 }
	 
	 public void myacc() {
		Actions act=new Actions(driver1);
		act.moveToElement(myAcc).perform();
	}
	 
	 
	 
	 
	 
	 
	 
}
