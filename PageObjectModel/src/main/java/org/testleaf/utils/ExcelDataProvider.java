package org.testleaf.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataProvider  {

	
	
public String[][] readexceldata(String excelFileName) throws IOException {
			  XSSFWorkbook book = new XSSFWorkbook("./Data/" +excelFileName + ".xlsx"); 
			  XSSFSheet sheet = book.getSheetAt(0); 
			  int rowcount = sheet.getLastRowNum();
			  System.out.println("Rowcount : " + rowcount); 
			  XSSFRow row = sheet.getRow(0);
			  int colcount = row.getLastCellNum(); 
			  System.out.println("Colcount : " + colcount); 
			  String[][] data= new String[rowcount][colcount]; 
			  for (int i = 1; i<= rowcount; i++) 
			  {
				  XSSFRow row1 = sheet.getRow(i); 
				  for (int j = 0; j <colcount; j++) 
				  { 
					  XSSFCell cell = row1.getCell(j); 
					  String value =cell.getStringCellValue(); 
					  data[i-1][j]=value; 
					  System.out.println(value); 
					  }
			  
			  }
			  book.close(); 
			  return data;
			  
			   }
}


