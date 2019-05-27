package com.capsulecrm.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.capsulecrm.Browser.WebDrivers;
import com.capsulecrm.Report.ExtentReport;
import com.capsulecrm.WebPages.LoginPage;



public class SetupAndTear {
	
	@Test
	public void setup()
	{
		 ExtentReport.initialize();
		  
		 ExtentReport.logger= ExtentReport.report.startTest("Selenium coding challenge 3");
		WebDriver driver=new WebDrivers().InitializeWebDrivers();
		new LoginPage(driver).login();
	}

}
