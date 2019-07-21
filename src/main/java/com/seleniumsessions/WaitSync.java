package com.seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitSync {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.heb.com/my-account/login");
		 * 
		 * Thread.sleep(10000);
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.findElement(By.id("login-email")).sendKeys("grace.matham@gmail.com");
		 * driver.findElement(By.id("reg-password")).sendKeys("L0g!nnow");
		 * driver.findElement(By.id("login-submit")).click();
		 * 
		 * Thread.sleep(5000); System.out.println(driver.getTitle());
		 * 
		 * driver.quit();
		 */
		 		
		  driver.get("https://app.hubspot.com/login");
		  
		 //Thread.sleep(10000);//Thread.sleep will pause your script for the time u have given
		  // and it is static wait, we cannot execute if waiting time is done,Problem of waiting is solved 
		  //but you are wasting your time if it doesnot need to wait,To solve this we need to put dynamic wait
		  
		 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicitly wait can be applied only on webElements
		  //o/p::Checking browser
		//  HubSpot Login
		  //Implicitly is also called global wait and time is dynamic in nature
		  //for every element we are unnecessarily waiting as implicit is global wait
		  
		 //EXPLICITLY WAIT---It has no keyword but create an object of the class WebDriverWait
		  WebDriverWait waitTime = new WebDriverWait(driver, 10);//here also time is dynamic in nature
		  waitTime.until(ExpectedConditions.titleContains("HubSpot Login"));//for reports dashboard it gives same output
		  
		  System.out.println(driver.getTitle());
		  
		  driver.findElement(By.id("username")).sendKeys("naveenanimation20@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("Test@1234");
		  driver.findElement(By.id("loginBtn")).click();
		  
		 // Thread.sleep(4000);//here the wait is constant always
		  By filterLocator = By.xpath("//span[@class='UIIcon__IconContent-sc-158mw98-0 jFRoIG']");
		  waitTime.until(ExpectedConditions.presenceOfElementLocated(filterLocator));
		  
		boolean flag =   driver.findElement(By.xpath("//span[@class='UIIcon__IconContent-sc-158mw98-0 jFRoIG']")).isDisplayed();//filter dashboard element
		 System.out.println(flag); 
		  
		  System.out.println(driver.getTitle());
		 
	}

}
