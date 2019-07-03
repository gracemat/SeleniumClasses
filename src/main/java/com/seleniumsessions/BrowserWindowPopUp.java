package com.seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.popuptest.com/goodpopups.html");
	
	driver.findElement(By.linkText("Good PopUp #3")).click();
	
	Set<String> handles =  driver.getWindowHandles();
	
	Iterator<String> itr = handles.iterator();
	
	String mainWindowId = itr.next();
	
	System.out.println("Home Page title : "+mainWindowId);
	
	String popupWindowId = itr.next();
	
	System.out.println("Pop-up Window title : "+popupWindowId);
	
	driver.switchTo().window(popupWindowId);
	
	String popupTitle = driver.getTitle();
	
	System.out.println("Child window title : " +popupTitle);
	
	driver.close();
	
	driver.switchTo().window(mainWindowId);
	
	System.out.println(driver.getTitle());
	
}
}
