
package Locations;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Factory;

public class fwpaths {
	
	//https://stage.shriramgi.com/car-insurance
	////button[@type='submit' and contains(@class,'gisendotp')]
	@FindBy(xpath="//button[@type='submit' and contains(@class,'gisendotp')]")
	public static WebElement car_insurenowBtn;
	
	
	//button#OtherOptionCkyc ckyc model fail
	@FindBy(css = "button#OtherOptionCkyc")
	public static WebElement ckyc_other_Option;
	
	//input#n_YearOfManifacture
	@FindBy(css = "input#n_YearOfManifacture")
	public static WebElement yearOfManuf;
	
	
	
	
	
	//========================================================
	
	//shriramgilogo
		@FindBy(xpath="//div/a")
		public static WebElement home;
		
		//carinsurance home page
		
		@FindBy(xpath="//span[text()='Car']")
		public static WebElement carinsurance;
		
		//carRegNum //input[@placeholder='Car Registration Number*']
		@FindBy(xpath="//input[@placeholder='Car Registration Number*']")
		public static WebElement carRegNum;
		
		//carMobNum //*[@id='mobile_number']
		@FindBy(name="mobile_number")
		public static WebElement carMobNum;
		
		//car_homecheckbox
		@FindBy(xpath="//*[@id=\"ippqgh\"]")  ////*[@id="ippqgh"] //*[@id="ippqgh"]
		public static WebElement car_checkoxb;
		
		//car_checkbox imb7p
		@FindBy(xpath="//*[@id=\"imb7p\"]")  
		public static WebElement car_checkbox;
		
		//car_homeCarFormSubmit
		@FindBy(id="homeCarFormSubmit")
		public static WebElement CarFormSubmit;
		
		//car_pro_CarFormSubmit
				@FindBy(id="carRegFormSubmit")
				public static WebElement insure_now_btn;
		
		// edit buton
		@FindBy(xpath="//*[@id=\"vehicleDetailsPreview\"]/div/div[2]/div[1]/div[2]")
		public static WebElement editbtn;

	//enter fields
	@FindBy(id="reg_number")
	public static WebElement carnum;
	
	//phone number
	@FindBy(id="mobile_number")
	public static WebElement phono;

	//insurebutton
	@FindBy(id="gisendotp")
	public static WebElement insurebutton;
	//otp1
	
	@FindBy(id="otp1")
	public static WebElement otp1;
	
	//otp2
	@FindBy(id="otp2")
	public static WebElement otp2;
	
	//otp3
	@FindBy(id="otp3")
	public static WebElement otp3;	
	//otp4
	@FindBy(id="otp4")
	public static WebElement otp4;	
	
	//otpbutton
	@FindBy(id="verifyotpCar")
	public static WebElement otpbutton;
	
	//carregnum 
	@FindBy(id="c_regNumber")
	public static WebElement carregnum;
	
	//MakeName 
	@FindBy(name="c_vd_MakeModel")
	public static WebElement MakeName;
	
	//selectcar 
	@FindBy(xpath="//*[contains(text(),'MARUTI SUZUKI')]")
	public static WebElement selectcar;
	
	//ModelName = driver.findElement(By.name("c_vd_Variant"));
	@FindBy(name="c_vd_Variant")
	public static WebElement ModelName;
	
	//selectmodel
	//@FindBy(xpath="//*[contains(text(),'ALTO 800 VXI - 126')]")
	@FindBy(xpath="//*[contains(text(),'ALTO 800 VXI - PETROL')]")
	public static WebElement selectmodel;
	
	//registrationdate 
	@FindBy(id="c_vd_RegistrationDate")
	public static WebElement registrationdate;
	
	//city 
	@FindBy(id="c_vd_CityOfRegistration")
	public static WebElement city;
	
	//selectcity = driver.findElement(By.xpath(" //*[contains(text(),'MUMBAI CENTRAL - MH-01')]"));
	@FindBy(xpath="//*[contains(text(),'MUMBAI CENTRAL - MH-01')]")
	public static WebElement selectcity;
	
	//insuretype = driver.findElement(By.xpath("//*[@id=\"c_ppType\"]/div[1]/div[1]/label"));
	@FindBy(xpath="//*[@id=\"c_ppType\"]/div[1]/div[1]/label")
	public static WebElement insuretype;
	
