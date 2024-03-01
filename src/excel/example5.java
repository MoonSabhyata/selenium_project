package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("\\C:\\Users\\P\\Desktop\\seleniumwork\\selenium_excel.xlsx");
	boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(2).getBooleanCellValue();
	
	System.out.println(value);
}
	
	
	
	
	
	
}
