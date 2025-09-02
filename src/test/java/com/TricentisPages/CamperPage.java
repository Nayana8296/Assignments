package com.TricentisPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CamperPage {
	
	private WebDriver driver;
	//Locators
		
		    //enterVehicledata
		    private final By MakeDropDown = By.id("make");
			private final By EnginePerformance = By.id("engineperformance");
			private final By DateOfManufacture = By.id("dateofmanufacture");
			private final By NumberOfseats = By.id("numberofseats");
			private final By FuelType = By.name("Fuel Type");
			private final By ListPrice = By.id("listprice");
			private final By LicencePlate = By.name("License Plate Number");
			private final By AnnualMileage = By.id("annualmileage");
			private final By Next = By.className("next button");
			//enterInsurantdata
			private final By FirstName = By.id("firstname");
			private final By LastName= By.name("Last Name");
			private final By DateOfBirth = By.id("birthdate");
			private final By gender = By.xpath("//input[@value=\"Male\"]");
			private final By StreetAddress = By.name("Street Address");
			private final By Country = By.id("country");
			private final By ZipCode = By.name("Zip Code");
			private final By City = By.id("city");
			private final By Occupation = By.name("Occupation");
			private final By Hobbies = By.id("cliffdiving");
			private final By WebSite = By.name("Website");
			private final By Next1 = By.id("nextenterproductdata");
			//enterproductdata
			private final By Startdate = By.id("startdate");
			private final By InsuranceSum = By.id("insurancesum");
			private final By MeritRating = By.id("meritrating");
			private final By DamageInsurance = By.name("Damage Insurance");
			private final By OptionalProduct = By.id("EuroProtection");
			private final By CourtesyCar = By.id("courtesycar");
			private final By Next5 = By.id("nextselectpriceoption");
			private final By Button = By.id("selectultimate");
			private final By Next2 = By.id("nextsendquote");
			private final By Email = By.id("email");
			private final By Phone =By.name("Phone");
			private final By Username =By.id("username");
			private final By Password = By.name("Password");
			private final By ConfirmPassword = By.id("confirmpassword");
			private final By Comments = By.id("Comments");
			private final By Send = By.id("sendemail");
			private final By Ok =By.className("confirm");
			private final By CamperInsurance = By.id("newcamperinsurance");
			private final By MainPage = By.name("Go to Main Page");

			
		
		public CamperPage (WebDriver driver) {
			this.driver=driver;
		}
		//Actions
		
		//Actions
		 public void entervehicledata(String make,String engine,String date,String seats,String fuel,String listprice,String licensepalte,String mileage) {
			    selectMakeTypeByText(make);
			    setEnginePerformance(engine);
			    setDateOfManufacture(date);
			    setNumberOfseats(Integer.parseInt(seats));
			    setFuelType(fuel);
			    setListPrice(listprice);
			    setLicencePlate(licensepalte);
			    setAnnualMileage(mileage);
			    
				}
		  public void enterInsurantdata(String firstname,String lastname,String dob,String gender,String streetaddress,String country, String Zipcode,String city,String occupation,String hobbies,String website) {
		    	driver.findElement(FirstName).sendKeys(firstname);
		    	driver.findElement(LastName).sendKeys(lastname);
		    	driver.findElement(DateOfBirth).sendKeys(dob);
		    	driver.findElement(this.gender).click();
		    	driver.findElement(StreetAddress).sendKeys(streetaddress);
		    	driver.findElement(Country).sendKeys(country);
		    	driver.findElement(ZipCode).sendKeys(Zipcode);
		    	driver.findElement(City).sendKeys(city);
		    	driver.findElement(Occupation).sendKeys(occupation);
		    	driver.findElement(Hobbies).sendKeys(hobbies);
		    	driver.findElement(WebSite).sendKeys(website);
		    }
		
		  
		    public void enterProductdata(String startdate,String insurancesum,String meritrating,String damageinsurance,String optionalproduct,String cortesycar) {
		    	driver.findElement(Startdate).sendKeys(startdate);
		    	driver.findElement(InsuranceSum).sendKeys(insurancesum);
		    	driver.findElement(MeritRating).sendKeys(meritrating);
		    	driver.findElement(DamageInsurance).sendKeys(damageinsurance);
		    	driver.findElement(OptionalProduct).sendKeys(optionalproduct);
		    	driver.findElement(CourtesyCar).sendKeys(cortesycar);
		    	}
		
		public void selectMakeTypeByText (String MakeTypename) {
			WebElement DropDownElement = driver.findElement(MakeDropDown);
			Select select = new Select (DropDownElement);
			select.selectByVisibleText("Mercedes Benz");
			
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
			select.selectByIndex(4);
		}
		public void setFuelType(String FuelTypeName) {
			WebElement DropDownFuelType = driver.findElement(FuelType);
			Select select = new Select(DropDownFuelType);
			select.selectByVisibleText("Diesel");
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
		public void Next () {
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
		public void setgender(String Gender) {
			driver.findElement(gender).sendKeys(Gender);
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
		public void setHobbies(String hobbies) {
			driver.findElement(Hobbies).sendKeys(hobbies);
		}
		public void setWebSite(String webSite) {
			driver.findElement(WebSite).sendKeys(webSite);
		}
		public void setNext1(String next1) {
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
				
		public void setMeritRating (String rating) {
			WebElement DropDown1 = driver.findElement(MeritRating);
			Select select = new Select(DropDown1);
			select.selectByVisibleText(rating);
		}
		public void setDamageInsurance (String damageinsurance) {
			WebElement DropDn = driver.findElement(DamageInsurance);
			Select select = new Select(DropDn);
			select.selectByVisibleText(damageinsurance);
		}
		public void setOptionalProduct (String optionalprodct) {
			driver.findElement(OptionalProduct).click();
		}
		public void setCourtesyCar(String courtesycar) {
			WebElement DropDown2 = driver.findElement(CourtesyCar);
			Select select = new Select(DropDown2);
			select.selectByVisibleText(courtesycar);
		}
		public void setNext5 (String next5) {
			driver.findElement(Next5).click();
		}
	    public void setButton(String button) {
	    	driver.findElement(Button).click();
	    }
		public void setNext2 (String next2) {
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
	    public void setSend(String send) {
	    	driver.findElement(Send).click();
	    }
	    public void setOk(String ok) {
	    	driver.findElement(Ok).click();
	    }
	    public void setCamperInsurance(String camperInsurance) {
	    	driver.findElement(CamperInsurance).click();
	    }
	    public void MainPage (String mainPage) {
	    	driver.findElement(MainPage).click();
	    }

		public void enterVehicledata(String string, String string2, String string3, String string4, String string5,
				String string6, String string7, String string8, String string9, String string10, String string11) {
			// TODO Auto-generated method stub
			
		}

	
			
		}
