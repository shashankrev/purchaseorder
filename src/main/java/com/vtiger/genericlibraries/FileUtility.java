package com.vtiger.genericlibraries;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	/**
	 *    used to get data from property file based on key
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String getPropertyKeyValue(String key) throws Throwable  {
		  
			FileInputStream fis = new FileInputStream(AutoConstants.propertyFilepath);
			 Properties p = new Properties();
			 p.load(fis);
			 String value = p.getProperty(key);
		
		return value;
	}
}
