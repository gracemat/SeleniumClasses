package com.seleniumsessions;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

	public static ChromeOptions getChromeOptions(String headless)
	{
		ChromeOptions chOptions = new ChromeOptions();
		chOptions.addArguments("--start-maximised");
		chOptions.addArguments("--ignoer-certificate-errors");
		chOptions.addArguments("--disable-popup-blocking");
		chOptions.addArguments("--incognito");
		chOptions.addArguments("test-type=browser");
		if(headless.equals("yes")) {
			chOptions.addArguments("--headless");
		}
		
		return chOptions;
			}
}
