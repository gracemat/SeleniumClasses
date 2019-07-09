package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemVerificationClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.crmpro.com/register");
		
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		System.out.println(submitButton.isDisplayed());
		System.out.println("Submit button before terms selection--"+submitButton.isEnabled());
		System.out.println(submitButton.isSelected());
		
		WebElement agreeTermsElement = driver.findElement(By.name("agreeTerms"));
		System.out.println(agreeTermsElement.isEnabled());
		System.out.println("Terms before Clicking ::"+agreeTermsElement.isSelected());
		
		agreeTermsElement.click();
		
		System.out.println("Terms after Clicking ::"+agreeTermsElement.isSelected());
		
		System.out.println("Submit button after terms selection--"+submitButton.isEnabled());
		
		
	}

}
