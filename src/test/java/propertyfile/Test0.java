package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
	      Properties p=new Properties(); 
	      p.load(new FileInputStream("./src/test/resources/data.properties"));
		driver.get(p.getProperty("url"));
		driver.findElement(By.name("user_name")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("submitButton")).click(); 
		WebElement ele = driver.findElement(By.xpath("//a[text()='More']"));
		Actions a=new Actions(driver);
		a.click(ele).perform();
		driver.findElement(By.xpath("//a[@name=\"Purchase Order\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Purchase Order...\"]")).click();
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("GVS");
		driver.findElement(By.xpath("//img[@title=\"Select\"]")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			 driver.switchTo().window(b);
		}
		
		driver.findElement(By.xpath("//a[@id='1']")).click();
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//img[@title=\"Products\"]")).click();
		String parent1 = driver.getWindowHandle();
		Set<String> child1= driver.getWindowHandles();
		for(String c:child1) {
			 driver.switchTo().window(c);
		}
		driver.findElement(By.name("selected_id")).click();
		driver.findElement(By.xpath("//a[@id='popup_product_52']")).click();
		driver.switchTo().window(parent1);
		driver.findElement(By.id("qty1")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		Thread.sleep(2000);
	
		
//		driver.close();
	
	}

	
}
