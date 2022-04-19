package com.home_setup1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium_SetUp1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("titu8321@gmail.com");
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1234567H");
	    driver.findElement(By.xpath("//*[@value='Submit']")).click();
	    
	    String expected ="Login Successfully";
	    
	    String actual= driver.findElement(By.xpath("//*[contains(text(),'Login Successfully')]")).getText();
	  
	    Assert.assertTrue(actual.contains(expected));
	    //Assert.assertTrue(actual.contains(expected), "The text did not match");
	    driver.findElement(By.xpath("//*[@href='reservation.php']")).click();

	   driver.findElement(By.xpath("//*[@value='oneway']")).click();
	   
	  // WebElement oneway=driver.findElement(By.xpath("//*[@value='oneway']"));
	   //oneway.click();
//	   
	   WebElement passCount=driver.findElement(By.xpath("//*[@name='passCount']"));
	   passCount.click();
	   Select passcount=new Select(passCount);
	   passcount.selectByIndex(1);
   
//	   WebElement fromPort=driver.findElement(By.xpath("//*[@name='passCount']"));
//	   fromPort.click();
//	   Select fromport=new Select(fromPort);
//	   fromport.selectByVisibleText("2");
	   
//	   WebElement fromPort=driver.findElement(By.xpath("//*[@name='passCount']"));
//	   fromPort.click();
//	   Select fromport=new Select(fromPort);
//	   fromport.selectByValue("3");
	   
	   WebElement fP=driver.findElement(By.xpath("//*[@name='fromPort']"));
	   fP.click();
	   Select fp1=new Select(fP);
	   fp1.selectByIndex(3);
	   
	   WebElement fm=driver.findElement(By.xpath("//*[@name='fromMonth']"));
	   fm.click();
	   Select fp2=new Select(fm);
	   fp2.selectByIndex(2);
	   
	   WebElement fd=driver.findElement(By.xpath("//*[@name='fromDay']"));
	   fP.click();
	   Select fd1=new Select(fd);
	   fd1.selectByIndex(29);
//	   
	   WebElement tp=driver.findElement(By.xpath("//*[@name='toPort']"));
	   fP.click();
	   Select tp1=new Select(tp);
	   tp1.selectByIndex(2);
//	   
	   WebElement fromPort=driver.findElement(By.xpath("//*[@value='Business']"));
	   fromPort.click();
//	   
	   WebElement al=driver.findElement(By.xpath("//*[@name='airline']"));
	   fP.click();
	   Select al1=new Select(al);
	   al1.selectByIndex(1);
//	   
	   WebElement ff=driver.findElement(By.xpath("//*[@name='findFlights']"));
	   ff.click();
	   
	   String expected1 ="4";
	   
	   String actual1= driver.findElement(By.xpath("//*[contains(text(),'4')]")).getText();
	   Assert.assertTrue(actual.contains(expected));
	   driver.quit();
	}  
}	    
	    


