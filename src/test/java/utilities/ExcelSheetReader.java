package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelSheetReader {

	private static Map<String, List<List<String>>> excelData = new HashMap<>();;

	public static Map<String, List<List<String>>> getData(String filePath) {

		if (excelData.isEmpty()) {
			 File file = new File(filePath);

			try (FileInputStream fis = new FileInputStream(file);
					Workbook workbook = new XSSFWorkbook(fis)) {

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
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
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

		return getExcelSheets().get("Sheet1").get(row).subList(0, 3);

	}

	public static List<String> pythonCodeData(int row) {

		return getExcelSheets().get("pythonCode").get(row).subList(0, 2);
		 

	}

}
