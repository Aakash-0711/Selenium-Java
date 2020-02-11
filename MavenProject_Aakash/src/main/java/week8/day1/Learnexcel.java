package week8.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Learnexcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./Data/Learn.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println("row" + rowcount);
		XSSFRow row2 = sheet.getRow(0);
		int lastCell = row2.getLastCellNum();
		System.out.println("colcount" + lastCell);
		for (int i = 1; i<= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			int colcount = row.getLastCellNum();
			//System.out.println("colcount" + colcount);
			for (int j = 0; j <colcount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
				
				
			}
			book.close();
		}

	}

}
