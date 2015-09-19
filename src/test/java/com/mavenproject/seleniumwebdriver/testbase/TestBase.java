package com.mavenproject.seleniumwebdriver.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase 
{

	public WebDriver driver;
	
	@BeforeClass
	public void init(){
		
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
	}
	

	
	
	@AfterClass
	public void teardown(){
	
		driver.close();
		driver.quit();
	}
	
	
	
}
