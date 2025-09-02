package com.TricentisTestCases;

import org.testng.annotations.Test;

import com.TricentisPages.AutomobilePage;

public class AutomobileTest extends BaseTest {
	

	@Test
	public void fillAutomobileformTest() throws InterruptedException {
		driver.get("http://sampleapp.tricentis.com/101/");
		
		
		
		AutomobilePage autoPage = new AutomobilePage(driver);
		autoPage.ClickAutomobile();
		
		autoPage.entervehicledata("Audi","545","12/05/2024","3","Petrol","5456","455","245");
		autoPage.ClickNext();
		autoPage.enterInsurantdata("Nayana","Kenchagundi","12/06/2003","female","NekarNagar","Bahamas",
				                    "580024","Hubballi","Employee","cliffdiving",
				                    "https://sampleapp.tricentis.com/101/app.php");
		autoPage.ClickNext1();
		autoPage.enterProductdata("12/05/2029","30.000.000.0","Malus 12","No Coverage","EuroProtection","No");
		autoPage.ClickButton();
		autoPage.enterselectPriceOption("silver");
		autoPage.ClickNext2();
		autoPage.enterSendquote("nayana123@gmail.com","8295684855","Nayana","Nayana123","Nayana123","nothing");
		autoPage.ClickSend();
		autoPage.ClickOk();
		autoPage.ClickTruckInsurance();
		//autoPage.ClickButton();
		//autoPage.ClickNext2();l
		//autoPage.ClickOk();
		//autoPage.ClickTruckInsurance();*/
		
         		
	
		
		
		
	}

}
