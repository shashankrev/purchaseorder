package com.vtiger.Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author shashank 
 *
 */

public class Login {
	@FindBy(xpath="//input[@name=\"user_name\"]")
	private WebElement un;
	
	@FindBy(xpath="//input[@name=\"user_password\"]")
	private WebElement pwd;
	
	
	@FindBy(id="submitButton")
	private WebElement login;
	

	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void LogintoApp(String username, String password) {
		un.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
	}
	
}