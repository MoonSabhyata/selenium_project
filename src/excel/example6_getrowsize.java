package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6_getrowsize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("\\C:\\Users\\P\\Desktop\\seleniumwork\\selenium_excel.xlsx");
		
		int rowsize = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum() + 1;
		
		System.out.println(rowsize);
		
		
		
	}
	
	
	
	
	
}
