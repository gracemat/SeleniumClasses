package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String userId = "admin";
		String pwd = "admin";
		
		driver.get("http://"+userId+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");

	}

}
