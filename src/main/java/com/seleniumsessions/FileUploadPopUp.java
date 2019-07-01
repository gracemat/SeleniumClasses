package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkley.edu/ex/fup.html");
		
		Thread.sleep(3000);
		
	WebElement fileupload =	driver.findElement(By.name("upfile"));
	
	fileupload.sendKeys("C:\\Users\\prave\\OneDrive\\Desktop\\AutomationClasses\\Assignments\\StringRev.PNG");
	}

}
