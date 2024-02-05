package utils;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public static FileReaderManager getInstace() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	public ConfigReader getCrInstance() {
		ConfigReader cr = new ConfigReader();
		return cr;
		
	}
}
