package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testPB1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	PB1loginpage s1=new PB1loginpage(driver);
	{
	s1.signin();
	Thread.sleep(2000);
	}
	PB1monumpage s2=new PB1monumpage(driver);
	{
	s2.entrmonum();
	s2.signinwithpwd();
	Thread.sleep(2000);}
	
	PB1pwdpage s3=new PB1pwdpage(driver);
	{
		s3.entrpwd();
	s3.signinbtn();
	Thread.sleep(2000);
	}
	PB1homepage s4=new PB1homepage(driver);
	{
		s4.myacc();
	Thread.sleep(2000);
	}
	PB1Myaccpage s5=new PB1Myaccpage(driver);
	{
		s5.clkmypr();
	
	Thread.sleep(2000);
	}
	PB1profilepage s6=new PB1profilepage(driver);
	{
	s6.childwindowprofile();
	s6.fullname();
	Thread.sleep(2000);
	}
	
	driver.quit();
	
	
	
	
}
}
