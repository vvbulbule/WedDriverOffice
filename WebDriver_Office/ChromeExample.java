//package com.easy;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeExample {
	
 
 //public static WebDriver driver;
 
	public static void main(String []args) {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/MY Selenium Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
	}
}