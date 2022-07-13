package ExcelWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
// create a new class of file and track the location of sheet		
		File Myfile=new File("D:\\selenium\\BALANCE SHEET - Copy.xlsx");
// how to read string value	
		String heading=WorkbookFactory.create(Myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(heading);
// how to read numeric value			
		double date= WorkbookFactory.create(Myfile).getSheet("sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(date);
//
		
		
		
		
		
		
		
		//String heading1=WorkbookFactory.create(Myfile).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(heading1);
	}

}
