package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.skyscanner.co.in");
	
	driver.findElement(By.id("depart-fsc-datepicker-button")).click();
	
	WebElement date = driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select"));
	Select sel = new Select(date);
	sel.selectByVisibleText("July 2019");
	
	
	List<WebElement> datesList = driver.findElements(By.xpath("//tbody//tr//span"));
	System.out.println("Total days in calendar:" +datesList.size());
	
	List<WebElement> disabledDates = driver.findElements(By.className("bpk-calendar-date--blocked"));
	int disabledDatesCount = disabledDates.size();
	
	for ( int i=disabledDatesCount;i<datesList.size();i++)
	{
		String dateValue = datesList.get(i).getText();
		System.out.println(dateValue);
		if (dateValue.equals("1"))
		{
			datesList.get(i).click();
			break;
		}
		}
	
}
}
