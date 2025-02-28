package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class ConfigReader {

	private static Properties propertyData = new Properties();

	public static Properties configRead(String propertyFilePath) {

		if (propertyData.isEmpty()) {
			File file = new File(propertyFilePath);
			try (FileInputStream fis = new FileInputStream(file)) {
				propertyData.load(fis);
				fis.close();
			}

			catch (IOException e) {
				e.printStackTrace();
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

}
