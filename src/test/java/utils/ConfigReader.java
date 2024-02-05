package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	FileInputStream fis;

	public ConfigReader() {

		File configfile = new File("./src/test/java/com/helper/config.property");
		try {
			fis = new FileInputStream(configfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		String browser = prop.getProperty("Browser");
		return browser;

	}
	public String getURL() {
		String URL = prop.getProperty("url");
		return URL;

	}
}
