package POM_with_pagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1profilepage {
	
     @FindBy(xpath = "//input[@name='personName']")  private WebElement fullname;
      WebDriver driver2;
     public PB1profilepage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
           driver2=driver;
     }
     public void childwindowprofile() {
		
    	 Set<String> allid = driver2.getWindowHandles();
    	 ArrayList<String> al=new ArrayList<String>(allid);
    	 driver2.switchTo().window(al.get(1));
	}
     
     public void fullname() {
    	 
    		
    	 
		String actval = fullname.getAttribute("value");
		String expval="sabhyata sanjay moon"; 
		
		if(actval.equals(expval))
		{
			System.out.println("tc pass");
		}
		else
		{
			System.out.println("failed");
		}
	}
     
      
}
