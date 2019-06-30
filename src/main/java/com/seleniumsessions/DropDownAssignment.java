package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd&authMechanism=primary&specId=yidReg");
	
		WebElement elemCountryCode = driver.findElement(By.name("shortCountryCode"));
		
		countryCodeUtility(elemCountryCode, "India ‪(+91)‬");
		
		WebElement elemBirthMonth = driver.findElement(By.id("usernamereg-month"));
		
		selectMonthUtility(elemBirthMonth, 7);
		
		countryListFunction(elemCountryCode);
		
		countryListFunctionSelect(elemCountryCode, "India ‪(+91)‪");
		}
	/**
	 * 
	 * @param elemCode
	 * @param codeVal
	 */
	public static void countryCodeUtility(WebElement elemCode,String codeVal)
	{
		Select selCountryCode = new Select(elemCode);
		selCountryCode.selectByVisibleText(codeVal);
	}
	/**
	 * 
	 * @param elemMon
	 * @param monthIndex
	 */
	public static void selectMonthUtility(WebElement elemMon,int monthIndex)
	{
		Select selBirthMonth = new Select(elemMon);
		selBirthMonth.selectByIndex(monthIndex);
	}
	/**
	 * 
	 * @param elemCode
	 */
	
	public static void countryListFunction(WebElement elemCode)
	{
		Select selcountry = new Select(elemCode);
		List<WebElement> countryList = selcountry.getOptions();
		for(int i=0;i<countryList.size();i++)
		{
			String codeVal = countryList.get(i).getText();
			System.out.println(codeVal);
		}
		
	}
	/**
	 * 
	 * @param elemCode
	 * @param selCountryCode
	 */
	public static void countryListFunctionSelect(WebElement elemCode,String selCountryCode)
	{
		Select selcountry = new Select(elemCode);
		List<WebElement> countryList = selcountry.getOptions();
		for(int i=0;i<countryList.size();i++)
		{
			String codeVal = countryList.get(i).getText();
			String codeValarr[] = codeVal.split(" ");
			String code[] =selCountryCode.split(" "); 
			if(codeValarr[0].equals(code[0]))
			{
				countryList.get(i).click();
				break;
			}
			System.out.println(codeVal);
			
		}
		
	}
	
	
	
	
}
