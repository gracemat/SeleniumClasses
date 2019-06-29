package com.seleniumsessions;

import java.awt.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Greeshma
 *
 */
public class DropDownLesson {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.cheapoair.com/flights/booknow/cheap-flight-tickets?fpaffiliate=coa-google-brand&fpsub=cheapoair&utm_campaign=brand-coa&utm_term=cheapoair&utm_term_id=kwd-3036434406&utm_source={google}&utm_medium={cpc}&device=c&fpprice=&campaignID=59292846&adgroupId=2042629326&gclid=CjwKCAjw0tHoBRBhEiwAvP1GFc72YPNDDlD3v-2G-cTBzyFtn680ERuNKd7pZ-L7nn_82KTEl6DywhoCuRAQAvD_BwE");
		driver.get("https://www.CheapOair.com");

		Thread.sleep(4000);
		WebElement elemadults = driver.findElement(By.name("Adults"));	
		
	Select sel = new Select(elemadults);
	
//	sel.selectByVisibleText("4");
		WebElement elemSenior = driver.findElement(By.name("Seniors"));
	Select selSenior = new Select(elemSenior);
//	selSenior.selectByVisibleText("2");
		WebElement elemChildren = driver.findElement(By.name("Children"));
//	Select selChildren = new Select(elemChildren);
//	selChildren.selectByVisibleText("3");
//	selectOption(driver.findElement(By.name("Children")),"2");
	selectOption(elemSenior, "4");
	selectOption(elemadults, 3);
	Thread.sleep(3000);
	//sel.deselectByVisibleText("3");
	
	 java.util.List<WebElement> adultsList = sel.getOptions();
	 System.out.println("Adults :" );
	 for(int i=0;i<adultsList.size();i++)
	 {
		System.out.println(adultsList.get(i).getText()); 
	 }
	 java.util.List<WebElement> seniorList = selSenior.getOptions();
	 System.out.println("Seniors:");
	 for(int i=0;i<seniorList.size();i++)
	 {
		 System.out.println(seniorList.get(i).getText());
	 }
	 
	 getTravelersList(elemChildren);

	}
/**
 * This method is used to select any Traveler by text
 * @param elem
 * @param num
 */
	public static void selectOption(WebElement elem, String num) {
		Select select = new Select(elem);
		select.selectByVisibleText(num);

		select.deselectByVisibleText("3");
	}
/**
 * This method is overloaded
 * @param ele
 * @param index
 */
	public static void selectOption(WebElement ele, int index) {
		Select sel = new Select(ele);
		sel.selectByIndex(index);

	}
	
	public static void getTravelersList(WebElement listElem) 
	{
		System.out.println("Getting values from List method:");
		Select select = new Select(listElem);
		java.util.List<WebElement> listMethod = select.getOptions();
		for(int i=0;i<listMethod.size();i++)
		{
			System.out.println(listMethod.get(i).getText());
		}
		
	}
	
	

}