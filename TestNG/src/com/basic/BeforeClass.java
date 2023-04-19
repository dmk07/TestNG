package com.basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class BeforeClass {

	@Test
	public void testcase()
	{
		System.out.print("Test cae");
	}
	
	@AfterClass
	public void m3()
	{
		System.out.print("Test cae");
	}

	
	@BeforeMethod
	public void hello()
	{
		System.out.print("hello");
	}
	
	@AfterMethod
	public void m1()
	{
		System.out.print("Test cae");
	}

	@BeforeTest
	public void bt()
	{
		System.out.print("Test cae");
	}
	@AfterTest
	public void m2()
	{
		System.out.print("Test cae");
	}

}
