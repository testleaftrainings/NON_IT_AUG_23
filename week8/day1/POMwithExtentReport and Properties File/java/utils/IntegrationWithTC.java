package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegrationWithTC {

	//step4:
	//retain the static -common reference 
	public static String[][] excelData(String filename) throws IOException {

		XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet=wb.getSheetAt(0);
	
		XSSFRow row=sheet.getRow(0);
		int rowCount= sheet.getLastRowNum();
		System.out.println("no of rows :"+rowCount);
	
		int cellCount = row.getLastCellNum();
		System.out.println("no of cells :"+cellCount);
		//step 1
		String[][] data=new String[rowCount][cellCount];

		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j = 0; j <cellCount; j++) {
				String data1 = row2.getCell(j).getStringCellValue();
				System.out.println(data1);
				//step2: convert excel value into dataprovider
				data[i-1][j]=data1;
				//data[1-1][0]=data[0][0]
				//index=0 but excel row value=1
				//data[0][0]
			}
		}
		
		wb.close();
		//step3:
		return data;
	}

}
