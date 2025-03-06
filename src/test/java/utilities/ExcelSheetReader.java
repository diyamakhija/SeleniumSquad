package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelSheetReader {
	//creates new instance of the HashMap class and given to the variable
	//Map is a data structure that stores key-value pairs.
	private static Map<String, List<List<String>>> excelData = new HashMap<>();

	public static Map<String, List<List<String>>> getData(String filePath) {

		//A "for-each loop" (also known as an "enhanced for loop") is a concise way to iterate over elements in a collection (like an array, List, Set, or Map) in Java
		if (excelData.isEmpty()) {
			
			//creates and initializes the new file instance to the variable 
			 File file = new File(filePath);
			 
			 //creates and initializes the FileInputStream object to the variable
			 //FileInputStream object, which allows you to read data from the file "excelPythonCode"
			try (FileInputStream fis = new FileInputStream(file);
					
		    //creates and initializes the XSSFWorkbook object to the variable
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
						
						//adds up every single row of data
						rows.add(rowData);
					}					

					//put() This is the method used to add a new key-value pair to a Map
					excelData.put(sheet.getSheetName(), rows);
					fis.close();
				}
			} catch (Exception e) {
				LoggerLoad.error("Error while reading excel sheet", e);
			}
		}

		//output
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

		return getExcelSheets().get("userCredentials").get(row);

	}

	public static List<String> pythonCodeData(int row) {
		return getExcelSheets().get("pythonCode").get(row);
		 
	}

	public static List<String> outputCompare(int row) {

		return getExcelSheets().get("pythonCode").get(row);
		 
	}
	public static List<String> expectedUrl(int row) {

		return getExcelSheets().get("expectedUrl").get(row);	 

	}
	


}
