package Week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	
	  public String[][] readexceldata(String filename) throws IOException {
	  XSSFWorkbook book = new XSSFWorkbook("./Data/" +filename+ ".xlsx"); 
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
	 

	public String[][] readexceldata1(String filename) throws IOException {
		XSSFWorkbook book1 = new XSSFWorkbook("./Data/" + filename + ".xlsx");
		XSSFSheet sheet1 = book1.getSheetAt(1);
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Rowcount : " + rowcount);
		XSSFRow row = sheet1.getRow(0);
		int colcount = row.getLastCellNum();
		System.out.println("Colcount : " + colcount);
		String[][] data = new String[rowcount][colcount];
		for (int i = 1; i <=rowcount; i++) {
			XSSFRow row1 = sheet1.getRow(i);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell1 = row1.getCell(j);
				String value1 = cell1.getStringCellValue();
				data[i - 1][j] = value1;
				System.out.println(value1);
			}

		}
		book1.close();
		return data;
	}
	
	public String[][] readdeletedata(String filename) throws IOException
	{
		XSSFWorkbook book2 = new XSSFWorkbook("./Data/" + filename + ".xlsx");
		XSSFSheet sheet2 = book2.getSheetAt(2);
		int row = sheet2.getLastRowNum();
		System.out.println("Rowcount " + row);
		XSSFRow row2 = sheet2.getRow(0);
		int colcount = row2.getLastCellNum();
		System.out.println("COlcount "+ colcount);
		String[][] data=new String[row][colcount];
		
		
		for (int i = 1; i <=row; i++) {
			
			XSSFRow row3 = sheet2.getRow(i);
			
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell2 = row3.getCell(j);
				 String value3 = cell2.getStringCellValue();
				//int parse = Integer.parseInt(value3);
				data[i-1][j]=value3;
				System.out.println(value3);
				
				
				
			}
			
		}
		book2.close();
		return data;
	}
	
	public String[][] duplicatedata(String filename) throws IOException
	{
		XSSFWorkbook book2 = new XSSFWorkbook("./Data/" + filename + ".xlsx");
		XSSFSheet sheet2 = book2.getSheetAt(3);
		int row = sheet2.getLastRowNum();
		System.out.println("Rowcount " + row);
		XSSFRow row2 = sheet2.getRow(0);
		int colcount = row2.getLastCellNum();
		System.out.println("COlcount "+ colcount);
		String[][] data=new String[row][colcount];

		for (int i = 1; i <=row; i++) {
			
			XSSFRow row3 = sheet2.getRow(i);
			
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell2 = row3.getCell(j);
				 String value3 = cell2.getStringCellValue();
				//int parse = Integer.parseInt(value3);
				data[i-1][j]=value3;
				System.out.println(value3);
				
				
				
			}
			
		}
		book2.close();
		return data;
	}
	
	public String[][] Merge(String filename) throws IOException
	{
		XSSFWorkbook book1 = new XSSFWorkbook("./Data/"+ filename +".xlsx");
		XSSFSheet sheet2 = book1.getSheetAt(4);
		int rowcount= sheet2.getLastRowNum();
		System.out.println("Row Count: " + rowcount );
		XSSFRow row = sheet2.getRow(0);
		int colcount = row.getLastCellNum();
		System.out.println("Col Count: " + colcount );
		String[][] data=new String[rowcount][colcount];
		for (int i = 1; i <=rowcount; i++) {
			XSSFRow row2 = sheet2.getRow(i);
			for (int j = 0; j < colcount; j++) {
				
				XSSFCell cell = row2.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
				
			}
			
		}
		
		book1.close();
		return data;
	}

}
