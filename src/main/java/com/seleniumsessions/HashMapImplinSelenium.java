package com.seleniumsessions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapImplinSelenium {
	public static void main(String[] args) {
		
		//Role based USe Case
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.vitaminshoppe.com/s/myAccount/login.jsp");
		
	     driver.findElement(By.id("vs_registerLoginEmailAddress")).sendKeys("Adam");;
		 driver.findElement(By.id("vs_registerLoginPassword")).sendKeys("@dam123");	
	}
	
	public HashMap<String, String>getCredentialsMap() {
		HashMap<String, String> roleBased = new HashMap<String, String>();
		roleBased.put("Customer", "Adam:@dam123");
		roleBased.put("Admin", "Andrew:@ndrew231");
		roleBased.put("Supply", "Ajay:@jay321");
		roleBased.put("Delivery", "Arjun:@rjun213");
		return roleBased;
		
	}

}
