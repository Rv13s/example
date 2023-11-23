package Locations;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

import webActions.webActions;

public class SgiWebLocations {
	
	//shriramgilogo
	@FindBy(xpath="//div/a")
	public static WebElement home;
	
	//Resources
	@FindBy(xpath="//span[text()='Resources']")         //"//*[@id=\"headerNav\"]/div/div/div[2]/ul/li[3]/span")
	public static WebElement resources;

	//resources- download
//	@FindBy(xpath="//*[@id=\"headerNav\"]/div/div/div[2]/ul/li[3]/ul/li/ul/li[2]/a")
	@FindBy(xpath=".//*[@class='sub_Menu resource-gap']//ul/li[2]/a")
	public static WebElement downloads;
	
	////*[contains(text(),'Discharge Voucher')]/a
	@FindBy(xpath="//*[contains(text(),'Discharge Voucher')]/a")
	public static WebElement dischargevoucher;
	
	//carinsurance home page
	
	@FindBy(xpath="//span[text()='Car']")
	public static WebElement carinsurance;
	
	//carRegNum //input[@placeholder='Car Registration Number*']
	@FindBy(xpath="//input[@placeholder='Car Registration Number*']")
	public static WebElement carRegNum;
	
	//carMobNum //*[@id='mobile_number']
	@FindBy(name="mobile_number")
	public static WebElement carMobNum;
	
	//car_checkbox
	@FindBy(xpath="//*[@id=\"ippqgh\"]")  ////*[@id="ippqgh"] //*[@id="ippqgh"]
	public static WebElement car_checkbox;
	
	//car_homeCarFormSubmit
	@FindBy(id="homeCarFormSubmit")
	public static WebElement CarFormSubmit;
	
	
	//carotp
	
		@FindBy(id="otp1")
		public static WebElement carotp1;
		
		@FindBy(id="otp2")
		public static WebElement carotp2;
		
		@FindBy(id="otp3")
		public static WebElement carotp3;
		
		@FindBy(id="otp4")
		public static WebElement carotp4;
		
	//car_otp_verify_button
		
		@FindBy(id="verifyotpCar")
		public static WebElement carotpverifybtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
			
	//bikeinsurance home page
	@FindBy(xpath="//span[text()='Bike']")
	public static WebElement bikeinsurance;
	
	//bikeRegNum Bike Registration Number*
	@FindBy(xpath="//input[@placeholder='Bike Registration Number*']")
	public static WebElement bikeRegNum;
	
	//bikeMobNum //*[@id='mobile_number-2']
	@FindBy(xpath="//*[@id='mobile_number-2']")
	public static WebElement bikeMobNum;
	
	//bike check box
	@FindBy(id="ivys2i")
	public static WebElement bikecheckbox;
	
	// bike clicknow
	@FindBy(id="homBikeFormSubmit")
	public static WebElement homeBikeFormSubmit;
	
	//resendotp
	@FindBy(xpath="//*[@class='otp_page']//a")
	public static WebElement bikeresendotp;
	
	//bikeotp
	
	@FindBy(id="otp1")
	public static WebElement bikeotp1;
	
	@FindBy(id="otp2")
	public static WebElement bikeotp2;
	
	@FindBy(id="otp3")
	public static WebElement bikeotp3;
	
	@FindBy(id="otp4")
	public static WebElement bikeotp4;
	
	//bike_otp_verify_button
	
	@FindBy(id="verifyotpBike")
	public static WebElement bikeotpverifybtn;
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//personalinsurance //span[text()='Personal'] home page
	@FindBy(xpath="//span[text()='Personal']")
	public static WebElement personalAccidant;
	
	//personalName //*[@id='personal_acciedent_name']
	@FindBy(xpath="//*[@id='personal_acciedent_name']")
	public static WebElement personalName;
		
	//personalMobNum //*[@id='personal_acciedent_mobile']
	@FindBy(xpath="//*[@id='personal_acciedent_mobile']")
	public static WebElement personalMobNum;
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//homeinsuarance  //span[text()='Home'] home page
	@FindBy(xpath="//span[text()='Home']")
	public static WebElement homeinsuarance;
	
	//homeName //*[@id='personal_acciedent_name'] 
	@FindBy(xpath="//*[@id='homeInsureName']")
	public static WebElement homeName;
		
