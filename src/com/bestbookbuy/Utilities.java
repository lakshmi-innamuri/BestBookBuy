package com.bestbookbuy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.core.io.ResourceLoader;

public class Utilities {

	public static String[] getDBConfig() {
		String dbConfig[] = { "", "", "", "" };
		InputStream in = ResourceLoader.class.getResourceAsStream("/config.properties");
		Properties config = new Properties();
		try {
			config.load(in);
			dbConfig[0] = config.getProperty("host");
			dbConfig[1] = config.getProperty("port");
			dbConfig[2] = config.getProperty("user");
			dbConfig[3] = config.getProperty("code");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return dbConfig;
	}
}
