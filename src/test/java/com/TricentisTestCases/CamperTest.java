package com.TricentisTestCases;

import org.testng.annotations.Test;

import com.TricentisPages.CamperPage;

public class CamperTest extends BaseTest{
  @Test
  public void fillCamperTestform(){
	  
	  CamperPage camperpage = new CamperPage(driver);
	  
	  camperpage.enterVehicledata("Honda","458","12/08/2002","9","yes","Diesel","785","758","4598","dhsabdj","487");
	  camperpage.enterInsurantdata("kasjw","ajsKD","5/25/2005","Male","hjajs","Aruba","785632",
			                        "haJDJKD","SelfEmployed","Speeding","https://sampleapp.tricentis.com/101/app.php");
	  camperpage.enterProductdata("3/15/2030","10.000.000,00","Partial Coverage","Legal defence Insurance","yes", null);
	  
  }
}
