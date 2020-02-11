package org.testleaf.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
		public String[][]  readExcelData(String filename, String sheetname)throws IOException {
		 XSSFWorkbook book = new XSSFWorkbook("./TestData/"+filename+".xlsx");
		 XSSFSheet sheet = book.getSheet(sheetname);
		 int rowcount = sheet.getLastRowNum();
			System.out.println(rowcount);
			XSSFRow firstRow = sheet.getRow(0);
			int colcount = firstRow.getLastCellNum();
			System.out.println(colcount);
			String[][] data = new String[rowcount][colcount];
		 for (int j = 1; j <= rowcount; j++) {
			
			XSSFRow row = sheet.getRow(j);
			
			for (int i = 0; i < colcount; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				data[j-1][i]= value;
				System.out.println(value);
			} 
		}
		book.close();
		return data; 
		}

	
}


