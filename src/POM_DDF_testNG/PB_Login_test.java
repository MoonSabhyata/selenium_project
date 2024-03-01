package POM_DDF_testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PB_Login_test
{

	int a;              //declare_globally
	PBLogINPage login;
	PBMobNumPage monum;
	PBPwdPage pwd;
	PBHomePage homepage;
	PBMyAccPage myacc;
	PBMyProfilePage myprofile;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\P\\Desktop\\seleniumwork\\DDF.xlsx");
	    sh = WorkbookFactory.create(file).getSheet("sheet1");
		
	    driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 login=new PBLogINPage(driver);
		 monum=new PBMobNumPage(driver);
		 pwd=new PBPwdPage(driver);
		 homepage=new PBHomePage(driver);
		 myacc=new PBMyAccPage(driver);
		 myprofile=new PBMyProfilePage(driver);
		a=10; //initialize_localy
	}
	
	@BeforeMethod
	public void LoginToApp() throws InterruptedException {
		
		login.clickPBLogINPagesignin();
		monum.inpPBMobNumPageMobNum(sh.getRow(0).getCell(0).getStringCellValue());
		monum.clickPBMobNumPagesigninwithpwd();
		pwd.inpPBPwdPagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBPwdPageSignin();
		//homepage.openDDoptionPBHomePageMyacc();
		//myacc.clickPBMyAccPageMyprofile();
		Thread.sleep(2000); 
	}
	@Test
	public void Verifyfullname() throws InterruptedException 
	{
		homepage.openDDoptionPBHomePageMyacc();
		Thread.sleep(2000);
		myacc.clickPBMyAccPageMyprofile();
		myprofile.switchtochildwindow();
		
		
		String actresult=myprofile.getPBMyProfilePagefullname() ;
		String expresult=sh.getRow(0).getCell(2).getStringCellValue();
		
		Assert.assertEquals(actresult, expresult,"failed bot are diff");
		
		//myprofile.verifyPBMyProfilePagefullname(sh.getRow(0).getCell(2).getStringCellValue());
	}
	
	@AfterMethod
	public void LogoutfromApp() {
		
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
