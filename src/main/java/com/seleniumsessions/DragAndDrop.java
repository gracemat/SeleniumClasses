package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions action = new Actions(driver);
		Thread.sleep(4000);
		
		WebElement sourceElem = driver.findElement(By.id("draggable"));
		WebElement targetElem = driver.findElement(By.id("droppable"));
		
		//action.clickAndHold(sourceElem).moveToElement(targetElem).release().build().perform();
		
//		action.
//		clickAndHold(sourceElem).
//		moveToElement(targetElem).
//		release().
//		build().
//		perform();
		
		action.dragAndDrop(sourceElem, targetElem).build().perform();
	}

}
