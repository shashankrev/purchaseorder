package com.vtiger.Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePurchaseOrder {
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttextfeild;
	
	@FindBy(xpath="//img[@title=\"Select\"]")
	private WebElement vendorlookup;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement vendorname;
	
	@FindBy(xpath="//img[@title=\"Products\"]")
	private WebElement productlookup;
	
	@FindBy(xpath="//a[@id='popup_product_52']")
	private WebElement productname;
	
	@FindBy(id="qty1")
	private WebElement qty;
	
	@FindBy(xpath="//input[@class=\"crmbutton small save\"]")
	private WebElement savebtn;
	
	public CreatePurchaseOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubjecttextfeild() {
		return subjecttextfeild;
	}

	public WebElement getVendorlookup() {
		return vendorlookup;
	}

	public WebElement getVendorname() {
		return vendorname;
	}

	public WebElement getProductlookup() {
		return productlookup;
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public void CreatePurchaseOrdermethod(String name) {
		subjecttextfeild.sendKeys(name);
		savebtn.click();
	}
	public void qty(String num) {
		qty.sendKeys(num);
		savebtn.click();
	}
	
	

}
