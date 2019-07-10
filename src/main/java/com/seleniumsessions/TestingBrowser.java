package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		String headless = "no";
		WebDriver driver = new ChromeDriver(BrowserOptions.getChromeOptions(headless));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(driver.getTitle());
		

	}

}
