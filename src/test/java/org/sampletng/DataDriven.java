package org.sampletng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	private void excelRead(int rowNo, int cellNo) throws FileNotFoundException {
		File f = new File("C:\\Users\\jayaselvamjai\\eclipse-workspace\\TnG\\src\\Book1.xlsx");

		FileInputStream file = new FileInputStream(f);

		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.getSheet("login");

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		int cellType = cell.getCellType();

		String value = "";

		if (cellType == 1) {

			value = cell.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(cell)) {

			Date date = cell.getDateCellValue();

			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");

			value = sim.format(date);

		} else {
			double n = cell.getNumericCellValue();

			long l = (long) n;

			value = String.valueOf(l);

		}
		System.out.println(value);

	}

}
