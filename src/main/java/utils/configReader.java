package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
	
	
	public static Properties initialiseProperties() {
		
		File file = new File("/Users/challaprasad/Documents/Java-Selenium/cucumberHybridFrameWork/src/test/resources/config/config.properties");
		FileInputStream fis; 
		Properties prop = new Properties();
		
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
	
	

}
