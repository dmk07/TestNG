package com.basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstScript {
	static {
		// Dipak
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok

	}
	WebDriver driver = new EdgeDriver();

	@Test
	public void hello() {
		System.out.print("hello testng");				

		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");

	}
}
