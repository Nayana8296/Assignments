package com.TricentisTestCases;

import org.testng.annotations.Test;

import com.TricentisPages.MotorCyclePage;

public class MotorCycleTest extends BaseTest {
  @Test
  public void fillMotorCycleformTest() {

            MotorCyclePage motorcycle = new MotorCyclePage(driver);
            
            motorcycle.entervehicledata("Skoda","Scooter","458","885","12/05/2024","2","45680", "785");
            motorcycle.enterInsurantdata("Nsd","sdmd","12/08/1998","female","xckmc","Bahamas","54785","kdfjfv",
            		                     "Public Official","skydiving","https://sampleapp.tricentis.com/101/app.php");
            motorcycle.enterProductdata("12/08/2025","5.000.000,00","Full Coverage","Euro Protection");
  }
}