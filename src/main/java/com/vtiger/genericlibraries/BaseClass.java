package com.vtiger.genericlibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vtiger.Pompages.Home;
import com.vtiger.Pompages.Login;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseClass {
	/**
	 * it is used to open the application
	 */
	public WebDriver driver;
	public FileUtility file=new FileUtility();;
	public WebDriverUtilities utilities=new WebDriverUtilities();;
	
	
	@BeforeClass
	public void configBC() throws Throwable 
	{
		ChromeDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(file.getPropertyKeyValue("url"));
		}
	@BeforeMethod
	public void configBM() throws Throwable
	{
		String usn = file.getPropertyKeyValue("username");
		String pd = file.getPropertyKeyValue("password");
		Login l=new Login(driver);
		l.LogintoApp(usn, pd);
	}
	@AfterMethod
	public void configAM() throws Throwable {
		Home h=new Home(driver);
		Thread.sleep(2000);
		h.signout();
	}
	
	
	
	/**
	 * close the application
	 */
 	
	@AfterClass
    public void closeapp()
    {
 driver.quit();
}
}