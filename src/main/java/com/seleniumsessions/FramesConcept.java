package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		WebElement mainFrame = driver.findElement(By.xpath("/html/frameset/frameset/frameset/frame[1]"));
		driver.switchTo().frame(mainFrame);
		
		WebElement titleofFrame  = driver.findElement(By.cssSelector("body > h2"));
		System.out.println(titleofFrame.getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());
		
	}

}
