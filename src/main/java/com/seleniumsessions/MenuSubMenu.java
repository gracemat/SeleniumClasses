package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuSubMenu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.eenadu.net/");
		
		Actions action = new Actions(driver);
		
		WebElement elemMoreNews = driver.findElement(By.linkText("ఇంకా.."));
		action.moveToElement(elemMoreNews).build().perform();
		
		Thread.sleep(3000);
		WebElement elemMagazines = driver.findElement(By.linkText("మ్యాగజైన్స్"));		
		action.moveToElement(elemMagazines).build().perform();
		
		Thread.sleep(3000);
		
	driver.findElement(By.linkText("అన్నదాత")).click();//its Telugu news paper section for Annadaata(Farmers)
	}

}
