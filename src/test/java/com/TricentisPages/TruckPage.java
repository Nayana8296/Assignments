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

public class TruckPage {
      
      private WebDriver driver; 
    
            //Locators
            //enterVehicledata
            private final By Truck  = By.id("nav_truck");
	        private final By MakeDropDown = By.id("make");
			private final By EnginePerformance = By.id("engineperformance");
			private final By DateOfManufacture = By.id("dateofmanufacture");
			private final By NumberOfseats = By.id("numberofseats");
			private final By FuelType = By.id("fuel");
			private final By PayLoad = By.id("payload");
			private final By Totalweight = By.id("totalweight");
			private final By ListPrice = By.id("listprice");
			private final By LicensePlate = By.id("licenseplatenumber");
			private final By AnnualMileage = By.id("annualmileage");
			//enterInsurantdata
			private final By Next = By.id("nextenterinsurantdata");
			private final By FirstName = By.id("firstname");
			private final By LastName= By.id("lastname");
			private final By DateOfBirth = By.id("birthdate");
			private final By genderMale = By.id("gendermale");
			private final By genderFemale = By.id("genderfemale");
			private final By StreetAddress = By.name("Street Address");
			private final By Country = By.id("country");
			private final By ZipCode = By.id("zipcode");
			private final By City = By.id("city");
			private final By Occupation = By.name("Occupation");
			private final By Hobbies = By.id("cliffdiving");
			private final By WebSite = By.name("Website");
			private final By Next1 = By.id("nextenterproductdata");
			//enterproductdata
			private final By Startdate = By.id("startdate");
			private final By InsuranceSum = By.id("insurancesum");
			private final By DamageInsurance = By.id("damageinsurance");
			private final By OptionalProduct = By.id("EuroProtection");
		
			
			//selectpriceoption
			private final By Next5 = By.id("nextselectpriceoption");
			private final By GoldButton = By.id("selectgold");
			private final By Next21 = By.id("nextsendquote");
			//Email
			private final By Email = By.id("email");
			private final By Phone =By.name("Phone");
			private final By Username =By.id("username");
			private final By Password = By.name("Password");
			private final By ConfirmPassword = By.id("confirmpassword");
			private final By Comments = By.id("Comments");
			private final By Send = By.id("sendemail");
			private final By Ok =By.className("confirm");
			private final By MotorCycle = By.id("newmotorcycleinsurance");
			  
			
			
			public TruckPage (WebDriver driver) {
				this.driver = driver;
			}

			//Actions

