package com.seleniumsessions;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsAssignment {
	public static ChromeOptions getBrowserOptions() {
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("test-type");
		co.addArguments("--ignore-certificate-errors");
		co.addArguments("--disable-popup-blocking");
		co.addArguments("--incognito");
		//co.addArguments("--headless");
		//Here we are trying to display this website without images to save some time
		
		HashMap<String,Object> images = new HashMap<String,Object>();
		images.put("images",2);
		HashMap<String,Object> prefs= new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		co.setExperimentalOption("prefs",prefs);
		return co;
		
	}

}
