package com.capsulecrm.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	@FindBy(id="party:j_id325:0:phnDecorate:number")
	private WebElement phoneNo;
	

	@FindBy(id="party:j_id342:0:emlDecorate:nmbr")
	private WebElement email;
	
	@FindBy(id="party:j_id370:0:webDecorate:web")
	private WebElement website;
	
	@FindBy(id="party:save")
	private WebElement save;
	
	public NewPerson(WebDriver driver)
	{
		
	}
}
