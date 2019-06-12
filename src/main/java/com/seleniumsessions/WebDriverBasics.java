package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
public static void main(String[] args) {
	
	//Open the Browser or Launch the browser
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Enter the url
	driver.get("http://google.com"); //or driver.get("http://www.google.com");
	
	// Get the title of the page
	String title = driver.getTitle();
	System.out.println("Page title is : " +title);
	
	//Verification point //Automation testing step
	if(title.equals("Google"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	
}
}