	//pypolicy = driver.findElement(By.id("c_vd_comp_ppEpiryDate"));
	@FindBy(id="c_vd_comp_ppEpiryDate")
	public static WebElement pypolicy;
	
	//customVehicleDetailsFormSubmit = driver.findElement(By.id("customVehicleDetailsFormSubmit"));
	@FindBy(id="customVehicleDetailsFormSubmit")
	public static WebElement customCarDetailsFormSubmit; //customCarDetailsFormSubmit
	
	//ElectricalAccesories = driver.findElement(By.xpath("//*[contains(text(),'Electrical Accessories')]"));
	@FindBy(xpath="//*[contains(text(),'Electrical Accessories')]")
	public static WebElement ElectricalAccesories;
	
	//ea_accessoriesName = driver.findElement(By.id("ea_accessoriesName"));\
	@FindBy(id="ea_accessoriesName")
	public static WebElement ea_accessoriesName;
	
	//ea_accessoriesAmount = driver.findElement(By.id("ea_accessoriesAmount"));
	@FindBy(id="ea_accessoriesAmount")
	public static WebElement ea_accessoriesAmount;
	
	//electricalAccessoriesFormSubmit = driver.findElement(By.id("electricalAccessoriesFormSubmit"));
	@FindBy(id="electricalAccessoriesFormSubmit")
	public static WebElement electricalAccessoriesFormSubmit;
	
	// NonElectricalAccessories = driver.findElement(By.xpath("//*[contains(text(),'Non-Electrical Accessories')]"));
	@FindBy(xpath="//*[contains(text(),'Non-Electrical Accessories')]")
	public static WebElement NonElectricalAccessories;
	
	//non_ea_accessoriesName = driver.findElement(By.id("non_ea_accessoriesName"));
	@FindBy(id="non_ea_accessoriesName")
	public static WebElement non_ea_accessoriesName;
	
	//non_ea_accessoriesAmount = driver.findElement(By.id("non_ea_accessoriesAmount"));
	@FindBy(id="non_ea_accessoriesAmount")
	public static WebElement non_ea_accessoriesAmount;
	
	//non_electricalAccessoriesFormSubmit = driver.findElement(By.id("non_electricalAccessoriesFormSubmit"));
	@FindBy(id="non_electricalAccessoriesFormSubmit")
	public static WebElement non_electricalAccessoriesFormSubmit;
	
	//premiumDetailsFormSubmit = driver.findElement(By.id("premiumDetailsFormSubmit"));
	@FindBy(id="carPremiumDetailsFormSubmit")
	public static WebElement premiumDetailsFormSubmit;
	
	// ow_name = driver.findElement(By.id("ow_name"));
	@FindBy(id="ow_name")
	public static WebElement ow_name;
	
	//ow_email = driver.findElement(By.id("ow_email"));
	@FindBy(id="ow_email")
	public static WebElement ow_email;
	
	//ow_adLine1 = driver.findElement(By.id("ow_adLine1"));
	@FindBy(id="ow_adLine1")
	public static WebElement ow_adLine1;
	
	//ow_pincode = driver.findElement(By.id("ow_pincode"));
	@FindBy(id="ow_pincode")
	public static WebElement ow_pincode;
	
	
	//pan document_number
	@FindBy(id="document_number")
	public static WebElement panNum;
	
	
	//document_dob
	@FindBy(id="document_dob")
	public static WebElement panDOB;
	
	
	//document_dob
	
	
	//ow_nomineeName = driver.findElement(By.id("ow_nomineeName"));
	@FindBy(id="ow_nomineeName")
	public static WebElement ow_nomineeName;
	
 	// ow_nomineeRel = driver.findElement(By.id("ow_nomineeRel"));
	@FindBy(id="ow_nomineeRel")
	public static WebElement ow_nomineeRel;
	
	// bro = driver.findElement(By.xpath(" //*[contains(text(),'BROTHER')]"));
	@FindBy(xpath=" //*[contains(text(),'BROTHER')]")
	public static WebElement bro;
		
	// ow_nomineeAge = driver.findElement(By.id("ow_nomineeAge"));	
	@FindBy(id="ow_nomineeAge")
	public static WebElement ow_nomineeAge;
		
