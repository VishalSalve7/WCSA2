package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/TestData2.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("information");
		
		Row rw = sh.getRow(3);
		
		Cell cl = rw.getCell(1);
		
		String data = cl.getStringCellValue();
		
		System.out.println(data);
		
		
	}

}
