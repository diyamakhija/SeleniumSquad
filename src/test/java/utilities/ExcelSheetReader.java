package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelSheetReader {

	private static Map<String, List<List<String>>> excelData;

	public static Map<String, List<List<String>>> getData(String filePath) {

		if (excelData != null) {
			return excelData;
		}

		excelData = new HashMap<>();

		try (FileInputStream fis = new FileInputStream(new File(filePath)); Workbook workbook = new XSSFWorkbook(fis)) {

			// Iterate through all sheets
			for (Sheet sheet : workbook) {
				List<List<String>> rows = new ArrayList<>();

				// Iterate through all rows
				for (Row row : sheet) {
					List<String> rowData = new ArrayList<>();

					// Iterate through all cells in a row
					for (Cell cell : row) {
						rowData.add(getCellValue(cell));
					}

					rows.add(rowData);
				}

				excelData.put(sheet.getSheetName(), rows);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return excelData;
	}

	public static Map<String, List<List<String>>> getExcelSheets() {
		return excelData;
	}

	private static String getCellValue(Cell cell) {
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case FORMULA:
			return cell.getCellFormula();
		case BLANK:
			return "";
		default:
			return "Unknown";
		}
	}

	public static List<String> userCredential(int row) {

		List<String> userCredential = getExcelSheets().get("Sheet1").get(row).subList(0, 3);
		return userCredential;

	}

	public static List<String> pythonCodeData() {

		List<String> pythonCode = getExcelSheets().get("pythonCode").get(1).subList(0, 2);
		return pythonCode;

	}

}
