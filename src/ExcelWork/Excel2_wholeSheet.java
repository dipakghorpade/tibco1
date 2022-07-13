package ExcelWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2_wholeSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("D:\\selenium\\BALANCE SHEET - Copy.xlsx");
// for sheet 1		
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mySheet = book.getSheet("sheet1");
		Row myrow = mySheet.getRow(1);
		Cell mycell=myrow.getCell(0);
		System.out.println(mycell.getCellType());
		
// for another sheet
// for whole sheet
		Sheet sheet3 = book.getSheet("INVEST");
		for(int i=1;i<=15;i++)
		{
			for(int j=1;j<=3;j++)
			{
				double value=sheet3.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value+"    ");	
			}
			System.out.println();
		}
		
		
		
		
	}

}
