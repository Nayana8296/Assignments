package com.TricentisTestCases;
import java.time.Duration;
import org.testng.annotations.Test;
import com.TricentisPages.MotorCyclePage;

public class MotorCycleTest extends BaseTest {
  @Test
  public void fillMotorCycleformTest() throws InterruptedException {
            
	  driver.get("http://sampleapp.tricentis.com/101/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  
            MotorCyclePage motorcycle = new MotorCyclePage(driver);
            motorcycle.ClickMotorcycle();
            
            motorcycle.entervehicledata("Skoda","Scooter","125","885","12/05/2024","2","45680","785");
            motorcycle.ClickNext();
            
            motorcycle.enterInsurantdata("Nsd","sdmd","12/08/1998","female","xckmc","Bahamas","54785","kdfjfv",
            		                     "Public Official","speeding","https://sampleapp.tricentis.com/101/app.php");
            motorcycle.ClickNext1();     
            
            
            motorcycle.enterProductdata("12/08/2025","5.000.000,00","Full Coverage","Legal Defense Insurance");
            motorcycle.ClickNext51();
            motorcycle.enterselectPriceOption("platinum");
      	    motorcycle.ClickNext2();
            motorcycle.enterSendquote("Himami@gmail.com","8259657485","Himami","Himami123","Himami123","NA");
            motorcycle.ClickOk();
            motorcycle.ClickCamperInsurance();
  }
}