	//homeMobNum //*[@id='personal_acciedent_mobile']
	@FindBy(xpath="//*[@id='homeInsureMobile']")
	public static WebElement homeMobNum;
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//CommercialInsurance //span[text()='Commerical'] home page
	@FindBy(xpath="//span[text()='Commerical']")
	public static WebElement CommercialInsurance;
	
	//commercialvechilno //*[@id='commercialVechileno']
	@FindBy(xpath="//*[@id='commercialVechileno']")
	public static WebElement commercialvechilno;
		
	//commercialMobNo //*[@id='commercialmobile']
	@FindBy(xpath="//*[@id='commercialmobile']")
	public static WebElement commercialMobNo;	
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------

	//moreproducts //span[text()='More'] home page
	@FindBy(xpath="//span[text()='More']")
	public static WebElement moreproducts;
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	//click products
	
	@FindBy(xpath="//span[text()=' Products']")
	public static WebElement products;
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	//motor_insurance  .//*[@class='sub_Menu no-gap']//ul/li[1]/a
	
	@FindBy(xpath=".//*[@class='sub_Menu no-gap']//ul/li[1]/a")
	public static WebElement motorinsurance;
	
	//motor_insurance_car
	@FindBy(xpath="//*[@id='ia4rw']")
	public static WebElement motor_car;
	
	//motor_insurance_bike
	@FindBy(xpath="//*[@class='insurance insuranceNav']//li[2]")
	public static WebElement motor_bike;
	
	
	
	//motor_insurance_features-and-benifits  //*[@id='ijjtm2']
	@FindBy(xpath="//*[@id='ijjtm2']")
	public static WebElement motor_feature_and_benifits;
	
	//motor_insurance_types-of-shriram-motor-insurance
	@FindBy(xpath="//*[@id='iisqh8']")
	public static WebElement types_of_motorinsurance;
	
	//motor_insurance_covarages //*[@class='wrapper scrollTab insuranceNav more-tabs']//li[4]
	@FindBy(xpath="//*[@class='wrapper scrollTab insuranceNav more-tabs']//li[4]")
	public static WebElement motorinsurance_coverages;
		
	//motor_insurance_compare-plan //*[@class='wrapper scrollTab insuranceNav more-tabs']//li[5]
	@FindBy(xpath="//*[@class='wrapper scrollTab insuranceNav more-tabs']//li[5]")
	public static WebElement motorinsurance_compareplan;
	
	
	//motor_insurance_premium-components //*[@id='imi41z']
	@FindBy(xpath="//*[@id='imi41z']")
	public static WebElement motorinsurance_premium_components;
	
	//motor_insurance_eligibility-and-required-documents //*[@class='wrapper scrollTab insuranceNav more-tabs']//li[7]
	@FindBy(xpath="//*[@class='wrapper scrollTab insuranceNav more-tabs']//li[7]]")
	public static WebElement motorinsurance_eligiblity_documents;
	
	//motor_insurance_Buy/Renew //*[@id='iwgzdj']
	@FindBy(xpath="//*[@id='iwgzdj']")
	public static WebElement motorinsurnace_Buy_Renew;
	
	//motor_insurance_claim_process //*[@id='iwgzdj']
	@FindBy(xpath="//*[@id='iwgzdj']")
	public static WebElement motorinsurnace_claim_process;
	
	//motor_insurance_Terminologies   //*[@id='iwnj68']
	@FindBy(xpath="//*[@id='iwnj68']")
	public static WebElement motorinsurnace_Terminologies;
	
	
	//motor_insurance_Policy-download //*[@class='wrapper scrollTab insuranceNav more-tabs']//li[11]
	@FindBy(xpath="//*[@class='wrapper scrollTab insuranceNav more-tabs']//li[11]")
	public static WebElement motorinsurnace_Policy_download;
	
	//motor_insurance_FAQs //*[@class='wrapper scrollTab insuranceNav more-tabs']//li[12]
	@FindBy(xpath="//*[@class='wrapper scrollTab insuranceNav more-tabs']//li[12]")
	public static WebElement motorinsurnace_FAQs;
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	// products-car-insurance .//*[@class='sub_Menu no-gap']//ul/li[2]/a
	@FindBy(xpath=".//*[@class='sub_Menu no-gap']//ul/li[2]/a")
	public static WebElement product_car_insurance;
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	
	// products-bike-insurance
	@FindBy(xpath=".//*[@class='sub_Menu no-gap']//ul/li[3]/a")
	public static WebElement product_bike_insurance;
	
	
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	// products-gcvi-insurance
	@FindBy(xpath=".//*[@class='sub_Menu no-gap']//ul/li[4]/a")
	public static WebElement product_gciv_insurance;
	
	
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	// products-pcvi-insurance
	@FindBy(xpath=".//*[@class='sub_Menu no-gap']//ul/li[5]/a")
	public static WebElement product_pciv_insurance;
	
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	// personal accident 

