package com.capsulecrm.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsulecrm.ReadProperty.ReadPropertyFile;

public class LoginPage {

	@FindBy(xpath="//input[@id='login:usernameDecorate:username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='login:passwordDecorate:password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login:login']")
	private WebElement loginButton;
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Dashboard login()
	{
		userName.sendKeys(ReadPropertyFile.get("username"));
		System.out.println(ReadPropertyFile.get("password"));
		password.sendKeys(ReadPropertyFile.get("password"));
		loginButton.click();
		return new Dashboard(driver);
	}
	
}
