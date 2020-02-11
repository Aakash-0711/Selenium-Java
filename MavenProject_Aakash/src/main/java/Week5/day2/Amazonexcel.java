package Week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Amazonexcel {
	
	public String[][] Amazon(String filename) throws IOException
	{
		XSSFWorkbook book=new XSSFWorkbook("./Data/" + filename + ".xlsx");
		XSSFSheet sheetat = book.getSheetAt(0);
		int rowcount = sheetat.getLastRowNum();
		System.out.println("rowcount" + rowcount);
		XSSFRow row = sheetat.getRow(0);
		int colcount = row.getLastCellNum();
		System.out.println("colcount" + colcount);
		String[][] data = new String[rowcount][colcount];
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row2 = sheetat.getRow(i);
			for (int j = 0; j < colcount; j++) {
				
				XSSFCell cell = row2.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
				
			}
			
		}
		book.close();
		return data;
	}

}
