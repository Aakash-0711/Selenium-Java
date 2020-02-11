package Week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellearning {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./Data/Createlead.xlsx");
		XSSFSheet sheet = book.getSheet("TestData");
		int rowcount = sheet.getLastRowNum();
		System.out.println("Rowcount : " + rowcount);
		for (int i = 1; i <=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			int colcount = row.getLastCellNum();
			System.out.println("Colcount : " + colcount);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);	
			}
			book.close();
		}
		

	}

}
