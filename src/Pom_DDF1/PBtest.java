package Pom_DDF1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	PBLogINPage login=new PBLogINPage(driver);
	{
	login.clickPBLogINPagesignin();
	Thread.sleep(2000);
	}
	
	PBMobNumPage monum=new PBMobNumPage(driver);
	{
	monum.inpPBMobNumPageMobNum();
	monum.clickPBMobNumPagesigninwithpwd();
	Thread.sleep(2000);
	}
	
	PBPwdPage pwd=new PBPwdPage(driver);
	{
	pwd.inpPBPwdPagePWD();
	pwd.clickPBPwdPageSignin();
	Thread.sleep(2000);
	}
	
	PBHomePage homepage=new PBHomePage(driver);
	{
	homepage.openDDoptionPBHomePageMyacc();
	Thread.sleep(2000);
	}
	
	PBMyAccPage myacc=new PBMyAccPage(driver);
	{
	myacc.clickPBMyAccPageMyprofile();
	Thread.sleep(2000);
	}
	
	PBMyProfilePage myprofile=new PBMyProfilePage(driver);
	{
	myprofile.switchtochildwindow();
	myprofile.verifyPBMyProfilePagefullname();
	Thread.sleep(2000);
	}
	driver.close();
}

}
