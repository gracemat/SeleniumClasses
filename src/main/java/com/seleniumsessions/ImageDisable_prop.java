package com.seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageDisable_prop {
	static WebDriver driver;
	static ChromeOptions co;
	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream(
					"C:\\Users\\prave\\eclipse-workspace\\seleniumclasses\\src\\main\\java\\configuration\\shopping_configuration.properties");
			try {
				prop.load(fip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();

		// driver.get(prop.getProperty("url"));
		if (prop.getProperty("imagedisable").equals("yes")) {
			co = new ChromeOptions();
			// co.addArguments("--imagedisable");

			driver = new ChromeDriver(getImageProp());// adding this utility doesnot display any images
			driver.get(prop.getProperty("url"));
			// driver.get(prop.getProperty("data"));
		}
	}
	public static ChromeOptions getImageProp() {

		HashMap<String, Object> images = new HashMap<String, Object>();
		images.put("images", 2);
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		co.setExperimentalOption("prefs", prefs);
		return co;

	}

}
