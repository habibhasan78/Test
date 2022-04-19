package com.home_setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_SetUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@name=\"txtUsername\"]")).sendKeys("Admin");
	    
	    driver.findElement(By.xpath("//*[@name=\"txtPassword\"]")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@name='Submit']")).click();
	}

}
