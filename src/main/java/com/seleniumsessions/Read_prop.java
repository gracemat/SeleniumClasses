package com.seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_prop {
	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream("C:\\Users\\prave\\eclipse-workspace\\seleniumclasses\\src\\main\\java\\configuration\\config.properties");
		prop.load(fip);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}