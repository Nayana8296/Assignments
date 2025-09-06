package com.TricentisPages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CamperPage {
	
	 WebDriver driver;
	//Locators
		
		    //enterVehicledata
	        private final By Camperpage = By.id("nav_camper");
		    private final By MakeDropDown = By.id("make");
			private final By EnginePerformance = By.id("engineperformance");
			private final By DateOfManufacture = By.id("dateofmanufacture");
			private final By NumberOfseats = By.id("numberofseats");
			private final By RHDriveYes = By.id("righthanddriveyes");
			private final By RHDriveNo = By.id("righthanddriveno");
			private final By FuelType = By.name("Fuel Type");
			private final By PayLoad  = By.id("payload");
			private final By TotalWeight = By.id("totalweight");
			private final By ListPrice = By.id("listprice");
			private final By LicencePlate = By.name("License Plate Number");
			private final By AnnualMileage = By.id("annualmileage");
			private final By Next = By.id("nextenterinsurantdata");
			//enterInsurantdata
			private final By FirstName = By.id("firstname");
			private final By LastName= By.name("Last Name");
			private final By DateOfBirth = By.id("birthdate");
			private final By genderMale = By.id("gendermale");
			private final By genderFemale = By.id("genderfemale");
			private final By StreetAddress = By.name("Street Address");
			private final By Country = By.id("country");
			private final By ZipCode = By.name("Zip Code");
			private final By City = By.id("city");
			private final By Occupation = By.name("Occupation");
			private final By Hobbies = By.id("bungeejumping");
			private final By WebSite = By.name("Website");
			private final By Next1 = By.id("nextenterproductdata");
			//enterproductdata
			private final By Startdate = By.id("startdate");
			private final By InsuranceSum = By.id("insurancesum");
			private final By DamageInsurance = By.name("Damage Insurance");
			private final By OptionalProduct = By.id("EuroProtection");
			private final By Next5 = By.id("nextselectpriceoption");
			private final By UltimateButton = By.id("selectultimate");
			private final By Next2 = By.id("nextsendquote");
			private final By Email = By.id("email");
			private final By Phone =By.name("Phone");
			private final By Username =By.id("username");
			private final By Password = By.name("Password");
			private final By ConfirmPassword = By.id("confirmpassword");
			private final By Comments = By.id("Comments");
			private final By Send = By.id("sendemail");
			private final By Ok =By.className("confirm");
			private final By MainPage = By.name("Go to Main Page");

			
		
		public CamperPage (WebDriver driver) {
			this.driver=driver;
		}
		//Actions
		
		//Actions
		 public void entervehicledata(String make,String engine,String date,String seats,String RHDrive,String fuel,String payload,String totalweight,String listprice,String licenseplate,String mileage) {
			    selectMakeTypeByText(make);
			    setEnginePerformance(engine);
			    setDateOfManufacture(date);
			    setNumberOfseats(Integer.parseInt(seats));
			    ClickRightHandDrive(RHDrive);
			    setFuelType(fuel);
			    setPayLoad(payload);
			    setTotalWeight(totalweight);
			    setListPrice(listprice);
			    setLicencePlate(licenseplate);
			    setAnnualMileage(mileage);
			    
				}
		  public void enterInsurantdata(String firstname,String lastname,String dob,String gender,String streetaddress,String country, String Zipcode,String city,String occupation,String hobbies,String website) throws InterruptedException {
		    	driver.findElement(FirstName).sendKeys(firstname);
		    	driver.findElement(LastName).sendKeys(lastname);
		    	driver.findElement(DateOfBirth).sendKeys(dob);
		    	Clickgender(gender);
		    	driver.findElement(StreetAddress).sendKeys(streetaddress);
		    	driver.findElement(Country).sendKeys(country);
		    	driver.findElement(ZipCode).sendKeys(Zipcode);
		    	driver.findElement(City).sendKeys(city);
		    	driver.findElement(Occupation).sendKeys(occupation);
		    	selectHobby(hobbies);
		    	driver.findElement(WebSite).sendKeys(website);
		    }
		
		  
		    public void enterProductdata(String startdate,String insurancesum,String damageinsurance,String optionalproduct) {
		    	driver.findElement(Startdate).sendKeys(startdate);
		    	driver.findElement(InsuranceSum).sendKeys(insurancesum);
		    	driver.findElement(DamageInsurance).sendKeys(damageinsurance);
		    	selectOptionalProduct(optionalproduct);
		    	}
		    public void enterSendquote(String email,String phone,String username,String password,String confirmPassword,String comments) {
		    	driver.findElement(Email).sendKeys(email);
		    	driver.findElement(Phone).sendKeys(phone);
		    	driver.findElement(Username).sendKeys(username);
		    	driver.findElement(Password).sendKeys(password);
		    	driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
		    	driver.findElement(Comments).sendKeys(comments);
		     }
		    public void enterSelectPriceOption(String ultimate) {
		      selectUltimateButton(ultimate);
		    
		    }
		    public void ClickCamperPage() {
		    	driver.findElement(Camperpage).click();
		    }
		    
		
		public void selectMakeTypeByText (String MakeTypename) {
			WebElement DropDownElement = driver.findElement(MakeDropDown);
			Select select = new Select (DropDownElement);
			select.selectByVisibleText(MakeTypename);
			
		}
		public void setEnginePerformance (String value) {
			driver.findElement(EnginePerformance).sendKeys(value);
		}
		
		public void setDateOfManufacture(String date) {
			driver.findElement(DateOfManufacture).sendKeys(date);
		}
		public void setNumberOfseats(int Seats) {
			WebElement DropDownNumber = driver.findElement(NumberOfseats);
			Select select = new Select(DropDownNumber);
			select.selectByIndex(Seats);
		}
		public void ClickRightHandDrive(String RHDrive) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			
			if(RHDrive.equalsIgnoreCase("Yes")) {
				WebElement right = wait.until(ExpectedConditions.elementToBeClickable(RHDriveYes));
				js.executeScript("arguments[0].click();",right);
			}
			else if(RHDrive.equalsIgnoreCase("No")) {
				WebElement wrong = wait.until(ExpectedConditions.elementToBeClickable(RHDriveNo));
				js.executeScript("arguments[0].click();",wrong);
			}
			else {
				throw new IllegalArgumentException("Invalid Option"+RHDrive);
			}
		}
		public void setFuelType(String FuelTypeName) {
			WebElement DropDownFuelType = driver.findElement(FuelType);
			Select select = new Select(DropDownFuelType);
			select.selectByVisibleText(FuelTypeName);
		}
		public void setPayLoad(String payload) {
			driver.findElement(PayLoad).sendKeys(payload);
		}
		public void setTotalWeight(String totalweight) {
			driver.findElement(TotalWeight).sendKeys(totalweight);
		}
		public void setListPrice(String price) {
			driver.findElement(ListPrice).sendKeys(price);
		}
		public void setLicencePlate(String Plate) {
			driver.findElement(LicencePlate).sendKeys(Plate);
		}
		public void setAnnualMileage(String Mileage) {
			driver.findElement(AnnualMileage).sendKeys(Mileage);
		}
		public void ClickNext() {
			driver.findElement(Next).click();
		}
		
		public void setfirstname(String firstName) {
			driver.findElement(FirstName).sendKeys(firstName);
		}
		public void setLastName(String lastName) {
			driver.findElement(LastName).sendKeys(lastName);
		}
		public void setbirthdate(String date) {
			driver.findElement(DateOfBirth).sendKeys(date);
		}
		public void  Clickgender(String gender) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			if(gender.equalsIgnoreCase("male"))
			{
			 WebElement male = wait.until(ExpectedConditions.elementToBeClickable(genderMale));	
			 js.executeScript("arguments[0].click();", male);
			}
			else if(gender.equalsIgnoreCase("female")) {
				WebElement female = wait.until(ExpectedConditions.elementToBeClickable(genderFemale));
				js.executeScript("arguments[0].click();", female);
			}
			else {
				throw new IllegalArgumentException("Invalid gender:"+gender);
			}
			}
		public void setStreetAddress(String Address) {
			driver.findElement(StreetAddress).sendKeys(Address);
		}
		public void setCountry(String country) {
			driver.findElement(Country).sendKeys(country);
		}
		public void setZipcode(String zipcode) {
			driver.findElement(ZipCode).sendKeys(zipcode);
		}
		public void setCity(String city) {
			driver.findElement(City).sendKeys(city);
		}
		public void setOccupation(String occupation) {
			driver.findElement(Occupation).sendKeys(occupation);
		}
		public void selectHobby(String Hobbies) throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;

			String hobbyId= Hobbies.toLowerCase();
			
			List<String>Validhobbies=Arrays.asList("speeding","bungeejumping","cliffdiving","skydiving","other");
			
			if(Validhobbies.contains(hobbyId)) {
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(hobbyId)));
				js.executeScript("arguments[0].click();",element);
				}
			else {
				throw new IllegalArgumentException("Invalid option:"+Hobbies);
			}
		}
		public void setWebSite(String webSite) {
			driver.findElement(WebSite).sendKeys(webSite);
		}
		public void ClickNext1() {
			driver.findElement(Next1).click();
		}
		
		public void setStartdate(String date) { 
			driver.findElement(Startdate).sendKeys(date);
		}
		public void setInsurancesum (String insurancesum) {
		WebElement DropdownElement1=driver.findElement(InsuranceSum);
		Select select = new Select(DropdownElement1);
		select.selectByValue(insurancesum);
		}
		public void setDamageInsurance (String damageinsurance) {
			WebElement DropDn = driver.findElement(DamageInsurance);
			Select select = new Select(DropDn);
			select.selectByVisibleText(damageinsurance);
		}
		public void selectOptionalProduct(String optionalproduct ) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			try {
				WebElement element1 = driver.findElement(By.id(optionalproduct));
			js.executeScript("arguments[0].click();", element1);
		}
			catch(NoSuchElementException e) {
			 throw new IllegalArgumentException("InvalidOptions:"+optionalproduct);
		}
	}

		public void ClickNext5 () {
			driver.findElement(Next5).click();
		}
		 public void selectUltimateButton (String ultimate) {
		    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		    	JavascriptExecutor js =  (JavascriptExecutor)driver;
		    	
		    	String PriceId  = ultimate.toLowerCase();
		    	
		    	List<String>validPrice = Arrays.asList("silver","gold","platinum","ultimate");
		    	
		    	if(validPrice.contains(PriceId)) {
		    		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("selectultimate")));
		    		js.executeScript("arguments[0].click();", element);
		    	}
		    	else {
		    		throw new IllegalArgumentException("Invalid Option:"+ultimate);
		    	}
		    	
		    }
		public void ClickNext2 () {
			driver.findElement(Next2).click();
		}
		public void setEmail(String email) {
			driver.findElement(Email).sendKeys(email);
		}
		public void setPhone (String phone) {
			driver.findElement(Phone).sendKeys(phone);
		}
		public void setUsername (String username) {
			driver.findElement(Username).sendKeys(username);
		}
		public void setPassword (String password) {
			driver.findElement(Password).sendKeys(password);
		}
		public void setConfirmPassword (String confirmpassword) {
			driver.findElement(ConfirmPassword).sendKeys(confirmpassword);
		}
	    public void setComments(String comments) {
	    	driver.findElement(Comments).sendKeys(comments);
	    }
	    public void ClickSend() {
	    	driver.findElement(Send).click();
	    }
	    public void ClickOk() {
	    	driver.findElement(Ok).click();
	    }
	    public void ClickMainPage () {
	    	driver.findElement(MainPage).click();
	    }

		}


