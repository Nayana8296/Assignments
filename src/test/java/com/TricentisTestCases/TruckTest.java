package com.TricentisTestCases;

import org.testng.annotations.Test;

import com.TricentisPages.TruckPage;

public class TruckTest extends BaseTest {
  @Test
  public void fillTruckformTest() throws InterruptedException {
	  
	  driver.get("http://sampleapp.tricentis.com/101/");
	 
	  
	  TruckPage truckpage = new TruckPage(driver);
	  truckpage.ClickTruck();
	 
	  truckpage.enterVehicledata("BMW","515","08/12/2025","9","Electric Power","585","486","4586");
	  truckpage.ClickNext();
	  truckpage.enterInsurantdata("John","Doe","06/05/2002","Male","Vijayanagar","Australia","78965",
			                       "Jarkhand","Unemployed","Skydiving","https://sampleapp.tricentis.com/101/app.php");
	  truckpage.ClickNext1();
	  truckpage.ClickNext5(); 
	  
	  truckpage.enterProductdata("01/12/2026","20.000.000,00","Bonus 2","Partial Coverage","Euro Protection","yes");
	  truckpage.ClickNext2();
	  truckpage.ClickSend();
	  truckpage.ClickOk();
	  }
  
}
