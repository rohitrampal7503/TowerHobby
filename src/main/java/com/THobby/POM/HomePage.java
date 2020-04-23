package com.THobby.POM;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.THobby.base.THobbyBase;

public class HomePage 
{
	WebDriver driver;
	public static final Logger log = Logger.getLogger(THobbyBase.class.getName());
	
	 public HomePage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
 
	 By SignInLink=By.id("SignInLink");
	 
	 public void SignInClick() 
	 {
		 driver.findElement(SignInLink).click();
		 log.info("Sign In Clicked");
	 }
 
}
