package Week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RedbusExcel {

	public String[][] readredbus(String filename1) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./Data/" + filename1 + ".xlsx");
		XSSFSheet sheetat = book.getSheetAt(0);
		int row = sheetat.getLastRowNum();
		System.out.println("Rowcount :" + row);
		XSSFRow row2 = sheetat.getRow(0);
		int col = row2.getLastCellNum();
		System.out.println("Colcount : "+ col);
		String[][] data = new String[row][col];
		for (int i = 1; i <=row; i++) {
			XSSFRow row3 = sheetat.getRow(i);
			for (int j = 0; j < col; j++) {
				XSSFCell cell = row3.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
				
			}
		}
     book.close();
     return data;
	}

}
