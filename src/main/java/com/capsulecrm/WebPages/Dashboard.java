package com.capsulecrm.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	WebDriver driver;
	
	@FindBy(xpath="//a[@aria-label='People & Organisations']")
	private WebElement peopleNOrg;
	
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public PeopleAndOrg navigateToPeopleNorg()
	{
		peopleNOrg.click();
		return new PeopleAndOrg(driver);
	}
}
