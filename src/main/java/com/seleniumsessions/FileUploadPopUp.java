package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkley.edu/ex/fup.html");
	}

}