	// ownerFormSubmit = driver.findElement(By.id("ownerFormSubmit"));	
	@FindBy(id="carOwnerFormSubmit")
	public static WebElement carOwnerFormSubmit;
	
	//ckycSuccessPopup_check
	@FindBy(id="ckycSuccessPopup_check")
	public static WebElement ckycSuccessPopup_check;
	
	//editPanDetails
	@FindBy(id="editPanDetails")
	public static WebElement editPanDetails;
	
	
	
	
	
	
	
	
	// new_chassisNumber = driver.findElement(By.id("new_chassisNumber"));
	@FindBy(id="new_chassisNumber")
	public static WebElement new_chassisNumber;
	
	// new_enginNumber = driver.findElement(By.id("new_enginNumber"));
	@FindBy(id="new_enginNumber")	
	public static WebElement new_enginNumber;
	
	//isHypothecation
	@FindBy(xpath="//*[@class='tog-circle']/parent::*")
	public static WebElement isHypothecation;
	
	//pi_hypo_type
	@FindBy(id="pi_hypo_type")
	public static WebElement pi_hypo_type;
	
	//pi_hypo_LoanProvider
	@FindBy(id="pi_hypo_LoanProvider")
	public static WebElement pi_hypo_LoanProvider;
	
	
	//pi_hypo_FinancierBank
	
	@FindBy(id="pi_hypo_FinancierBank")
	public static WebElement pi_hypo_FinancierBank;
	
		
	// pp_Insurer = driver.findElement(By.id("pp_Insurer"));
	@FindBy(id="pp_Insurer")
	public static WebElement pp_Insurer;
		
	// Inscompany = driver.findElement(By.xpath("//*[contains(text(),'THE NEW INDIA ASSURANCE CO LTD')]"));	
	@FindBy(xpath="//*[contains(text(),'THE NEW INDIA ASSURANCE CO LTD')]")
	public static WebElement Inscompany;
	
	//pp_PolicyNumber = driver.findElement(By.id("pp_PolicyNumber"));
	@FindBy(id="pp_PolicyNumber")
	public static WebElement pp_PolicyNumber;
	
	// policyInfoFormSubmit = driver.findElement(By.id("policyInfoFormSubmit"));
	@FindBy(id="carPolicyInfoFormSubmit")
	public static WebElement carPolicyInfoFormSubmit;
	
	// checkBoxElement = driver.findElement(By.id("paynowTerms"));
	@FindBy(id="paynowTerms")
	public static WebElement checkBoxElement;
	
	//paynowFormSubmit = driver.findElement(By.id("paynowFormSubmit"));
	@FindBy(id="carPaynowFormSubmit")
	public static WebElement paynowFormSubmit;
	
	
	
	//label[@class='custom-checkbox paymentModeCheckboxes']
	@FindBy(xpath="//label[@class='custom-checkbox paymentModeCheckboxes']")
	public static WebElement ccAvenue;
	
	//label[@class='custom-checkbox paymentModeCheckboxes']
		@FindBy(xpath="//label[@class='custom-checkbox paymentModeCheckboxes'][Last]")
		public static WebElement razorpay;
	
	//paymentproceed		
		@FindBy(xpath="//*[contains(text(),'Proceed to Pay')]")
		public static WebElement paymentproceed;
	
	//netbank = driver.findElement(By.id("OPTNBK"));
	@FindBy(id="OPTNBK")
	public static WebElement netbank;
	
	//netBankingBank = driver.findElement(By.id("netBankingBank"));
	@FindBy(id="netBankingBank")
	public static WebElement netBankingBank;
	
	//SubmitBillShip = driver.findElement(By.xpath("//*[@id='buttons'][@class='span12']/child::*"));
	@FindBy(xpath="//*[@id='buttons'][@class='span12']/child::*")
	public static WebElement SubmitBillShip;
	
	//returntomerchant = driver.findElement(By.xpath("//*[@type='submit'][@value='Return To the Merchant Site']"));	
	@FindBy(xpath="//*[@type='submit'][@value='Return To the Merchant Site']")
	public static WebElement returntomerchant;
		
		
		
		
		
	
}
