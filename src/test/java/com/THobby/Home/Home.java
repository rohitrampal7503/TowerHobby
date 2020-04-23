package com.THobby.Home;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.THobby.POM.HomePage;
import com.THobby.base.*;
import com.relevantcodes.extentreports.LogStatus;

public class Home extends THobbyBase
{

	@Test(dataProviderClass=THobbyBase.class,dataProvider="dp")
	public void TestCase1(Hashtable<String,String> data) throws IOException
	{
		launchBrowser();
		String s1=data.get("postcode");
		System.out.println(s1);
		HomePage home=new HomePage(driver);
		home.SignInClick();
		
		captureScreenshot();
	  // Assert.fail();
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("PASS");
		log.info("Send Test");
		test.log(LogStatus.PASS, "VP1 PASS");
	}
}
