package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.uplifteducation.org/site/Default.aspx?PageType=7&SiteID=147&IgnoreRedirect=true");

		driver.get("https://www.timeforkids.com/login/");
		 //Thread.sleep(9000);
		
		//1.id locator
		 //WebElement userName = driver.findElement(By.id("swsignin-txt-username"));
		 //userName.sendKeys("Jessie");
		 
		  //WebElement pwd = driver.findElement(By.id("swsignin-txt-password"));
		//  pwd.sendKeys("upl!ft123");
		 
		 
		// WebElement submitbtn = driver.findElement(By.id("swsignin-btn-submit"));
		// submitbtn.click();
		/*
		 * driver.findElement(By.id("swsignin-txt-username")).sendKeys("Lucky");
		 * driver.findElement(By.id("swsignin-txt-password")).sendKeys("test@123");
		 * driver.findElement(By.id("swsignin-btn-submit")).click();
		 */

		
		//2.name locator
		driver.findElement(By.name("email")).sendKeys("jessica@gmail.com");
		
		//driver.quit();

	}

}
