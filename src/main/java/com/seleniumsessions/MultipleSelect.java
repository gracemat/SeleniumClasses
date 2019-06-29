package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		Thread.sleep(5000);
		WebElement skillsElem = driver.findElement(By.name("skills"));
		Select selSkills = new Select(skillsElem);
		
		selSkills.selectByVisibleText("html");
		//selSkills.selectByVisibleText("css");
		//selSkills.selectByVisibleText("angular");
		
		//selSkills.deselectByVisibleText("angular");
		
		System.out.println(selSkills.isMultiple());
		
	}

}
