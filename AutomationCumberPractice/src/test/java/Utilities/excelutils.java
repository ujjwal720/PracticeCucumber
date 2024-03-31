package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {

	public FileInputStream st;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;

	public int getrows(File a) throws IOException {

		st = new FileInputStream(a);
		workbook = new XSSFWorkbook(st);
		sheet = workbook.getSheetAt(0);

		int x = sheet.getLastRowNum();

		return x;

	}

	public int getcols(File a) throws IOException {

		st = new FileInputStream(a);
		workbook = new XSSFWorkbook(st);
		sheet = workbook.getSheetAt(0);
		int x = sheet.getRow(0).getLastCellNum();

		return x;

	}

	public String getdata(int rows, int cols, File a) throws IOException {

		st = new FileInputStream(a);
		workbook = new XSSFWorkbook(st);
		sheet = workbook.getSheetAt(0);
		String ui = sheet.getRow(rows).getCell(cols).toString();
		return ui;

	}

}
