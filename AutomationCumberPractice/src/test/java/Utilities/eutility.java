package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class eutility {

	XSSFWorkbook workbook = null;
	FileInputStream fis = null;
	XSSFSheet sheet = null;
	XSSFRow headerRow = null;
	XSSFRow row = null;
	XSSFCell cell = null;
	int rowCount = 0;
	int colNum = -1;
	List<String> columnData = new ArrayList<String>();

	public eutility(String path) throws IOException {

		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);

	}

	public List<String> readExcelData(String sheetName, String columnName) {
		sheet = workbook.getSheet(sheetName);
		headerRow = sheet.getRow(0);
		rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		for (int j = 1; j <= rowCount; j++) {
			row = sheet.getRow(j);

			for (int i = 0; i < row.getLastCellNum(); i++) {
				if (headerRow.getCell(1).getStringCellValue().trim().equals(columnName.trim()))
					colNum = i;
				;
			}
			cell = row.getCell(colNum);
			String value = cell.getStringCellValue();
			columnData.add(value);
		}
		return columnData;
	}

}