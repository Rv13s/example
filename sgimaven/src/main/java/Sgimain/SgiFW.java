package Sgimain;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Locations.SgiWebLocations;
import Locations.fwpaths;

public class SgiFW {

	@Test
	// public static void main(String[] args) {
	public void fourWheeler() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		PageFactory.initElements(driver, fwpaths.class);
		PageFactory.initElements(driver, SgiWebLocations.class);

		driver.manage().window().maximize();

		driver.get("http://uatweb.shriramgi.com/car-insurance");

		fwpaths.carRegNum.sendKeys("TN01AT0006");

		fwpaths.carMobNum.sendKeys("7000000002");

		// Thread.sleep(2000);
		// check box
		try {
			fwpaths.car_checkbox.click();

		} catch (Exception e) {
			System.out.println("catch    = " + e.getMessage());

		}

		fwpaths.insure_now_btn.click();

		fwpaths.otp1.sendKeys("1");
		fwpaths.otp2.sendKeys("1");
		fwpaths.otp3.sendKeys("1");
		fwpaths.otp4.sendKeys("1");

		fwpaths.otpbutton.click();

//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("c_regNumber")));
//
//        element.click();
//        
//        Thread.sleep(1500);
//		fwpaths.carregnum.clear();
//		fwpaths.carregnum.sendKeys("MH01KK5258");

		// Thread.sleep(1000);

		try {
			fwpaths.editbtn.click();
		} catch (Exception e) {
			System.out.println("catch    = " + e.getMessage());

		}
		
//         WebElement carregnum = driver.findElement(By.id("c_regNumber"));
//	    
//	    //Thread.sleep(1500);
//	    carregnum.clear();
//	    carregnum.sendKeys("MH01kk5253"); 
	    
	    
	   // fwpaths.MakeName.click();
	    //fwpaths.carregnum.click();
	   // Thread.sleep(1500);
	    //fwpaths.carregnum.clear();
	   // fwpaths.carregnum.sendKeys("MH01kk5252"); 
		// Thread.sleep(1500);

//		try {
//
//			fwpaths.carregnum.click();
//			Thread.sleep(1500);
//			fwpaths.carregnum.clear();
//			fwpaths.carregnum.sendKeys("MH01KK5258");
//		} catch (Exception e1) {
//			System.out.println("Exception    =" + e1.getMessage());
//		}
//
//		try {
//			fwpaths.editbtn.click();
//		} catch (Exception e) {
//			System.out.println("catch    = " + e.getMessage());
//
//		}

//		try {
//
//			// new WebDriverWait(getWebDriver(),
//			// 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission'
//			// and @ng-reflect-name='reportingDealPermission']"))).click();
//
//			fwpaths.carregnum.click();
//			Thread.sleep(1500);
//			fwpaths.carregnum.clear();
//			fwpaths.carregnum.sendKeys("MH01KK5258");
//		} catch (Exception e1) {
//			System.out.println("Exception    =" + e1.getMessage());
//		}

