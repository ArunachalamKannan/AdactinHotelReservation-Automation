package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.AdactinHotelAppBase;

public class LoginPageTestData extends AdactinHotelAppBase {
	public static String[][] excelLoginData(String fileName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("./data/" + fileName + ".xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		short columnCount = sheet.getRow(0).getLastCellNum();
		String[][] newData = new String[rowCount - 1][columnCount];

		for (int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter format = new DataFormatter();
				System.out.println(cell);
				String cellValue = format.formatCellValue(cell);
				newData[i - 1][j] = cellValue;
			}
		}
		try {
			wbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return newData;
	}
}
