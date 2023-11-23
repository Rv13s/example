package Sgimain;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Locations.SgiWebLocations;
import Locations.fwpaths;
//import PageObjects.fwpaths;



public class fw {
    @SuppressWarnings("deprecation")
	@Test
    public static  void main(String[] args) throws InterruptedException {
	//public void fourwheeler() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         //driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        
        
        
        
        driver.get("http://uatwebsit.shriramgi.com/");
		
		PageFactory.initElements(driver, fwpaths.class);
		PageFactory.initElements(driver, SgiWebLocations.class);
//		
		/*
		WebElement home = driver.findElement(By.xpath("//div/a"));
		home.click();
		*/
		WebElement car = driver.findElement(By.id("iqz4e"));
		car.click();
		
		
	 Thread.sleep(2000);
      fwpaths.home.click();
		
		
       fwpaths.carinsurance.click();
		
       fwpaths.carRegNum.sendKeys("TN01hj7870");
		
       fwpaths.carMobNum.sendKeys("7010314200");
		
		
		//check box
		try {
			SgiWebLocations.car_checkbox.click();
				
		}
		catch (Exception e){
			System.out.println("catch    = " + e.getMessage());
			
		}
		

        SgiWebLocations.CarFormSubmit.click();
		
		
		
		/*
		// enter fields
		// carnum = driver.findElement(By.xpath("//*[@id=\'reg_number\']"));
		Thread.sleep(1000);
		fwpaths.carnum.sendKeys("TN18U3663");
	    
	    Thread.sleep(1000);
	    
	    // WebElement phono = driver.findElement(By.xpath("//*[@id=\'mobile_number\']"));
	    fwpaths.phono.sendKeys("7878787878");
	    
	    Thread.sleep(1000);
	    
	    // insure button----------------------------------------------------------------------------------------------------------------------
	    
	    fwpaths.insurebutton.sendKeys(Keys.ENTER);
	   */ 
	    // Enter OTP by find Element , need to done by find elements--------------------------------------------------------------------------
	    
	    Thread.sleep(2000);
	    
	    fwpaths.otp1.sendKeys("1");
	    fwpaths.otp2.sendKeys("1");
	    fwpaths.otp3.sendKeys("1");
	    fwpaths.otp4.sendKeys("1");
	    
	    //Submit otp--------------------------------------------------------------------------------------------------------------------------
	    fwpaths.otpbutton.click();
	       
	    // c_regNumber------------------------------------------------------------------------------------------------------------------------
	    Thread.sleep(1500);
	    
	    /* WebElement carregnum = driver.findElement(By.id("c_regNumber"));
	    
	    Thread.sleep(1500);
	    carregnum.clear();
	    carregnum.sendKeys("MH01kk5252"); 
	    
	    fwpaths.carregnum.click();
	    Thread.sleep(1500);
	    fwpaths.carregnum.clear();
	    fwpaths.carregnum.sendKeys("MH01kk5252"); */
	    try {
		    fwpaths.editbtn.click();
		    }
		    catch (Exception e){
				System.out.println("catch    = " + e.getMessage()); 
	    	
		    }
	    Thread.sleep(1500);
	    try {
	    	
	    	//new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission' and @ng-reflect-name='reportingDealPermission']"))).click();
	   
	    	
	    fwpaths.carregnum.click();
	    Thread.sleep(1500);
	    fwpaths.carregnum.clear();
	    fwpaths.carregnum.sendKeys("MH01KK5258");
	    }
	    catch(Exception e1) {
	    	System.out.println("Exception    =" + e1.getMessage());
	    }
	    
	    // Enter Model Details-----------------------------------------------------------------------------------------------------------------
	    
	    Thread.sleep(1000);
	    
	    //WebElement MakeName = driver.findElement(By.name("c_vd_MakeModel"));
	    
	    
	    
	    try {
	    
	    fwpaths.MakeName.click();
	    Thread.sleep(2500);
	    
	    //MakeName.clear(); 
	    
	    fwpaths.MakeName.clear();
	    
	    fwpaths.MakeName.sendKeys("MARUTI SUZUKI");
	    Thread.sleep(1000);
	    fwpaths.MakeName.sendKeys(Keys.ARROW_DOWN);	  
	    fwpaths.selectcar.click();
	    
	    Thread.sleep(2000);
	    }
	    catch(Exception e1) {
	    	System.out.println("CATCH =" + e1.getMessage());
	    	
	    }
	    
	    
	   
	    
	    //Enter Car Model-----------------------------------------------------------------------------------------------------------------------
	    
	    
	    fwpaths.ModelName.clear();
	    
	    fwpaths.ModelName.sendKeys("ALTO 800 VXI" + Keys.ENTER);
	    Thread.sleep(1000);
	    fwpaths.ModelName.sendKeys(Keys.ARROW_DOWN);
	    
	    
	    
	    fwpaths.selectmodel.click();
	    
	    //Enter Registration Date---------------------------------------------------------------------------------------------------------------
	    
	    fwpaths.registrationdate.clear();
	    
	    Thread.sleep(2000);
	    
	    fwpaths.registrationdate.sendKeys("22/12/2016" + Keys.ENTER);
	    fwpaths.registrationdate.sendKeys(Keys.TAB);
	    
	    // City of Registration-----------------------------------------------------------------------------------------------------------------
	  
	    Thread.sleep(1000);
	    fwpaths.city.sendKeys("MUMBAI");
	    Thread.sleep(1000);
	    fwpaths.city.sendKeys(Keys.ARROW_DOWN);
	    
	    fwpaths.selectcity.click();

	    
	  //*[@id='c_vd_Comprehensive']---------------------------------------------------------------------------------------------------------------
	    //WebElement insuretype = driver.findElement(By.xpath("//*[@id=\"c_ppType\"]/div[1]/div[1]/label"));
	    //insuretype.click();
	    
	    fwpaths.insuretype.click();
	  

	    // Previous policy expery date------------------------------------------------------------------------------------------------------------
	    
	    Thread.sleep(2000);
	 
	    fwpaths.pypolicy.clear();
	    fwpaths.pypolicy.sendKeys("30/12/2022");
	    fwpaths.pypolicy.sendKeys(Keys.TAB);
	    
	    
	    
	    Thread.sleep(2000);
	 
	    
	   fwpaths.customCarDetailsFormSubmit.click();
	    
	   Thread.sleep(6000);
	
	   
	   fwpaths.ElectricalAccesories.click();
	   
	   
	   Thread.sleep(1000);
	   
	   //ea_accessoriesName--------------------------------------------------------------------------------------------------------------------------
	   
	   
	   fwpaths.ea_accessoriesName.sendKeys("JBL" + Keys.TAB);
	   Thread.sleep(1000);
	   
	   //ea_accessoriesAmount
	   
	   fwpaths.ea_accessoriesAmount.sendKeys("10000");
	   
	   
	   Thread.sleep(1000);
	   
	   //electricalAccessoriesFormSubmit-------------------------------------------------------------------------------------------------------------
	   
	   
	   fwpaths.electricalAccessoriesFormSubmit.click();
	   
	   Thread.sleep(7000);
	   
	   //NonElectricalAccessories--------------------------------------------------------------------------------------------------------------------
	 
	   
	   fwpaths.NonElectricalAccessories.click();
	    
	   //non_ea_accessoriesName---------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.non_ea_accessoriesName.sendKeys("SEAT COVER" + Keys.TAB);
	   Thread.sleep(1000);
	   
	   //non_ea_accessoriesAmount--------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.non_ea_accessoriesAmount.sendKeys("10000" + Keys.TAB);
	   
	   Thread.sleep(1000);
	   
	   //non_electricalAccessoriesFormSubmit---------------------------------------------------------------------------------------------------------
	   
	   fwpaths.non_electricalAccessoriesFormSubmit.click();
	   
	   Thread.sleep(5000);
	   
	   //premiumDetailsFormSubmit--------------------------------------------------------------------------------------------------------------------
       fwpaths.premiumDetailsFormSubmit.click();	   
	   Thread.sleep(2000);
	   
	  //ow_name--------------------------------------------------------------------------------------------------------------------------------------
	   fwpaths.ow_name.sendKeys("John Wick");
	   
	   Thread.sleep(1000);
	   
	  //ow_email ------------------------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.ow_email.sendKeys("jhonwick@gmail.com");
	   Thread.sleep(1000);
	   
	  //ow_adLine1-----------------------------------------------------------------------------------------------------------------------------------
	   fwpaths.ow_adLine1.sendKeys("porur");
	   
	   
	   Thread.sleep(1000);
	   
	   //ow_pincode----------------------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.ow_pincode.sendKeys("600102");
	   
	   Thread.sleep(2000);
	   
	   //ow_nomineeName------------------------------------------------------------------------------------------------------------------------------
	  
	   fwpaths.ow_nomineeName.sendKeys("Kumar");
	   
	   Thread.sleep(1000);
	   
	   //ow_nomineeRel-------------------------------------------------------------------------------------------------------------------------------
	   

	   
	   fwpaths.ow_nomineeRel.click();
	   fwpaths.ow_nomineeRel.sendKeys("BRO");
	   Thread.sleep(1000);
	   fwpaths.ow_nomineeRel.sendKeys(Keys.ARROW_DOWN);
	   
	   fwpaths.bro.click();
	   
	   //ow_nomineeAge-------------------------------------------------------------------------------------------------------------------------------
	   
	   
	   fwpaths.ow_nomineeAge.sendKeys("22");
	   
	   //ownerFormSubmit-----------------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.ownerFormSubmit.click();
	   Thread.sleep(4000);
	   
	   //new_chassisNumber---------------------------------------------------------------------------------------------------------------------------
	   fwpaths.new_chassisNumber.sendKeys("JHGSV765TYFlF");
	   Thread.sleep(1000);
	   
	   //new_enginNumber----------------------------------------------------------------------------------------------------------------------------
	   
	   
	   fwpaths.new_enginNumber.sendKeys("961485HGlV");
	   
	   Thread.sleep(1000);
	   
	   //pp_Insurer----------------------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.pp_Insurer.sendKeys("THE NEW");
	   Thread.sleep(1000);
	   
	   fwpaths.pp_Insurer.sendKeys(Keys.ARROW_DOWN);
	   
	   
	   Thread.sleep(1000);
	   
	   //THE NEW INDIA ASSURANCE CO LTD---------------------------------------------------------------------------------------------------------------
	   
	   
	   fwpaths.Inscompany.click();
	   
	   Thread.sleep(1000);
	   
	  //pp_PolicyNumber ------------------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.pp_PolicyNumber.sendKeys("dh47654d5647l");
	   Thread.sleep(1000);
	   
	   //policyInfoFormSubmit-------------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.policyInfoFormSubmit.click();
	   
	   Thread.sleep(9000);
	   
	   //Checkbox-paynowForm
	   WebElement checkBoxElement = driver.findElement(By.id("paynowTerms"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(checkBoxElement).click().build().perform();
	   
	 
       //paynowFormSubmit
	   
	   
	   fwpaths.paynowFormSubmit.click();
	   
	  
	   Thread.sleep(6000);
	   
	   // paynowform------------------------------------------------------------------------------------------------------------------------------------
	   
	   fwpaths.netbank.click();
	   
	   //netBankingBank
	   
	   fwpaths.netBankingBank.click();
	   
	   Thread.sleep(1000);
	   
	   fwpaths.netBankingBank.sendKeys(Keys.ARROW_DOWN);
	   fwpaths.netBankingBank.click();
	 
	   Thread.sleep(2000);
	   
	   
	   
	   //SubmitBillShip
	   fwpaths.SubmitBillShip.click();
	   
	   ////*[@type='submit'][@value='Return To the Merchant Site']
	   
	   Thread.sleep(2000);
	  
	   fwpaths.returntomerchant.click();
	   
	   
	   
	   
	   /*
	   //Wallet
	   WebElement Wallet = driver.findElement(By.xpath(" //*[contains(text(),'Wallet')]"));
	   Wallet.click();
	   Thread.sleep(1000);
	   
	   //Airtel Money
	   
	   WebElement airtel = driver.findElement(By.xpath(" //*[contains(text(),'Airtel Money')]"));
	   airtel.click();
	   Thread.sleep(1000);
	   
	   //redesign-v15-cta
	   WebElement paybutton = driver.findElement(By.id("redesign-v15-cta"));
	   paybutton.click();
	   
	   //Pay Now
	   
	   
	   Thread.sleep(5000);
	   //Success
	   WebElement Success = driver.findElement(By.id("Success"));
	   Success.click();
	   Thread.sleep(3000);
	   
	   //proceed-button
	   WebElement proceed = driver.findElement(By.id("proceed-button"));
	   proceed.click();
	   Thread.sleep(2000);
	   
	   //policyUrl download
	   WebElement policyUrl = driver.findElement(By.id("policyUrl"));
	   policyUrl.click();
	   */
		
		
		
	}
}

