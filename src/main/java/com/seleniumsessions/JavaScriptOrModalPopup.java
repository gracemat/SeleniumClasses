package com.seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptOrModalPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		//Java script alert or modal dialogue 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		if(alertmsg.equals("Please enter a valid user name"))
		{
			System.out.println("Test case for Popup msg got PASSED");
		}
		else
		{
			System.out.println("Wrong msg:Test case Failed");
		}
		alert.accept();
	//	alert.dismiss();
	}

}
