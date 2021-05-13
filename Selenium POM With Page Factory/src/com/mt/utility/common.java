package com.mt.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class common 
{
 public static WebDriver driver;

public static WebDriver openBrowser(String browsername, String urlname)
{
if(browsername.equalsIgnoreCase("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Class\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
}
else
	{
	System.setProperty("webdriver.gecko.driver", "F:\\Testing\\Class\\Driver\\geckodriver.exe");
	driver =  new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(urlname);

	return driver;	
}
}
 