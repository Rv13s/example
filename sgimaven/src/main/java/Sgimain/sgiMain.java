package Sgimain;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseOperations.BaseOperations;
import Locations.SgiWebLocations;

//import PageObjects.fwpaths;

public class sgiMain {
@Test
    
public static  void main(String[] args) throws InterruptedException {
	//public void sgiHome() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	
		
	
	PageFactory.initElements(driver, SgiWebLocations.class);
	PageFactory.initElements(driver, BaseOperations.class);
	Thread.sleep(2000);
	
	
	
	// check list 
	//sitemap
	try {
		driver.get("http://uatweb.shriramgi.com/sitemap");
			
	}
	catch (Exception e){
		System.out.println(e.getMessage());
		
	}
	
	Thread.sleep(2000);
	
	try {
		driver.get("http://uatweb.shriramgi.com/sitemap.xml");
	}
	catch (Exception e ) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(2000);
	
	// app.online pay
	try {
		driver.get("http://uatweb.shriramgi.com/insurance-online.html?name=quick");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	Thread.sleep(2000);
	
	
	
	//driver.navigate().back(); 
	
	//download
	driver.get("http://uatweb.shriramgi.com/");
	Thread.sleep(1000);
//	SgiWebLocations.bikeinsurance.click();
//	Thread.sleep(1000);
	//resources 
	
	SgiWebLocations.resources.click();
	Thread.sleep(1000);
	
	List<WebElement> listOfElements=driver.findElements(By.xpath(".//*[@class='sub_Menu resource-gap']//ul/li[2]/a"));
	               //*[@id="headerNav"]/div/div/div[2]/ul/li[3]/span
	
	
	for (WebElement webElement : listOfElements) {
		if(webElement.getText().trim().equals("downloads")) {
			webElement.click();
			break;
		}
		
	} 
	
	SgiWebLocations.downloads.click();
	Thread.sleep(2000);
	String parent = driver.getWindowHandle();
	SgiWebLocations.dischargevoucher.click();
	Thread.sleep(3000);

	//driver.get("http://uatweb.shriramgi.com/");
	
	//SgiWebLocations.home.click();
	
	
	//SgiWebLocations.bikeinsurance.click();
	
	//SgiWebLocations.carinsurance.click();
	for(String child : driver.getWindowHandles()) {
		driver.switchTo().window(child);
	}
	Thread.sleep(3000);
	driver.close();
	driver.switchTo().window(parent);
	System.out.println("Title : " + driver.getTitle());
	
	//go to home page
	Thread.sleep(2000);
    SgiWebLocations.home.click();
	
	
	//car insurance click
    
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	}
	
}	

