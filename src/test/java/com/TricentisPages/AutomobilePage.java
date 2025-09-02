package com.TricentisPages;

import java.sql.Driver;
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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomobilePage {
	
	WebDriver driver;
	
	//Locators
	//EnterVehicledata
	private final By Automobile  = By.id("nav_automobile");
	private final By MakeDropDown = By.id("make");
	private final By EnginePerformance = By.id("engineperformance");
	private final By DateOfManufacture = By.id("dateofmanufacture");
	private final By NumberOfseats = By.id("numberofseats");
	private final By FuelType = By.id("fuel");
	private final By ListPrice = By.id("listprice");
	private final By LicencePlate = By.id("licenseplatenumber");
	private final By AnnualMileage = By.id("annualmileage");
	private final By Next = By.id("nextenterinsurantdata");
	//enterInsurantdata
	private final By FirstName = By.id("firstname");
	private final By LastName= By.name("Last Name");
	private final By DateOfBirth = By.id("birthdate");
	private final By genderMale = By.id("gendermale");
	private final By genderFemale = By.id("genderfemale");
	private final By StreetAddress = By.id("streetaddress");
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
	private final By MeritRating = By.id("meritrating");
	private final By DamageInsurance = By.id("damageinsurance");
	private final By optionalproduct = By.id("EuroProtection");
	private final By CourtesyCar = By.id("courtesycar");
	//selectpriceoption
	private final By Button = By.id("nextselectpriceoption");
	private final By SilverButton = By.id("selectsilver");
	private final By Next2 = By.id("nextsendquote");
	//sendquote
	private final By Email = By.id("email");
	private final By Phone =By.name("Phone");
	private final By Username =By.id("username");
	private final By Password = By.name("Password");
	private final By ConfirmPassword = By.id("confirmpassword");
	private final By Comments = By.id("Comments");
	private final By Sendquote = By.id("sendemail");
	private final By Ok =By.cssSelector("button[class=\"confirm\"]");
	private final By TruckInsurance = By.name("New Truck Insurance");
	
	
	
	//Constructors
	
	
	public AutomobilePage (WebDriver driver) {
		this.driver = driver;
	}

	//Actions
	 public void entervehicledata(String make,String engine,String date,String seats,String fuel,String listprice,String licenseplate,String mileage) {
		    selectMakeTypeByText(make);
		    setEnginePerformance(engine);
		    setDateOfManufacture(date);
		    setNumberOfseats(Integer.parseInt(seats));
		    setFuelType(fuel);
		    setListPrice(listprice);
		    setLicencePlate(licenseplate);
		    setAnnualMileage(mileage);
		    
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
	
	  
	    public void enterProductdata(String startdate,String insurancesum,String meritrating,String damageinsurance,String Optionalproduct,String cortseycar) {
	    	driver.findElement(Startdate).sendKeys(startdate);
	    	driver.findElement(InsuranceSum).sendKeys(insurancesum);
	    	driver.findElement(MeritRating).sendKeys(meritrating);
	    	driver.findElement(DamageInsurance).sendKeys(damageinsurance);
	    	selectOptionalProduct(Optionalproduct);
	    	driver.findElement(CourtesyCar).sendKeys(cortseycar);
	    }
	    
	    public void enterSendquote(String email,String phone,String username,String password,String confirmPassword,String comments) {
	    	driver.findElement(Email).sendKeys(email);
	    	driver.findElement(Phone).sendKeys(phone);
	    	driver.findElement(Username).sendKeys(username);
	    	driver.findElement(Password).sendKeys(password);
	    	driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
	    	driver.findElement(Comments).sendKeys(comments);
	     }
	    
	    public void enterselectPriceOption(String silver) {
	    	selectSilverButton(silver);
	    }
	   public void ClickAutomobile() {
	    	driver.findElement(Automobile).click();
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
	 public void setFuelType(String FuelTypeName) {
		WebElement DropDownFuelType = driver.findElement(FuelType);
		Select select = new Select(DropDownFuelType);
		select.selectByVisibleText(FuelTypeName);
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
	
	public void ClickNext (){
		driver.findElement(Next).click();
	}
	
	public void setfirstname(String firstname) {
		driver.findElement(FirstName).sendKeys(firstname);
	}
	public void setLastName(String lastName) {
		driver.findElement(LastName).sendKeys(lastName);
	}
	public void setbirthdate(String date) {
		driver.findElement(DateOfBirth).sendKeys(date);
	}

	public void clickGender (String gender) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Thread.sleep(1000);

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
	public void ClickNext1 () {
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
	public void selectOptionalProduct(String Optionalproduct ) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		try {
			WebElement element1 = driver.findElement(By.id("EuroProtection"));
		js.executeScript("arguments[0].click();", element1);
	}
		catch(NoSuchElementException e) {
		 throw new IllegalArgumentException("InvalidOptions:"+Optionalproduct);
	}
}
	public void setCourtesyCar(String courtesycar) {
		WebElement DropDown2 = driver.findElement(CourtesyCar);
		Select select = new Select(DropDown2);
		select.selectByVisibleText(courtesycar);
	}
    public void ClickButton() {
    	driver.findElement(Button).click();
    }
    public void selectSilverButton (String silver) {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	JavascriptExecutor js =  (JavascriptExecutor)driver;
    	
    	String PriceId  = silver.toLowerCase();
    	
    	List<String>validPrice = Arrays.asList("silver","Gold","Platinum","Ultimate");
    	
    	if(validPrice.contains(PriceId)) {
    		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("selectsilver")));
    		js.executeScript("arguments[0].click();", element);
    	}
    	else {
    		throw new IllegalArgumentException("Invalid Option:"+silver);
    	}
    	
    }
	public void ClickNext2 () {
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement next2Button = wait.until(ExpectedConditions.elementToBeClickable(Next2));
		next2Button.click();
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
            WebElement sendbutton = wait.until(ExpectedConditions.elementToBeClickable(Sendquote));
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
   public void ClickTruckInsurance()
   {
	   driver.findElement(TruckInsurance).click();
   }
    }
    
