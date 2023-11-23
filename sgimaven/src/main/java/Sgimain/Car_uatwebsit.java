package Sgimain;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BaseOperations.BaseOperations;
import Locations.SgiWebLocations;

public class Car_uatwebsit {
	
	@AfterClass
	 public void after_class()  
	 {  
	     System.out.println("testing finished");  
	 }
	@Test
	public static  void main(String[] args) throws InterruptedException {
//		public void motorinsurance() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.manage().window().maximize();
	   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load url
		try {
			driver.get("http://uatwebsit.shriramgi.com");
				
		}
		catch (Exception e){
			System.out.println("catch    = " + e.getMessage());
			
		}
	
	
	Thread.sleep(2000);
		SgiWebLocations.home.click();
		
		
		SgiWebLocations.carinsurance.click();
		
		SgiWebLocations.carRegNum.sendKeys("tn01y8888");
		
		SgiWebLocations.carMobNum.sendKeys("7010314203");
		
		
		
		
		
		//check box
				try {
					SgiWebLocations.car_checkbox.click();
						
				}
				catch (Exception e){
					System.out.println("catch    = " + e.getMessage());
					
				}
				
		
		SgiWebLocations.CarFormSubmit.click();
		

		

		/* otp 15 times
		for (int i = 0; i < 15; i++) {
	        
	        driver.findElement(By.xpath("//a[@href ='javascript:voif(0)']")).click();
	        
	        Thread.sleep(2000);
	       
	    }
		*/
		
		try {
			SgiWebLocations.carotp1.sendKeys("1");
		
			SgiWebLocations.carotp2.sendKeys("1");
			
			SgiWebLocations.carotp3.sendKeys("1");
			
			SgiWebLocations.carotp4.sendKeys("1");
			
			
		}
		catch(Exception e ) {
			System.out.println("otp error");
		}
		


		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
		
		
		
	
	}
}
