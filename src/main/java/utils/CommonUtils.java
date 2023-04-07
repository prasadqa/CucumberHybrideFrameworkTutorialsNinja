package utils;

import java.util.Date;

public class CommonUtils {

	public static final int IMPLICIT_WAIT = 20;
	public static final int PAGE_LOAD_TIMEOUT = 20;
	
	public static String uniqEmail() {
		
		Date data = new Date();
		return    "amotoori"+data.toString().replaceAll(" ", "_").replaceAll(":", "_")+"@gmail.com";
		
	}
}
