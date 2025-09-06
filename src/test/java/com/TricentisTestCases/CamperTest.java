package com.TricentisTestCases;
import java.time.Duration;
import org.testng.annotations.Test;
import com.TricentisPages.CamperPage;

public class CamperTest extends BaseTest{
  @Test
  public void fillCamperTestform() throws InterruptedException{
	  
	  CamperPage camperpage = new CamperPage(driver);
	  driver.get("http://sampleapp.tricentis.com/101/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	 camperpage.ClickCamperPage();
	  camperpage.entervehicledata("Honda","458","12/08/2002","9","yes","Diesel","456","758","4598","dhsabdj","487");
	  camperpage.ClickNext();
	  camperpage.enterInsurantdata("kasjw","ajsKD","05/25/2005","male","hjajs","Aruba","785632",
			                        "haJDJKD","SelfEmployed","Speeding","https://sampleapp.tricentis.com/101/app.php");
	  camperpage.ClickNext1();
	  camperpage.enterProductdata("3/15/2030","10.000.000,00","Partial Coverage","EuroProtection");
	  camperpage.ClickNext5();
	  camperpage.enterSelectPriceOption("ultimate");
	  camperpage.ClickNext2();
	  camperpage.enterSendquote("nandu@gmail.com","8755487785","Nandu","nandu123","nandu123","Good");
	  camperpage.ClickSend();
	  camperpage.ClickOk();
	  camperpage.ClickMainPage();
	  
  }
}
