package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example7_getcellsize {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("\\C:\\Users\\P\\Desktop\\seleniumwork\\selenium_excel.xlsx");
	short lastcellsize =WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
	System.out.println(lastcellsize);
}
}
