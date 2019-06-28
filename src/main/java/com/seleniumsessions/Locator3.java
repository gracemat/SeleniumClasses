package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files (x86)\\\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		//form-control private-form__control login-password m-bottom-3
//				driver.get("https://app.hubspot.com");
//		//5.class name-many webelements may have same class name
//				Thread.sleep(5000);
//
//		//form-control private-form__control login-email
//		
//		driver.findElement(By.className("login-email")).sendKeys("jessica@gmail.com");
//		
//		driver.findElement(By.className("login-password")).sendKeys("G@ne5h");
//		//uiButton private-button private-button--default private-button--primary m-bottom-4 login-submit disabled private-button--disabled private-button--non-link private-button--hover
//		driver.findElement(By.className("login-submit")).click();
		
		//6.link text--only for links
		driver.get("https://www.eknazar.com/");
		
		//driver.findElement(By.linkText("Dallas")).click();
		
		Thread.sleep(3000);
		//7.partial link text
		
		driver.findElement(By.partialLinkText("Dal")).click();
	}

}
