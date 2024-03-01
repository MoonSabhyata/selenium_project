package POM_DDF_TestNG_CPSSfailedTC_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass 
{
	
	//@Authername:sabhyata 
	//This method is used to get Test data from Excel.
	//need to passs 2 inputs:1-rowIndex,2-colIndex.
 public static String getTestdata(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
	 FileInputStream file=new FileInputStream("C:\\Users\\P\\Desktop\\seleniumwork\\DDF.xlsx");
	    Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
	    String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
	    
	    return value;
 }
 
 public static void CaptureScreenshot(WebDriver driver, int TCID) throws IOException {
	
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\\\Users\\\\P\\\\Desktop\\\\seleniumwork\\\\ScreenShot\\testcaseid"+TCID+".jpg");
	 FileHandler.copy(src, dest);
}

 public static  String getPFdata(String key) throws IOException {
	
	 FileInputStream file=new FileInputStream("C:\\Users\\P\\Documents\\workspacetesting\\javatesting\\selenium-testing\\PropertyFile.properties");
	 
	 Properties p=new Properties();
	 p.load(file);
	 
	 String value = p.getProperty(key);
	 
	 return value;
	 
	 
	 
}
	
}
