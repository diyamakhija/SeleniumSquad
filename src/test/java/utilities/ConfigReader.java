package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	// Declares and initializes a Properties object
	private static Properties propertyData = new Properties();

	public static Properties configRead(String propertyFilePath) {

		// A "for-each loop" (also known as an "enhanced for loop") is a concise way to
		// iterate over elements in a collection (like an array, List, Set, or Map) in
		// Java
		if (propertyData.isEmpty()) {

			// creates and initializes the new file instance to the variable
			File file = new File(propertyFilePath);

			// creates and initializes the FileInputStream instance to the variable
			// FileInputStream object, which allows you to read data from the file
			// "config.properties"
			try (FileInputStream fis = new FileInputStream(file)) {

				// loads properties from an input stream (fis) into a Properties object
				// (propertyData)
				propertyData.load(fis);
				fis.close();
			}

			catch (Exception e) {
				LoggerLoad.error("Error while reading config file", e);

			}

		}
		return propertyData;
	}

	public static Properties getPropertyData() {
		return propertyData;
	}

	public static String getPageURL() {

		return getPropertyData().getProperty("applicationurl");

	}

	public static String getExcelFilePath() {

		return getPropertyData().getProperty("excelFilePath");

	}
}
