package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoSelectHtmlTagProg {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
	driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement rightClkBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		action.contextClick(rightClkBtn).build().perform();
		
		WebElement pastebutton =  driver.findElement(By.className("context-menu-icon-paste"));
		System.out.println(pastebutton.getText());
		//pastebutton.click();
		
		String xpathValue ="//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]";
		utilityOfRightClick(xpathValue,"Quit");
		}
	/**
	 * This Utility Method selects Right Click option when there is no Select html tag
	 * @param xpathCode
	 */
	
		public static void utilityOfRightClick(String xpathVal,String xpathCode)
		{						
			List<WebElement> rightClickPaste = driver.findElements(By.xpath(xpathVal));
			for(int i=0;i<rightClickPaste.size();i++) {
				String displayedValues=rightClickPaste.get(i).getText();
				System.out.println(displayedValues);
				if(displayedValues.equals(xpathCode))
				{
					rightClickPaste.get(i).click();
					break;
				}
			
		}
	}

}
