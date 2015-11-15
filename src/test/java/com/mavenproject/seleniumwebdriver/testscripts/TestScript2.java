package com.mavenproject.seleniumwebdriver.testscripts;


import org.testng.annotations.Test;

import com.mavenproject.seleniumwebdriver.testbase.TestBase;



public class TestScript2 extends TestBase {
	
	
	@Test
	public void test1(){
		
		driver.get("http://www.laterooms.com");
		
	}
	
	@Test
	public void test2(){
		
		driver.get("http://www.yatra.com");
		
	}

	
	@Test
	public void test3(){
		
		driver.get("https://wordpress.com/");
		
	}

}
