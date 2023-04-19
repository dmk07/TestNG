package com.basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class AllAnnotation {

	@BeforeClass
	public void beforeClass()	
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()	
	{
		System.out.println("before method");
	}
	
	@BeforeTest
	public void BeforeTest()	
	{
		System.out.println("before Test");
	}
	@Test
	public void Test()	
	{
		System.out.println("Test");
	}
	
	@AfterClass
	public void afterClass()	
	{
		System.out.println("after class");
	}
	
	@AfterTest
	public void afterTest()	
	{
		System.out.println("after Test");
	}
	
	@AfterMethod
	public void afterMethod()	
	{
		System.out.println("after method");
	}
	
	

}
