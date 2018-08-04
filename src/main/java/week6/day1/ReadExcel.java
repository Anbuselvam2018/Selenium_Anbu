package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	//@Test
	public void readExcel() throws IOException {
		//Open excel from file path
		XSSFWorkbook wBook = new XSSFWorkbook("./Data/login.xlsx");
		// Go to sheet
		XSSFSheet sheet = wBook.getSheet("login");
		//Find the row count
		int rowCount = sheet.getLastRowNum();
		// Find the cell count
		int colCount = sheet.getRow(0).getLastCellNum();
		
		//Read the data
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			
			}

		}
		wBook.close();
	}


}
