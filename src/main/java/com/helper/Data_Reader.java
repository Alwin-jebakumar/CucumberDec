package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_Reader {
	
	Properties p;;
	
	public Data_Reader() throws IOException {
		
		File f = new File(
				"D:\\ProjectMARCH7AM\\Cucumber_Practice\\src\\main\\java\\com\\propertyfile\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
		
	}
	

	public String getPropUrl()  {

		String url = p.getProperty("url");

		return url;

	}

	public String getPropUsername() {

		String username = p.getProperty("username");

		return username;

	}

	public String getPropPassword() {
		
		String password = p.getProperty("password");
		
		return password;

	}

}
