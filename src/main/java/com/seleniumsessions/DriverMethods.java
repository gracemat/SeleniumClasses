package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.timeforkids.com");
		driver.navigate().back();
		driver.manage().window().fullscreen();
		
		driver.navigate().forward();
		
		String newurl=driver.getCurrentUrl();
		System.out.println(newurl);
		
		if(newurl.contains("fore"))
		{
			System.out.println("Url has it" );
		}
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.manage().deleteAllCookies();
		
		//System.out.println(driver.getPageSource());
		
		
		
		String title = driver.getTitle();
		
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
