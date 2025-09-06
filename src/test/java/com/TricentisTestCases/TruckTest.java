package com.TricentisTestCases;
import java.time.Duration;
import org.testng.annotations.Test;
import com.TricentisPages.TruckPage;

public class TruckTest extends BaseTest {
  @Test
  public void fillTruckformTest() throws InterruptedException {
	  
	  driver.get("http://sampleapp.tricentis.com/101/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  TruckPage truckpage = new TruckPage(driver);
	  truckpage.ClickTruck();
	  truckpage.enterVehicledata("BMW","515","08/12/2025","9","Electric Power","125","456","585","486","4586");
	  truckpage.ClickNext();
	  truckpage.enterInsurantdata("John","Doe","06/05/2002","Male","Vijayanagar","Australia","78965",
			                       "Jarkhand","Unemployed","Skydiving","https://sampleapp.tricentis.com/101/app.php");
	  truckpage.ClickNext1();
	  truckpage.enterProductdata("01/12/2026","20.000.000,00","Partial Coverage","Euro Protection");
	  truckpage.ClickNext5();
	  truckpage.enterselectPriceOption("gold");
	  truckpage.ClickNext21();
	  truckpage.enterSendquote("engine@gmail.com","4569874521","Engine","Engine123","Engine123","NA");
	  truckpage.ClickOk();
	  truckpage.ClickMotorCycle();
	  }
  
}
