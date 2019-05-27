package com.capsulecrm.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeopleAndOrg {
	
	@FindBy(xpath="//a[@id='ember78']")
	private WebElement addPerson;
	
	WebDriver driver;
	public PeopleAndOrg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public NewPerson clickAddPerson()
	{
		addPerson.click();
		return new NewPerson(driver);
	}

}