		// WebDriverWait wait1 = new WebDriverWait(driver, 10);
		// WebDriverWait wait1 = new WebDriverWait(driver, 10)

	    

		
		
		
		
//Thread.sleep(5000);
//	 //fwpaths.MakeName.click();
//	 //Thread.sleep(1500);
//WebElement element1 = driver.findElement(By.id("c_vd_MakeModel"));
//	 Actions actions1 = new Actions(driver);
//		actions1.moveToElement(element1).click().build().perform();
	 
	 
		// WebElement carmake = driver.findElement(By.id("c_vd_MakeModel")); )
		try {
			WebElement element = driver.findElement(By.id("c_vd_MakeModel"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			Thread.sleep(1500);
			// carmake.click();
			fwpaths.MakeName.clear();
			fwpaths.MakeName.sendKeys("MARUTI SUZUKI");
			Thread.sleep(1000);
			fwpaths.MakeName.sendKeys(Keys.ARROW_DOWN);
			fwpaths.MakeName.sendKeys(Keys.ENTER);
			fwpaths.MakeName.sendKeys(Keys.TAB);
		} catch (Exception e) {
			System.out.println("catch    =  make name" + e.getMessage());

		}
		

		Thread.sleep(2000);
		// WebElement MARUTI = driver.findElement(By.xpath(" //*[contains(text(),'MARUTI SUZUKI')]"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'MARUTI
		// SUZUKI')]")));

//		if(MARUTI.isEnabled()){
//			MARUTI.click();
//		 }
//		 else{
//		     System.out.println("Not Enabled");
//		 }

		//fwpaths.selectcar.click();

//		
//		

		Thread.sleep(1000);
		// Carmodel
		
		
		try {
			fwpaths.ModelName.clear();
		Thread.sleep(1000);

			fwpaths.ModelName.sendKeys("ALTO 800 VXI - PETROL"); // 
			Thread.sleep(1500);
			fwpaths.ModelName.sendKeys(Keys.ARROW_DOWN);
			
			fwpaths.ModelName.sendKeys(Keys.ENTER);
			fwpaths.ModelName.sendKeys(Keys.TAB);
		}
		
		
		catch (Exception e) {
			System.out.println("catch    = Model name" + e.getMessage());

		}
		
		Thread.sleep(2000);
		
		//fwpaths.selectmodel.click();
	//	Thread.sleep(1000);
		
		
		
		try {
			// Enter Registration
			fwpaths.registrationdate.clear();

			//Thread.sleep(1000);

			// Enter Registration
			// Date---------------------------------------------------------------------------------------------------------------

			WebElement registrationdate = driver.findElement(By.xpath("//*[@id='c_vd_RegistrationDate']/parent::*")); // *[@id='c_vd_RegistrationDate']/parent::*
			Thread.sleep(1000);
			registrationdate.click();

			// registrationdate.clear();

			// *[@class='ui-datepicker-title']/child::select[2]
			WebElement year = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']/child::select[2]"));
			Thread.sleep(1000);
			Select y = new Select(year);
			y.selectByVisibleText("2016");
			// year.click();

			// ui-datepicker-title
			WebElement month = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']/child::*")); // *[@id='c_vd_RegistrationDate']/parent::*
			Thread.sleep(1000);
			Select s = new Select(month);
			s.selectByVisibleText("May");
			Thread.sleep(1000);
			// month.click();

			WebElement date = driver.findElement(By.xpath("//a[text()='31']"));
			date.click();
		}catch (Exception e) {
			System.out.println("catch    = reg date " + e.getMessage());

		}
		
		
		try {
			// *[@id='c_vd_Comprehensive']-----------------------------------------------------------------------------------------------------------------

			WebElement insuretype = driver.findElement(By.xpath("//*[@id=\"c_ppType\"]/div[1]/div[1]/label"));
			insuretype.click();
			
		}catch (Exception e) {
			System.out.println("catch    =  insuretype " + e.getMessage());

		}

		

		Thread.sleep(1000);
		
		try {
			
			// Enter Registration
			// Date---------------------------------------------------------------------------------------------------------------

			WebElement prepolexpdate = driver.findElement(By.xpath("//*[@id=\"c_vd_comp_ppEpiryDate\"]/parent::*")); // *[@id='c_vd_RegistrationDate']/parent::*
			Thread.sleep(1000);
			prepolexpdate.click();

			WebElement ppyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']/child::select[2]"));
			Thread.sleep(1000);
			Select py = new Select(ppyear);
			py.selectByVisibleText("2023");

			// ui-datepicker-title
			WebElement ppmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']/child::*")); // *[@id='c_vd_RegistrationDate']/parent::*
			Thread.sleep(1000);
			Select ppm = new Select(ppmonth);
			ppm.selectByVisibleText("Dec");
			Thread.sleep(1000);

			WebElement ppdate = driver.findElement(By.xpath("//a[text()='13']"));
			ppdate.click();
			
		}
		catch (Exception e) {
			System.out.println("catch    =  policy exp date" + e.getMessage());

		}
		
		Thread.sleep(1000);
		
		
		
		try {
			js.executeScript("window.scrollBy(0,350)", "");

		}catch (Exception e) {
			System.out.println("catch    = scrollfunction " + e.getMessage());

		}
		
		Thread.sleep(3000);
		
		try {
			
			// customVehicleDetailsFormSubmit--------------------------------------------------------------------------------------------------------------
			WebElement customCarDetailsFormSubmit = driver.findElement(By.id("customCarDetailsFormSubmit"));
			customCarDetailsFormSubmit.click();
			
		}catch (Exception e) {
			System.out.println("catch    = customCarDetailsFormSubmit " + e.getMessage());

		}

		Thread.sleep(7000);

//		Thread.sleep(2000);
		
		//fwpaths.customCarDetailsFormSubmit.click();

		

		// *[contains(text(),'Electrical
		// Accessories')]--------------------------------------------------------------------------------------------------
		/*
		 * WebElement ElectricalAccesories =
		 * driver.findElement(By.xpath("//*[contains(text(),'Electrical Accessories')]")
		 * ); ElectricalAccesories.click();
		 */
/*
		fwpaths.ElectricalAccesories.click();

		Thread.sleep(1000);

		// ea_accessoriesName--------------------------------------------------------------------------------------------------------------------------

		fwpaths.ea_accessoriesName.sendKeys("JBL" + Keys.TAB);
		Thread.sleep(1000);

		// ea_accessoriesAmount

		fwpaths.ea_accessoriesAmount.sendKeys("10000");

		Thread.sleep(1000);

		// electricalAccessoriesFormSubmit-------------------------------------------------------------------------------------------------------------

		fwpaths.electricalAccessoriesFormSubmit.click();

		Thread.sleep(7000);

		// NonElectricalAccessories--------------------------------------------------------------------------------------------------------------------

		fwpaths.NonElectricalAccessories.click();

		// non_ea_accessoriesName---------------------------------------------------------------------------------------------------------------------

		fwpaths.non_ea_accessoriesName.sendKeys("SEAT COVER" + Keys.TAB);
		Thread.sleep(1000);

		// non_ea_accessoriesAmount--------------------------------------------------------------------------------------------------------------------

		fwpaths.non_ea_accessoriesAmount.sendKeys("10000" + Keys.TAB);

		Thread.sleep(1000);

		// non_electricalAccessoriesFormSubmit---------------------------------------------------------------------------------------------------------

		fwpaths.non_electricalAccessoriesFormSubmit.click();

		Thread.sleep(5000);
		
		*/
		
		try {

		// premiumDetailsFormSubmit--------------------------------------------------------------------------------------------------------------------
		fwpaths.premiumDetailsFormSubmit.click();
		Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("catch    = premiumDetailsFormSubmit " + e.getMessage());

		}
		
		try {

		// ow_name--------------------------------------------------------------------------------------------------------------------------------------
			fwpaths.ow_name.clear();
			fwpaths.ow_name.sendKeys("John Wick");
		
		
		}
		catch (Exception e) {
			System.out.println("catch    = ow_name " + e.getMessage());

		}

		Thread.sleep(1000);
		
		try {
		// ow_email
		// ------------------------------------------------------------------------------------------------------------------------------------
         
		fwpaths.ow_email.clear();
		
		fwpaths.ow_email.sendKeys("jhonwick@gmail.com");
		}catch (Exception e) {
			System.out.println("catch    = ow_email " + e.getMessage());

		}
		
		Thread.sleep(1000);
		
		try {
			
		// ow_adLine1-----------------------------------------------------------------------------------------------------------------------------------
		fwpaths.ow_adLine1.sendKeys("porur");
		}catch (Exception e) {
			System.out.println("catch    = ow_adLine1 " + e.getMessage());

		}

		Thread.sleep(1000);
			
		try {
		// ow_pincode----------------------------------------------------------------------------------------------------------------------------------

		fwpaths.ow_pincode.sendKeys("600102");
		}catch (Exception e) {
			System.out.println("catch    = ow_pincode " + e.getMessage());

		}

		Thread.sleep(2000);
		
		try {
		//pan verify
		
		fwpaths.panNum.sendKeys("QWERT1234Y" );
		//fwpaths.panNum.sendKeys(Keys.TAB);
		}catch (Exception e) {
			System.out.println("catch    = panNum " + e.getMessage());

		}
		
		Thread.sleep(2000);
		
		//try {
		//fwpaths.panDOB.click();
		//fwpaths.panDOB.clear();
		
		WebElement pandob = driver.findElement(By.xpath("//*[@id=\"document_dob\"]/parent::*")); // *[@id='c_vd_RegistrationDate']/parent::*
		Thread.sleep(1000);
		pandob.click();
		
		
		//pandob.clear();
		
		
		// *[@class='ui-datepicker-title']/child::select[2]
				WebElement panyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']/child::select[2]"));
				Thread.sleep(1000);
				Select doby = new Select(panyear);
				doby.selectByVisibleText("2003");
				// year.click();

				// ui-datepicker-title
				WebElement panmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']/child::*")); // *[@id='c_vd_RegistrationDate']/parent::*
				Thread.sleep(1000);
				Select dobm = new Select(panmonth);
				dobm.selectByVisibleText("May");
				Thread.sleep(1000);
				// month.click();

				WebElement dobdate = driver.findElement(By.xpath("//a[text()='31']"));
				dobdate.click();
//		}
//		catch (Exception e) {
//			System.out.println("catch    = panDOB  " + e.getMessage());
//
//		}
		
		
		

		// ow_nomineeName------------------------------------------------------------------------------------------------------------------------------

		fwpaths.ow_nomineeName.sendKeys("Kumar");
		//fwpaths.ow_nomineeName.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		// ow_nomineeRel-------------------------------------------------------------------------------------------------------------------------------
		WebElement ow_nomineeRel = driver.findElement(By.id("ow_nomineeRel"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ow_nomineeRel).click().build().perform();
		
		
		//fwpaths.ow_nomineeRel.click(); 
		fwpaths.ow_nomineeRel.sendKeys("BRO");
		Thread.sleep(1000);
		fwpaths.ow_nomineeRel.sendKeys(Keys.ARROW_DOWN);

		fwpaths.bro.click();

		// ow_nomineeAge-------------------------------------------------------------------------------------------------------------------------------

		fwpaths.ow_nomineeAge.sendKeys("22");

		// ownerFormSubmit-----------------------------------------------------------------------------------------------------------------------------

		fwpaths.carOwnerFormSubmit.click();
		Thread.sleep(4000);
		
		//ckycSuccessPopup_check
		fwpaths.ckycSuccessPopup_check.click();
		Thread.sleep(4000);
		
		

		// new_chassisNumber---------------------------------------------------------------------------------------------------------------------------
		fwpaths.new_chassisNumber.sendKeys("JHGSV765TYFlF");
		Thread.sleep(1000);

		// new_enginNumber----------------------------------------------------------------------------------------------------------------------------

		fwpaths.new_enginNumber.sendKeys("961485HGlV");

		Thread.sleep(1000);

		// pp_Insurer----------------------------------------------------------------------------------------------------------------------------------

		fwpaths.pp_Insurer.sendKeys("THE NEW");
		Thread.sleep(1000);

		fwpaths.pp_Insurer.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(1000);

		// THE NEW INDIA ASSURANCE CO
		// LTD---------------------------------------------------------------------------------------------------------------

		fwpaths.Inscompany.click();

		Thread.sleep(1000);

		// pp_PolicyNumber
		// ------------------------------------------------------------------------------------------------------------------------------

		fwpaths.pp_PolicyNumber.sendKeys("dh47654d5647l");
		Thread.sleep(1000);

		// policyInfoFormSubmit-------------------------------------------------------------------------------------------------------------------------

		fwpaths.carPolicyInfoFormSubmit.click();

		Thread.sleep(12000);

		// Checkbox-paynowForm
		WebElement checkBoxElement = driver.findElement(By.id("paynowTerms"));
		Actions paytermaction = new Actions(driver);
		paytermaction.moveToElement(checkBoxElement).click().build().perform();

		// paynowFormSubmit

		fwpaths.paynowFormSubmit.click();

		Thread.sleep(2000);
		
		// ccavenue
		
		fwpaths.ccAvenue.click();
		Thread.sleep(2000);
		 fwpaths.paymentproceed.click();	 	
		
		
		
		
		

		// paynowform------------------------------------------------------------------------------------------------------------------------------------

		fwpaths.netbank.click();

		// netBankingBank

		fwpaths.netBankingBank.click();

		Thread.sleep(1000);

		fwpaths.netBankingBank.sendKeys(Keys.ARROW_DOWN);
		fwpaths.netBankingBank.click();

		Thread.sleep(2000);

		// SubmitBillShip
		fwpaths.SubmitBillShip.click();

		//// *[@type='submit'][@value='Return To the Merchant Site']

		Thread.sleep(2000);

		fwpaths.returntomerchant.click();

		/*
		 * // Previous policy expery
		 * date-------------------------------------------------------------------------
		 * ------------------------------------
		 * 
		 * WebElement pypolicy = driver.findElement(By.id("c_vd_comp_ppEpiryDate"));
		 * Thread.sleep(2000); pypolicy.clear(); pypolicy.sendKeys("30/02/2023");
		 * pypolicy.sendKeys(Keys.TAB);
		 * 
		 * Thread.sleep(2000);
		 */

		/*
		 * WebElement tw16 = driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[7]")); // month
		 * december WebElement DEC = driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[10]")); //date 31
		 * WebElement Day01 = driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a"));
		 * 
		 * 
		 * 
		 * WebElement regdate = driver.findElement(By.id("c_vd_RegistrationDate"));
		 * Actions actions1 = new Actions(driver);
		 * actions1.moveToElement(regdate).click().build().perform();
		 * Thread.sleep(2000); //fwpaths.registrationdate.click(); //Thread.sleep(2000);
		 * 
		 * ///year WebElement year = driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")); year.click();
		 * Thread.sleep(1000); tw16.click();
		 * 
		 * 
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement month = driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")); DEC.click();
		 * Thread.sleep(2000); Day01.click();
		 * 
		 * //Enter Car
		 * Model------------------------------------------------------------------------
		 * -----------------------------------------------
		 * 
		 * 
		 * 
		 * try {
		 * 
		 * fwpaths.MakeName.click(); Thread.sleep(2500);
		 * 
		 * //MakeName.clear();
		 * 
		 * 
		 * 
		 * fwpaths.MakeName.sendKeys("MARUTI SUZUKI"); Thread.sleep(1000);
		 * fwpaths.MakeName.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * 
		 * Thread.sleep(2000); } catch(Exception e1) { System.out.println("CATCH =" +
		 * e1.getMessage());
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Date-------------------------------------------------------------------------
		 * --------------------------------------
		 * 
		 * 
		 * // City of
		 * Registration-----------------------------------------------------------------
		 * ------------------------------------------------
		 * 
		 * Thread.sleep(1000); fwpaths.city.sendKeys("MUMBAI"); Thread.sleep(1000);
		 * fwpaths.city.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * fwpaths.selectcity.click();
		 * 
		 * fwpaths.insuretype.click();
		 * 
		 * 
		 * // Previous policy expery
		 * date-------------------------------------------------------------------------
		 * -----------------------------------
		 * 
		 * Thread.sleep(2000);
		 * 
		 * fwpaths.pypolicy.clear(); fwpaths.pypolicy.sendKeys("30/12/2022");
		 * fwpaths.pypolicy.sendKeys(Keys.TAB);
		 * 
		 * 
		 * 
		 * Thread.sleep(2000);
		 * 
		 * 
		 * fwpaths.customVehicleDetailsFormSubmit.click();
		 * 
		 * 
		 * 
		 */

	}

}
