package com.mt.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mt.pages.LoginPage;
import com.mt.utility.common;

public class LoginTest 
{
WebDriver driver;
	
//	@BeforeSuite
//	public void OpenBrowser()
//	{
//		System.out.println("Under Before Suit");
//		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Class\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		System.out.println("SuccessFully Open Browser");
//		System.out.println("In chrome = " +Thread.currentThread().getId());
//		
//	}
	@Test
	public void verifysign()
	{
//		driver.manage().window().maximize();
//		driver.get("http://newtours.demoaut.com/");
		
		WebDriver driver = common.openBrowser("gecko", "http://newtours.demoaut.com/");
		
		LoginPage log = PageFactory.initElements(driver, LoginPage.class);
		log.Logincheck("QQQQQ","qqqqq");
		log.Loginbuttonclick();
		
	}
}
