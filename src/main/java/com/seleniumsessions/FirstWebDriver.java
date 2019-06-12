package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriver {
	public static void main(String[] args) {
		
	//Launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
				
	//Enter the url
		driver.get("https://www.timeforkids.com");
		
	//Get the tilte
		String webpagetitle = driver.getTitle();
		System.out.println("Web Page Title is- - - "+webpagetitle);
		
	//Verification point
		if(webpagetitle.equals("Time for Kids"))//.equalsIgnorecase
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test FAIL");
		}
	}

}
