package Sgimain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BaseOperations.BaseOperations;
import Locations.SgiWebLocations;

public class livebike {
	
	@AfterClass  
	 public void after_class()  
	 {  
	     System.out.println("testing finished");  
	 }
	
	
@Test	
public static  void main(String[] args) throws InterruptedException {
//	public void motorinsurance() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	PageFactory.initElements(driver, SgiWebLocations.class);
	PageFactory.initElements(driver, BaseOperations.class);
	
	//load url
	try {
		driver.get("http://uatwebsit.shriramgi.com");
			
	}
	catch (Exception e){
		System.out.println("catch    = " + e.getMessage());
		
	}
	
	
	SgiWebLocations.home.click();
	
	//Thread.sleep(2000);
	

	
	SgiWebLocations.bikeinsurance.click();
	//Thread.sleep(1000);
	SgiWebLocations.bikeRegNum.sendKeys("tn01y8888");
	//Thread.sleep(1000);
	SgiWebLocations.bikeMobNum.sendKeys("7010314203");
	
	
	//Thread.sleep(1000);
	
	//ivys2i checkox
	SgiWebLocations.bikecheckbox.click();
	//Thread.sleep(1000);
	//homBikeFormSubmit
	SgiWebLocations.homeBikeFormSubmit.click();
	//Thread.sleep(32000);
	

	

	/* otp 15 times
	for (int i = 0; i < 15; i++) {
        
        driver.findElement(By.xpath("//a[@href ='javascript:voif(0)']")).click();
        
        Thread.sleep(2000);
       
    }
	*/
	
	try {
		SgiWebLocations.bikeotp1.sendKeys("1");
		//Thread.sleep(1000);
		SgiWebLocations.bikeotp2.sendKeys("1");
		//Thread.sleep(1000);
		SgiWebLocations.bikeotp3.sendKeys("1");
		//Thread.sleep(1000);
		SgiWebLocations.bikeotp4.sendKeys("1");
		//Thread.sleep(1000);
		
	}
	catch(Exception e ) {
		System.out.println("otp error");
	}
	
	
	SgiWebLocations.bikeotpverifybtn.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}

