package com.mavenproject.seleniumwebdriver.testscripts;


import org.testng.annotations.Test;

import com.mavenproject.seleniumwebdriver.testbase.TestBase;



public class TestScript1 extends TestBase {
	
	
	@Test
	public void test1(){
		
		driver.get("http://www.google.com");
		
	}
	
	@Test
	public void test2(){
		
		driver.get("http://www.bing.com");
		
	}

	@Test
	public void test3(){
		
		driver.get("http://www.twitter.com");
		
	}

	@Test
	public void test4(){
		
		driver.get("http://www.aol.com");
		
	}
	
}
