package com.mt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{
public WebDriver driver;

public LoginPage(WebDriver driver)
{
this.driver=driver;	
}
//Page factory Way
@FindBy(name= "userName")
WebElement username;

//Dynamic way
@FindBy(how = How.NAME,using = "password")
@CacheLookup
WebElement pass;

//Dynamic way
@FindBy(how = How.NAME,using = "login")
@CacheLookup
WebElement submitbutton;

//public void Logincheck()
//{
//	username.sendKeys("QQQQQ");
//	pass.sendKeys("qqqqq");
//}
public void Logincheck(String user, String passs)
{
	username.sendKeys(user);
	pass.sendKeys(passs);
}
public void Loginbuttonclick()
{
	submitbutton.click();
}

}
