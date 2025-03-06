package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

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

	public static String getBrowser() {

		return getPropertyData().getProperty("browser");

	}
	
	public static String getExcelFilePath() {

		return getPropertyData().getProperty("excelFilePath");

	}
	
	public static String getexpectedurl1() {

		return getPropertyData().getProperty("expectedurl1");

	}
	public static String getexpectedurl2() {

		return getPropertyData().getProperty("expectedurl2");

}
	public static String getexpectedurl3() {

		return getPropertyData().getProperty("expectedurl3");

}
	public static String getexpectedurl4() {

		return getPropertyData().getProperty("expectedurl4");
	}
	public static String getexpectedurl5() {

		return getPropertyData().getProperty("expectedurl5");
	}
	public static String getexpectedurl6() {

		return getPropertyData().getProperty("expectedurl6");
	}
	public static String getexpectedurl7() {

		return getPropertyData().getProperty("expectedurl7");
	}
	public static String getexpectedurl8() {

		return getPropertyData().getProperty("expectedurl8");
	}
	public static String getexpectedurl9() {

		return getPropertyData().getProperty("expectedurl9");
	}
	public static String getexpectedurl10() {

		return getPropertyData().getProperty("expectedurl10");
	}
	public static String getexpectedurl11() {

		return getPropertyData().getProperty("expectedurl11");
	}
	public static String getexpectedurl12() {

		return getPropertyData().getProperty("expectedurl12");
	}
	public static String getexpectedurl51() {

		return getPropertyData().getProperty("expectedurl51");
	}
	public static String getexpectedurl52() {

		return getPropertyData().getProperty("expectedurl52");
	}
}
