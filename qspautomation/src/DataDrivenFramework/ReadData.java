package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		 Sheet sh = wb.getSheet("citytour");
		 
		 Row row = sh.getRow(1);
		 
		 Cell cell = row.getCell(1);
		 
		 String value = cell.getStringCellValue();
		 
		 System.out.println(value);
	}
}
