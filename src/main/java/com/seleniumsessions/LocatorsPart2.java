package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPart2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files (x86)\\\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("https://app.hubspot.com");
		 * 
		 * Thread.sleep(9000); //3.xpath:is extended path,it gives address of the
		 * element,it uses properties of element,it is not an attribute , //it is not a
		 * property of element,u can find after inspecting and copy the xpath by right
		 * click driver.findElement(By.xpath("//*[@id='username']")).sendKeys(
		 * "Ganesh@yahoo.com"); //driver.findElement(By.cssSelector(""))
		 * 
		 * //driver.findElement(By.xpath("//*[@id='password']")).sendKeys("hello123");
		 * driver.findElement(By.cssSelector("#password")).sendKeys("Test@123");;
		 * 
		 * Thread.sleep(6000);
		 * 
		 * //driver.findElement(By.xpath("//*[@id='loginBtn']")).click(); //4.css
		 * selector driver.findElement(By.cssSelector("#loginBtn")).click();
		 */
		
		//5.class name- it can be same to other webelements
		/*
		 * driver.get(
		 * "https://www.barnesandnoble.com/?st=SEM&sid=BNB_[ADL]+[Brand]+Barnes&Noble+(Exact)&sourceId=SEMGoBND&dpid=tdtve346c&2sid=Google_c&gclid=CjwKCAjw0tHoBRBhEiwAvP1GFRy5Z67xdxMuaY_7kQk0AmzRs8O0Ob689VqmYct_q-p3ScOZbK5pXxoCIUwQAvD_BwE"
		 * ); //bx-row bx-row-input bx-row-input-default bx-row-placeholder-top
		 * bx-row-IDe2EZN bx-element-982040-IDe2EZN Thread.sleep(9000);
		 * 
		 * driver.findElement(By.className("bx-row-input ")).sendKeys(
		 * "greeshmahere@gmail.com");
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.className("bx-button")).click();
		 */
		
		
	}

}