	// Personal Accident Ruged Flow
	
	//Home-personal_accident 
	@FindBy(xpath="//*[@class='insurance insuranceNav']/li[3]")
	public static WebElement homepersonalAccident;
	
	//home-personal_acciedent_name
	@FindBy(id="personal_acciedent_name")
	public static WebElement paNAme;
	
	//home-personal_acciedent_mobile
	@FindBy(id="personal_acciedent_mobile")
	public static WebElement paMob;
	
	//home-personal_acciedent_checkbox i6jz1c
	@FindBy(id="i6jz1c")
	public static WebElement paCheckbox;
	
	//home-homePAFormSubmit
	@FindBy(id="homePAFormSubmit")
	public static WebElement homePAFormSubmit;
	
	//paOTP
	@FindBy(id="otpid")
	public static List<WebElement> paOTP;
	
	
	////*[@id="d1"]
	
	@FindBy(xpath="//*[@id=\"d1\"]")
	public static WebElement opt1;
	
	@FindBy(xpath="//*[@id=\"d2\"]")
	public static WebElement opt2;
	
	@FindBy(xpath="//*[@id=\"d3\"]")
	public static WebElement opt3;
	
	
	@FindBy(xpath="//*[@id=\"d4\"]")
	public static WebElement opt4;
	
	
	
	//pa-verify-otp personal-otp
	@FindBy(id="personal-otp")
	public static WebElement paVerifyOtp;
	
	//-------------------------------------------------------------------------------------------------------------------------------------------
	
	//Product-PA-name
	@FindBy(id="name")
	public static WebElement PaProductname;
	
	
	//Product-PA-mobileNo
	@FindBy(id="mobileNo")
	public static WebElement PaProductMobNo;
	
	
	//Product-PA-CheckBox i8qhg
	@FindBy(id="i8qhg")
	public static WebElement PaProductCheckBox;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//pa-email
	@FindBy(id="email")
	public static WebElement paEmail;
	
	//pa-dob
	@FindBy(id="dob")
	public static WebElement paDob;
	
	//pa-year //*[@class='ui-datepicker-year']
	@FindBy(xpath="//*[@class='ui-datepicker-year']")
	public static WebElement paYear;
	
	//paMonth //*[@class='ui-datepicker-month']
	@FindBy(xpath="//*[@class='ui-datepicker-month']")
	public static WebElement paMonth;
	
	
	
	
	
	
	
	//paInsureNow
	@FindBy(id="f_step1")
	public static WebElement paInsurenow;
	
	
	//paOccupation
	@FindBy(id="occupation_type")
	public static WebElement paOccupation;
	
	
	
	//Bussiness persone //*[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']//ancestor::div
	
	@FindBy(id="//*[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']//ancestor::div")
	public static WebElement paBusniessPerson;
	
	
	//screen2Conntinue f_step2
	
	@FindBy(id="f_step2")
	public static WebElement pascreen2Conntinue;
	
	
	//paAddress1 address1
	@FindBy(id="address1")
	public static WebElement paAddress1;
	
	//paAddress2 address2
	@FindBy(id="address2")
	public static WebElement paAddress2;
	
	//pa-Area area
	@FindBy(id="area")
	public static WebElement paArea;
	
	//pa-Street
	@FindBy(id="street")
	public static WebElement paStreet;
	
	//pa-pincode
	@FindBy(id="pincode")
	public static WebElement papincode;
	
	//pa-nominee_name
	@FindBy(id="nominee_name")
	public static WebElement panominee_name;
	
	//pa-nominee_age
	@FindBy(id="nominee_age")
	public static WebElement panominee_age;
	
	//pa-nominee_relation
	@FindBy(id="nominee_relation")
	public static WebElement panominee_relation;
	
	//pan_no
	@FindBy(id="pan_no")
	public static WebElement papan_no;
	
	//pan_dob
	@FindBy(id="pan_dob")
	public static WebElement papan_dob;
	
	//pan_name
	@FindBy(id="pan_name")
	public static WebElement papan_name;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
