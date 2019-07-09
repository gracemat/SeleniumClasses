package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfElemVerif {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trivago.com");
		WebElement searchButton = driver.findElement(By.className("js-search-button"));
		System.out.println(searchButton.isDisplayed());
		System.out.println(searchButton.isEnabled());
		System.out.println(searchButton.isSelected());
		
		WebElement destination = driver.findElement(By.id("querytext"));
		destination.sendKeys("Miami");
		destination.click();
		
		System.out.println(destination.isSelected());
		
		WebElement stillSearchElem = driver.findElement(By.className("mhp-scroll__link"));
		System.out.println(stillSearchElem.isEnabled());
		System.out.println(stillSearchElem.isSelected());
		
		stillSearchElem.click();
		
		//System.out.println(stillSearchElem.isSelected());
		
		
		
		
		
	}

}
