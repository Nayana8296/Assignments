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

public class MotorCyclePage {
	
	WebDriver driver;
	
	   //enterVehicledata
	    private final By MotorCycle = By.name("Navigation Motorcycle");
	    
	    private final By MakeDropDown = By.id("make");
	    private final By ModelType = By.id("model");
	    private final By Cylindercapacity = By.id("cylindercapacity");
		private final By EnginePerformance = By.id("engineperformance");
		private final By DateOfManufacture = By.id("dateofmanufacture");
		private final By NumberOfseats = By.id("numberofseatsmotorcycle");
		private final By ListPrice = By.id("listprice");
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
		private final By Hobbies = By.id("speeding");
		//private final By Hobbies1 = By.id("speeding");
		private final By WebSite = By.name("Website");
		private final By Next1 = By.id("nextenterproductdata");
		//enterproductdata
		private final By Startdate = By.id("startdate");
		private final By InsuranceSum = By.id("insurancesum");
		private final By DamageInsurance = By.name("Damage Insurance");
		private final By OptionalProduct = By.xpath("//*[@id=\"LegalDefenseInsurance\"]");
		private final By Next51 = By.id("nextselectpriceoption");
		private final By GoldButton = By.id("selectplatinum");
		//sendquote
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
		

		
	
	public MotorCyclePage (WebDriver driver) {
		this.driver=driver;
	}
	//Actions
	
	//Actions
	 public void entervehicledata(String make,String model,String CylinderCapacity,String engine,String date,String seats,String listprice,String mileage) {
		    selectMakeTypeByText(make);
		    selectModel(model);
		    setCylinderCapacity(CylinderCapacity);
		    setEnginePerformance(engine);
		    setDateOfManufacture(date);
		    selectNumberOfseats(Integer.parseInt(seats));
		    setListPrice(listprice);
		    setAnnualMileage(mileage);
		    
			}
	  public void enterInsurantdata(String firstname,String lastname,String dob,String gender,String streetaddress,String country, String Zipcode,String city,String occupation,String hobbies,String website) throws InterruptedException {
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
	
	  
	    public void enterProductdata(String startdate,String insurancesum,String damageinsurance,String optionalproduct1) {
	    	driver.findElement(Startdate).sendKeys(startdate);
	    	driver.findElement(InsuranceSum).sendKeys(insurancesum);
	    	driver.findElement(DamageInsurance).sendKeys(damageinsurance);
	    	selectOptionalProduct(optionalproduct1);
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
	    public void ClickMotorcycle() {
	    	driver.findElement(MotorCycle).click();
	    }
	public void selectMakeTypeByText (String MakeTypename) {
		WebElement DropDownElement = driver.findElement(MakeDropDown);
		Select select = new Select (DropDownElement);
		select.selectByVisibleText(MakeTypename);
		
	}
	public void selectModel(String model) {
		WebElement DropDn = driver.findElement(ModelType);
			Select select = new Select(DropDn);
			select.selectByVisibleText(model);
			
		}
	public void setCylinderCapacity(String capacity) {
		driver.findElement(Cylindercapacity).sendKeys(capacity);
	}
	public void setEnginePerformance (String value) {
		driver.findElement(EnginePerformance).sendKeys(value);
	}
	
	public void setDateOfManufacture(String date) {
		driver.findElement(DateOfManufacture).sendKeys(date);
	}
	public void selectNumberOfseats(int Seats) {
		WebElement DropDownNumber = driver.findElement(NumberOfseats);
		Select select = new Select(DropDownNumber);
		select.selectByIndex(Seats);
	}
	public void setListPrice(String price) {
		driver.findElement(ListPrice).sendKeys(price);
	}
	public void setAnnualMileage(String Mileage) {
		driver.findElement(AnnualMileage).sendKeys(Mileage);
	}
	public void ClickNext () {
		driver.findElement(Next).click();
	}
	//enterInsurant data
	public void setfirstname(String firstName) {
		driver.findElement(FirstName).sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		driver.findElement(LastName).sendKeys(lastName);
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
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("speeding")));
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
	//enter product data
	public void setStartdate(String date) { 
		driver.findElement(Startdate).sendKeys(date);
	}
	public void selectInsurancesum (String insurancesum) {
	WebElement DropdownElement1=driver.findElement(InsuranceSum);
	Select select = new Select(DropdownElement1);
	select.selectByValue(insurancesum);
	}
			
	/*public void setMeritRating (String rating) {
		WebElement DropDown1 = driver.findElement(MeritRating);
		Select select = new Select(DropDown1);
		select.selectByVisibleText(rating);
	}*/
	public void setDamageInsurance (String damageinsurance) {
		WebElement DropDn = driver.findElement(DamageInsurance);
		Select select = new Select(DropDn);
		select.selectByVisibleText(damageinsurance);
	}
	public void selectOptionalProduct(String optionalproduct1) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    try {
	        // Map product name to actual ID
	        String optionId = null;
	        if (optionalproduct1.equalsIgnoreCase("Euro Protection")) {
	            optionId = "EuroProtection";
	        } else if (optionalproduct1.equalsIgnoreCase("Legal Defense Insurance")) {
	            optionId = "LegalDefenseInsurance";
	        } else {
	            throw new IllegalArgumentException("Invalid Optional Product: " + optionalproduct1);
	        }

	        // Wait for the label (not the hidden input)
	        WebElement label = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//input[@id='" + optionId + "']/..")
	        ));

	        // Click using JS
	        js.executeScript("arguments[0].click();", label);

	    } catch (Exception e) {
	        throw new RuntimeException("Could not select Optional Product: " + optionalproduct1, e);
	    }
	}

	/*public void setCourtesyCar(String courtesycar) {
		WebElement DropDown2 = driver.findElement(CourtesyCar);
		Select select = new Select(DropDown2);
		select.selectByVisibleText(courtesycar);
	}*/
	public void ClickNext51 () {
		driver.findElement(Next51).click();
	}
	 public void selectGoldButton (String plan) {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	JavascriptExecutor js =  (JavascriptExecutor)driver;
	    	
	    	String planNormalized  = plan.toLowerCase();
	    	
	    	List<String>validPrice = Arrays.asList("Silver","gold","platinum","Ultimate");
	    	
	    	if(validPrice.contains(planNormalized)) {
	    		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("selectplatinum")));
	    		js.executeScript("arguments[0].click();", element);
	    	}
	    	else {
	    		throw new IllegalArgumentException("Invalid Option:"+plan);
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

    public void ClickCamperInsurance() {
    	driver.findElement(CamperInsurance).click();
    }
	
	

}
