package com.vtiger.Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrder {
	public WebDriver driver;
	@FindBy(xpath="//img[@title=\"Create Purchase Order...\"]")
	private WebElement createbtn;
	
    public PurchaseOrder (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreatebtn() {
		
		return createbtn;
	}
    
	
}
