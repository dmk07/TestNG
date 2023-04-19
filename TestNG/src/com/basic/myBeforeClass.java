package com.basic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class myBeforeClass {

	@BeforeClass
	public void myBeforeClass()
	{
		System.out.print("beforeclass");
	}

	@Test
	public void myTest()
	{
		System.out.print("my test");
	}
	}


