package POM_DDF_TestNG_CPSSfailedTC_PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtest {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\P\\Desktop\\seleniumwork\\DDF.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
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
	String MobileNum = sh.getRow(0).getCell(0).getStringCellValue();
	monum.inpPBMobNumPageMobNum(MobileNum);
	monum.clickPBMobNumPagesigninwithpwd();
	Thread.sleep(2000);
	}
	
	PBPwdPage pwd=new PBPwdPage(driver);
	{
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	pwd.inpPBPwdPagePWD(password);
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
	String expfullname = sh.getRow(0).getCell(2).getStringCellValue();
	//myprofile.verifyPBMyProfilePagefullname(expfullname);
	Thread.sleep(2000);
	}
	driver.close();
}

}
