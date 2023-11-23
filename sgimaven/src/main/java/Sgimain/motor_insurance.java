package Sgimain;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BaseOperations.BaseOperations;
import Locations.SgiWebLocations;

public class motor_insurance {
	
	@AfterClass  
	 public void after_class()  
	 {  
	     System.out.println("testing finished");  
	 }
	
	
@Test	
//public static  void main(String[] args) throws InterruptedException {
	public void motorinsurance() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.manage().window().maximize();
	
	PageFactory.initElements(driver, SgiWebLocations.class);
	PageFactory.initElements(driver, BaseOperations.class);
	
	//load url
	try {
		driver.get("http://uatweb.shriramgi.com");
			
	}
	catch (Exception e){
		System.out.println(e.getMessage());
		
	}
	
	
	
	Thread.sleep(1000);
	
	//click products
	try {
		SgiWebLocations.products.click();
		}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	//choose-motor-insurance
	
	try {
		SgiWebLocations.motorinsurance.click();
		
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	
	try {
		SgiWebLocations.motor_bike.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	try {
		SgiWebLocations.motor_car.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	//mouse scroll down
	
	//js.executeScript("arguments[0].scrollIntoView();", Element);
	js.executeScript("window.scrollBy(0,350)", "");
	
	Thread.sleep(1000);
	
	
	
//	js.executeScript("window.scrollBy(0,-250)", "");
//	
//	Thread.sleep(1000);
	
	//features-and-benifits 
	
	try {
		
		SgiWebLocations.motor_feature_and_benifits.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
//	
//	Thread.sleep(1000);
//	
//	js.executeScript("window.scrollBy(0,-250)", "");
	Thread.sleep(1000);
	     
	//types-of-motor-insurance
	
	try {
		
		SgiWebLocations.types_of_motorinsurance.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
	
	Thread.sleep(1000);
	
	//Motor_coverges
	
	try {
		SgiWebLocations.motorinsurance_coverages.click();
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
    Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(1000);
	
	//motor-inurance-coverplan
	try {
		SgiWebLocations.motorinsurance_compareplan.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
    Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(1000);
	
	//motorinsurance_premium_components
	try {
		SgiWebLocations.motorinsurance_premium_components.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(1000);
	
	
	//motorinsurnace_Buy_Renew
	try {
		SgiWebLocations.motorinsurnace_Buy_Renew.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,150)", "");
	Thread.sleep(1000);
	
	//motorinsurnace_claim_process
	try {
		SgiWebLocations.motorinsurnace_claim_process.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(1000);
	
	//motor_insurance_Terminologies
	try {
		SgiWebLocations.motorinsurnace_Terminologies.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(1000);
	
	
	//motorinsurnace_Policy_download
	try {
		SgiWebLocations.motorinsurnace_Policy_download.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(1000);
	
	
	//motorinsurnace_FAQs
	try {
		SgiWebLocations.motorinsurnace_FAQs.click();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
		
	}

}

