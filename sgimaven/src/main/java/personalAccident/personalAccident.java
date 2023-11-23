package personalAccident;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseOperations.BaseOperations;
import Locations.SgiWebLocations;
import Sgimain.sgiMain;

public class personalAccident {
	
	@Test
	public static  void main(String[] args) throws InterruptedException {
	//public void pa() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, SgiWebLocations.class);
		PageFactory.initElements(driver, BaseOperations.class);
		
		
		//homepage
		try {
			driver.get("http://uatwebsit.shriramgi.com");
				
		}
		catch (Exception e){
			System.out.println("catch    = " + e.getMessage());
			
		}
		
		
		SgiWebLocations.home.click();
		
		//Thread.sleep(2000);
		
		SgiWebLocations.personalAccidant.click();
		
		
		SgiWebLocations.paNAme.click();
		SgiWebLocations.paNAme.sendKeys("Ruged");
		
		SgiWebLocations.paMob.click();
		SgiWebLocations.paMob.sendKeys("9999999990");
		
		SgiWebLocations.paCheckbox.click();
		
		SgiWebLocations.homePAFormSubmit.click();
		
		
//		WebElement paotp =  driver.findElement(By.id("otpid"));
//		paotp.sendKeys("1111");
//		
//		List<WebElement> PAOTP = driver.findElements(By.id("otpid"));
//		
//		PAOTP.
		
		//Thread.sleep(2000);
		
		SgiWebLocations.opt1.sendKeys("1");
		
		SgiWebLocations.opt2.sendKeys("1");
		
		SgiWebLocations.opt3.sendKeys("1");
		
		SgiWebLocations.opt4.sendKeys("1");
		
		
		//Thread.sleep(1000);
		SgiWebLocations.paVerifyOtp.click();
		
		//Thread.sleep(1000);
		//SgiWebLocations.paEmail.clear();
		
		
		
		try {
			SgiWebLocations.paEmail.sendKeys("ruged@test.com");
		}
		catch (Exception e) {
			System.out.println("catch    = " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		

		
		//-------------------------------------------------------------------------------------------------------------------------------------------
		
		// DATE OF REGISTRATION
		
		

		try {
			
			SgiWebLocations.paDob.click();
		}
		catch (Exception e) {
			System.out.println("catch    = " + e.getMessage());
		}
		
		
		
		
		
		
		
//		WebElement Dateofreg = driver.findElement(By.xpath("//label[text() ='Date of Registration']"));
//
//		Dateofreg.click();

		Thread.sleep(1000);

		// year
		
		
        try {
			
	WebElement year = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));

	//Thread.sleep(1500);

	Select year1 = new Select(year);

	year1.selectByVisibleText("1998");

	//Thread.sleep(1000);

	// date

	WebElement caldate = driver.findElement(By.xpath("//a[text()='10']"));

	caldate.click();
	
		}
		catch (Exception e) {
			System.out.println("catch    = " + e.getMessage());
		}
		

		
		
		//-------------------------------------------------------------------------------------------------------------------------------------------
	
		//Thread.sleep(1000);

        try {
			
			SgiWebLocations.paInsurenow.click();
		}
		catch (Exception e) {
			System.out.println("catch    = " + e.getMessage());
		}
		//SgiWebLocations.paInsurenow.click();
		
		
		//SgiWebLocations.paOccupation.click();
       try {
			
    	   SgiWebLocations.paOccupation.clear();
		}
		catch (Exception e) {
			System.out.println("catch    = " + e.getMessage());
		}


        
		//Thread.sleep(1000);
		
		
		
		try {
			
			SgiWebLocations.paOccupation.click();
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
		Thread.sleep(1000);
		
        try {
			
	        SgiWebLocations.paOccupation.sendKeys(Keys.ARROW_DOWN);
	        SgiWebLocations.paOccupation.sendKeys(Keys.ENTER);
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
		
        try {
			
        	SgiWebLocations.paBusniessPerson.click();
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
        try {
			
        	SgiWebLocations.pascreen2Conntinue.click();
        	
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
        
        
 WebElement Wb= driver.findElement(By.id("address1"));
        
        //To Check that text box is empty or not
        String paAddress1 =Wb.getAttribute("value");
        if(paAddress1.isEmpty())
        {
               System.out.println(" Yes Text box is clear");
               SgiWebLocations.paAddress1.sendKeys("Porur");
        }
        else
        {
               System.out.println("No Text box is not clear");
        }
        
        
        
        
//        try {
//			
//        	
//        	SgiWebLocations.paAddress1.sendKeys("porur");
//        	
//			}
//			catch (Exception e) {
//				System.out.println("catch    = " + e.getMessage());
//			}
		
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        try {
			
        	SgiWebLocations.paAddress2.sendKeys("Mangadu");
        	
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
        try {
			
        	SgiWebLocations.paArea.sendKeys("pattur");
        	
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
        try {
			
        	SgiWebLocations.paStreet.sendKeys("Walaja Street");
        	
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
        try {
			
        	SgiWebLocations.papincode.sendKeys("600101");
        	
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
        try {
			
        	SgiWebLocations.papincode.sendKeys("Ruged brother");
        	
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
        
        
		
       try {
			
    	   SgiWebLocations.panominee_age.sendKeys("22");
        	
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
	
       
		
		//SgiWebLocations.panominee_relation.sendKeys("22");
		
       try {
			
    	   SgiWebLocations.panominee_age.click();
        	
			}
			catch (Exception e) {
				System.out.println("catch    = " + e.getMessage());
			}
		
       
       //pa nominee relation
       
		try {
			SgiWebLocations.panominee_relation.click();
			Thread.sleep(1000);
			SgiWebLocations.panominee_relation.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			SgiWebLocations.panominee_relation.sendKeys(Keys.ENTER);
			
			
		}
		
		catch(Exception e) {
			System.out.println("catch    = " +  e.getMessage());
		}
		
		// pa pan no
		
		try {
			SgiWebLocations.papan_no.click();
			SgiWebLocations.papan_no.clear();
			
			SgiWebLocations.papan_no.sendKeys("DVUPR0538D");
			
			
			
		}
		
		catch(Exception e) {
			System.out.println("catch    = " +  e.getMessage());
		}
		
		
		//pa pandob
		try {
			
			SgiWebLocations.papan_dob.click();
			
			SgiWebLocations.papan_dob.clear();
			WebElement year = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));

			Thread.sleep(1500);

			Select year1 = new Select(year);

			year1.selectByVisibleText("1998");

			Thread.sleep(1000);

			// date

			WebElement caldate = driver.findElement(By.xpath("//a[text()='10']"));

			caldate.click();
			
				}
				catch (Exception e) {
					System.out.println("catch    = " + e.getMessage());
				}
		
		
		//papan_name
		try {
			
	    	   SgiWebLocations.papan_name.click();
	    	   
	    	   
	    	   SgiWebLocations.papan_name.sendKeys("Ruged");
	        	
				}
				catch (Exception e) {
					System.out.println("catch    = " + e.getMessage());
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
