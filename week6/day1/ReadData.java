package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		//step 1-set the excel workbook path
		XSSFWorkbook wb=new XSSFWorkbook("./data/Login1.xlsx");

		//step2- get the sheet from the workbook-index will start from'0'

		XSSFSheet sheet=wb.getSheetAt(0);
		//sheet is given with name 
		//XSSFSheet sh=wb.getSheet("LoginData");

		//step 3-get the row count or row value
		XSSFRow row=sheet.getRow(0);
		//print the row count
		int rowCount= sheet.getLastRowNum();
		System.out.println("no of rows :"+rowCount);
		//print the cell count 
		int cellCount = row.getLastCellNum();
		System.out.println("no of cells :"+cellCount);
		//include header data also
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("with header row :"+physicalNumberOfRows);
		//print the value from sheet
		//cell value-'0'
		//row value-'1'
		String value = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);

		//print all data from excel
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j = 0; j <cellCount; j++) {
				String data = row2.getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}

		//close your workbook

		wb.close();
	}

}
