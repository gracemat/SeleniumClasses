package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOptionsTest {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver(OptionsAssignment.getBrowserOptions());
driver.get("https://www.walmart.com");
System.out.println(driver.getCurrentUrl());
	}

}
