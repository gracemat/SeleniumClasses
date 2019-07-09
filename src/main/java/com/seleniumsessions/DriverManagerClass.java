package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//no need to setup .exe class
public class DriverManagerClass {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.bbc.com/news");
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com");
		
		//WebDriverManager.chromedriver().version("2.26").setup();//to fix with exact version
		
	}

}
