package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("\\C:\\Users\\P\\Desktop\\seleniumwork\\selenium_excel.xlsx");
	String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(value);
}
}
