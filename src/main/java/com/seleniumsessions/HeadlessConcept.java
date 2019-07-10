package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessConcept {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.bbc.com/news");
		
		System.out.println(driver.getTitle());
		//headless mode is useful when you dont want to get disturbed with your present execution
		//internally display property might be false
		//time will be saved
		
		
		
		
	}

}
