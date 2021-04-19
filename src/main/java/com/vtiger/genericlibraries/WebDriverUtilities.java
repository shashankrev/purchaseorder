package com.vtiger.genericlibraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *  contains Webdriver specific reusable utility
 * @author shashank
 *
 */
public class WebDriverUtilities{

/**
 * 
 * @param driver
 */
	public void waitForPageToLoad(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/**
	 *  used to wait for expected element visibility in GUI
	 * @param driver
	 * @param element
	 */
	public void waitForElemnetVisibality(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	/**
	 *  used to switch to another browser window based on browser partial / complete title
	 * @param driver
	 * @param browserTitle
	 */
	public void switchToBrowser(WebDriver driver,String browserTitle) {
		 Set<String> set = driver.getWindowHandles();
		  
		  for(String act : set) {
			  driver.switchTo().window(act);
			  String actPageTile = driver.getTitle();
			  if(actPageTile.contains(browserTitle)) {
				  break;
			  }
		  }
	}
	
	/**
	 * used to take mouse cursor on expected element on the browser
	 * @param driver
	 * @param element
	 */
	public void moveToExpectedElemnet(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	

	
}
