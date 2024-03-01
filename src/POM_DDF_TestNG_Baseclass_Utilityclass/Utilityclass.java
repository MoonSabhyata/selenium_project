package POM_DDF_TestNG_Baseclass_Utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
 
 
	
	
}
