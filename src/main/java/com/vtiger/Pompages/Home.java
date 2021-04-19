package com.vtiger.Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement More;
	
	
	@FindBy(xpath="//a[@name=\"Purchase Order\"]")
	private WebElement PurchaseOrder;
  
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getMore() {
		return More;
	}

	public WebElement getPurchaseOrder() {
		return PurchaseOrder;
	}

	public WebElement getSignout() {
		return signout;
	}
    
	public void signout() {
		signout.click();
	
		
	}
	
	
	
	
	
}
