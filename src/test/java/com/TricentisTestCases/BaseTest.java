package com.TricentisTestCases;

import com.TricentisUtility.ExtentReportManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeClass
    public void setUp() {
    	 
        System.out.println("Initializing WebDriver and ExtentReports...");
        WebDriverManager.chromedriver().setup();
       
       


        // Set driver path if not using WebDriverManager
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");


        driver = new ChromeDriver();  // Make sure chromedriver is compatible with your browser
        extent = ExtentReportManager.getExtentReports();
        test = ExtentReportManager.createTest(this.getClass().getSimpleName());
    }

    @AfterClass
    public void flushreports() {
        if (extent != null) {
           extent.flush();
        }
        ExtentReportManager.flushReports();
    }
}
