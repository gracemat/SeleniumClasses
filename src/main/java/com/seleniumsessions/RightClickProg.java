package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickProg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		action.contextClick(rightClick).build().perform();
		
		WebElement pastebutn = driver.findElement(By.className("context-menu-icon-paste"));
		
		System.out.println(pastebutn.getText());
		
		pastebutn.click();
		
		
		
	}

}
