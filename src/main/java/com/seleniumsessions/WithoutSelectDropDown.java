package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//get all values
		//select a value
		
		List<WebElement> elements = driver.findElements(By.xpath("//select[@id='month']/option"));
		for(int loop=0;loop<elements.size();loop++)
		{
			String monthValues = elements.get(loop).getText();
			System.out.println(monthValues);
			if(monthValues.equals("Oct"))
			{
				elements.get(loop).click();
				break;
			}
	}
		
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
		for(int i=0;i<dayList.size();i++)
		{
			String dayOptions = dayList.get(i).getText();
			System.out.println(dayOptions);
		 dayList.get(i).click();
		 if(dayOptions.equals("17"))
		 {
			 break;
		 }
		 
		}
	}

}
