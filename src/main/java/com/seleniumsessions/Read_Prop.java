package com.seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Sequential testing

//

public class Read_Prop {
	static WebDriver driver;
	public static void main(String[] args) {
		 
		Properties pro = new  Properties();
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\prave\\eclipse-workspace\\seleniumclasses\\src\\main\\java\\configuration\\config.properties");
			try {
				pro.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println(pro.getProperty("userName/Email"));
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("Url"));//null as output as it doesnot match the variable in config.properties file
		
		//Cross Browser Handling
		
		String browseravail = pro.getProperty("browser");
		if(browseravail.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			if(pro.getProperty("headless").equals("yes")) {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
				driver = new ChromeDriver(co);
			}
			//driver = new ChromeDriver();
		}else if (browseravail.equalsIgnoreCase("Ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		else if (browseravail.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			
		}else
		{
			System.out.println("Please enter valid Browser name");
		}
		driver.get(pro.getProperty("url"));
		driver.findElement(By.id("vs_registerLoginEmailAddress")).sendKeys(pro.getProperty("userName/Email"));
		driver.findElement(By.id("vs_registerLoginPassword")).sendKeys(pro.getProperty("password"));
		
		
		}

}
