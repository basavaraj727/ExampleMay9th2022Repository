package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	//webElement for login page username text field
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	// webElement for login page password text field 
	private WebElement pwd;
	public WebElement getPwd() {
		return pwd;
	}
	
	//WebElement for login page login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getoLogin() {
		return oLogin;
	}
	
	//WebElement for Home page Flyout Window
	private WebElement gettingStartedShortcutsPanelId;

	public WebElement getGettingStartedShortcutsPanelId() {
		return gettingStartedShortcutsPanelId;
	}
	//WebElement for create user
	@FindBy(xpath="//*[@id=\\'topnav\\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement createuserlist;
	public WebElement getCreateuserlist() {
		return createuserlist;
	}
	
	
	//webElement for Add user
	@FindBy(xpath="//*[@id=\\'createUserDiv\\']/div")
	private WebElement Adduser;
	public WebElement getAdduser() {
		return Adduser;
	}
	
	
	
	//WebElement for Home page Logout link
	@FindBy(xpath="//*[@id=\"logoutLink\"]")
	private WebElement oLogout;
	public WebElement getoLogout() {
		return oLogout;
	}
	
}
