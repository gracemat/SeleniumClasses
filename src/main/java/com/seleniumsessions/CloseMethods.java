package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.eenadu.net");
		
		String urlTitle = driver.getTitle();
		System.out.println(urlTitle);
		if(urlTitle.contains("EENADU"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		//driver.quit();//536cd7adbad73a3783fdc2cab92ab2ba7ec361e1-session ID
		driver.getTitle();//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		
	}

}
