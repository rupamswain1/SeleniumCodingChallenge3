package com.capsulecrm.WebPages;

import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capsulecrm.Utils.ExplicitWait;

public class NewPerson {

	@FindBy(xpath="//select[@name='party:j_id108:j_id116']")
	private WebElement title;
	
	@FindBy(id="party:fnDecorate:fn")
	private WebElement FirstName;
	
	@FindBy(id="party:lnDecorate:ln")
	private WebElement LastName;
	
	@FindBy(id="party:roleDecorate:jobTitle")
	private WebElement jobTitle;
	
	@FindBy(id="party:orgDecorate:org")
	private WebElement organisation;
	
	@FindBy(id="party:tagsDecorate:tagComboBox")
	private WebElement tags;
	
	@FindBy(id="party:tagsDecorate:j_id187")
	private WebElement addTags;
	
	@FindBy(xpath="//li[@id='tagItem']")
	private WebElement tagItem;
	
	@FindBy(id="party:j_id325:0:phnDecorate:number")
	private WebElement phoneNo;
	

	@FindBy(id="party:j_id342:0:emlDecorate:nmbr")
	private WebElement email;
	
	@FindBy(id="party:j_id370:0:webDecorate:web")
	private WebElement website;
	
	@FindBy(id="party:save")
	private WebElement save;
	
	public Logger log=Logger.getLogger(NewPerson.class);
	private WebDriver driver;
	public NewPerson(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Adds a new person, input is taken from Excel sheet.
	public AddedPerson fillAndSubmitPerson(Map<String, String> person)
	{
		log.debug("Adding new person");
		Select select=new Select(title);
		select.selectByValue(person.get("TITLE"));
		FirstName.sendKeys(person.get("FIRST NAME"));
		LastName.sendKeys(person.get("LAST NAME"));
		jobTitle.sendKeys(person.get("JOB TITLE"));
		organisation.sendKeys(person.get("ORGANISATION"));
		tags.sendKeys(person.get("TAGS"));
		addTags.click();
		ExplicitWait.waitTillClickable(phoneNo, this.driver);
		phoneNo.click();
		phoneNo.sendKeys(person.get("PHONE NUMBER"));
		
		email.sendKeys(person.get("EMAIL ADDRESS"));
		website.sendKeys(person.get("WEBSITES"));
		save.click();
		return new AddedPerson(driver);
	}
}