			//Actions
			 public void enterVehicledata(String make1,String engine1,String date1,String seats1,String fuel1,String payload,String totalweight,String listprice,String licenseplate,String mileage1) {
				    selectMakeTypeByText(make1);
				    setEnginePerformance(engine1);
				    setDateOfManufacture(date1);
				    setNumberOfseats(Integer.parseInt(seats1));
				    setFuelType(fuel1);
				    setPayLoad(payload);
				    setTotalWeight(totalweight);
				    setListPrice(listprice);
				    setLicensePlate(licenseplate);
				    setAnnualMileage(mileage1);
				    
					}
			 public void enterInsurantdata(
					    String firstname,
					    String lastname,
					    String dob,
					    String gender,
					    String streetaddress,
					    String country, 
					    String Zipcode,
					    String city,
					    String occupation,
					    String hobbies,
					    String website
					    ) throws InterruptedException {
				    	driver.findElement(FirstName).sendKeys(firstname);
				    	driver.findElement(LastName).sendKeys(lastname);
				    	driver.findElement(DateOfBirth).sendKeys(dob);
				    	clickGender(gender);
				    	driver.findElement(StreetAddress).sendKeys(streetaddress);
				    	driver.findElement(Country).sendKeys(country);
				    	driver.findElement(ZipCode).sendKeys(Zipcode);
				    	driver.findElement(City).sendKeys(city);
				    	driver.findElement(Occupation).sendKeys(occupation);
				    	selectHobby(hobbies);
				    	driver.findElement(WebSite).sendKeys(website);
				    }			  
			    public void enterProductdata(String startdate1,String insurancesum1,String damageinsurance1,String optionalproduct1) {
			    	driver.findElement(Startdate).sendKeys(startdate1);
			    	driver.findElement(InsuranceSum).sendKeys(insurancesum1);
			    	driver.findElement(DamageInsurance).sendKeys(damageinsurance1);
			    	driver.findElement(OptionalProduct).sendKeys(optionalproduct1);
			    	  }
			    public void enterSendquote(String email,String phone,String username,String password,String confirmPassword,String comments) {
			    	driver.findElement(Email).sendKeys(email);
			    	driver.findElement(Phone).sendKeys(phone);
			    	driver.findElement(Username).sendKeys(username);
			    	driver.findElement(Password).sendKeys(password);
			    	driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
			    	driver.findElement(Comments).sendKeys(comments);
			     }
			    public void enterselectPriceOption(String gold) {
			    	selectGoldButton(gold);
			    }
			    public void ClickTruck() {
			    	driver.findElement(Truck).click();
			    }
			public void selectMakeTypeByText (String MakeTypename1) {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				WebElement DropDownElement = wait.until(ExpectedConditions.elementToBeClickable(MakeDropDown));
				Select select = new Select (DropDownElement);
				select.selectByVisibleText(MakeTypename1);
				
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
			public void setFuelType(String FuelTypeName) {
				WebElement DropDownFuelType = driver.findElement(FuelType);
				Select select = new Select(DropDownFuelType);
				select.selectByVisibleText(FuelTypeName);
			}
			public void setPayLoad (String payload) {
				driver.findElement(PayLoad).sendKeys(payload);
			}
			public void setTotalWeight(String TotalWeight) {
				driver.findElement(Totalweight).sendKeys(TotalWeight);
			}
			public void setListPrice(String listprice) {
				driver.findElement(ListPrice).sendKeys(listprice);
			}   
			public void setLicensePlate(String licenseplate) {
				driver.findElement(LicensePlate).sendKeys(licenseplate);
			}
			public void setAnnualMileage(String Mileage) {
				driver.findElement(AnnualMileage).sendKeys(Mileage);
			}
			//enterInsurantdata
			public void ClickNext () {
				driver.findElement(Next).click();
			}
			
			public void setfirstname(String firstname1) {
				driver.findElement(FirstName).sendKeys(firstname1);
			}
			public void setLastName(String lastName1) {
				driver.findElement(LastName).sendKeys(lastName1);
			}
			public void setbirthdate(String date) {
				driver.findElement(DateOfBirth).sendKeys(date);
			}
			public void clickGender (String gender) throws InterruptedException {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				

		        JavascriptExecutor js = (JavascriptExecutor) driver;
				if(gender.equalsIgnoreCase("male")) {
					WebElement Male = wait.until(ExpectedConditions.elementToBeClickable(genderMale));
					js.executeScript("arguments[0].click();", Male);
				}
				else if(gender.equalsIgnoreCase("female")) {
					WebElement Female =wait.until(ExpectedConditions.elementToBeClickable(genderFemale));	
					js.executeScript("arguments[0].click();", Female);
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
					WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cliffdiving")));
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
			//enterproductdata
			public void setStartdate(String date) { 
				driver.findElement(Startdate).sendKeys(date);
			}
			public void setInsurancesum (String insurancesum) {
			WebElement DropdownElement1=driver.findElement(InsuranceSum);
			Select select = new Select(DropdownElement1);
			select.selectByValue(insurancesum);
			}
					
			/*public void setMeritRating (String rating) {
				WebElement DropDown1 = driver.findElement(MeritRating);
				Select select = new Select(DropDown1);
				select.selectByVisibleText(rating);
			}*/
			public void setDamageInsurance (String damageinsurance1) {
				WebElement DropDn = driver.findElement(DamageInsurance);
				Select select = new Select(DropDn);
				select.selectByVisibleText(damageinsurance1);
			}
			public void selectOptionalProduct(String optionalproduct1 ) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				try {
					WebElement element1 = driver.findElement(By.id("EuroProtection"));
				js.executeScript("arguments[0].click();", element1);
			}
				catch(NoSuchElementException e) {
				 throw new IllegalArgumentException("InvalidOptions:"+optionalproduct1);
			}
		}
			/*public void setCourtesyCar(String courtesycar) {
				WebElement DropDown2 = driver.findElement(CourtesyCar);
				Select select = new Select(DropDown2);
				select.selectByVisibleText(courtesycar);
			}*/
			public void ClickNext5 () {
				driver.findElement(Next5).click();
			}
			 public void selectGoldButton (String plan) {
			    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			    	JavascriptExecutor js =  (JavascriptExecutor)driver;
			    	
			    	String planNormalized  = plan.toLowerCase();
			    	
			    	List<String>validPrice = Arrays.asList("Silver","gold","Platinum","Ultimate");
			    	
			    	if(validPrice.contains(planNormalized)) {
			    		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("selectgold")));
			    		js.executeScript("arguments[0].click();", element);
			    	}
			    	else {
			    		throw new IllegalArgumentException("Invalid Option:"+plan);
			    	}
			    	
			    }
			 public void ClickNext21 () {
					WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
					WebElement next2Button = wait.until(ExpectedConditions.elementToBeClickable(Next21));
					next2Button.click();
				// driver.findElement(Next2).click();
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
                try {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    WebElement sendbutton = wait.until(ExpectedConditions.elementToBeClickable(Send));
                    sendbutton.click();
                    System.out.println("Send button clicked successfully.");
                } catch (Exception e) {
                    System.out.println("Exception occurred while clicking Send: " + e.getMessage());
                    e.printStackTrace();
                }
            }

            public void ClickOk() {
            	try {
            		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            		WebElement Okbutton = wait.until(ExpectedConditions.elementToBeClickable(Ok));
            		Okbutton.click();
            		System.out.println("Ok button clicked successfully.");
            	}
            	catch(Exception e) {
            		System.out.println("Exception occured while clicking Ok:"+e.getMessage());
            		e.printStackTrace();
            	}
            }
            public void ClickMotorCycle() {
            	driver.findElement(MotorCycle).click();
            }
				
			}


