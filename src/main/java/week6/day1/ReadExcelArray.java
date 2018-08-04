package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelArray {
	//@Test
	public Object[][] readExcel(String filename) throws IOException {
		//Open excel from file path
		XSSFWorkbook wBook = new XSSFWorkbook("./Data/"+filename+".xlsx");
		// Go to sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		//Find the row count
		int rowCount = sheet.getLastRowNum();
		// Find the cell count
		int colCount = sheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[rowCount][colCount];
		//Read the data
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				try {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					data[i-1][j] = "";
				}

			}

		}
		wBook.close();
		return data;
	}


}
