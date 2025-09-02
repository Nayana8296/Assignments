package com.TricentisUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports getReporterObject() {
        if (extent == null) {
            String path = System.getProperty("user.dir") + "/reports/index.html";
            ExtentSparkReporter reporter = new ExtentSparkReporter(path);
            reporter.config().setReportName("Automation Report");
            reporter.config().setDocumentTitle("Test Results");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Your Name");
        }
        return extent;
    }
   public static ExtentReports getExtentReports() {
	   return getReporterObject();
   }
   public static ExtentTest createTest (String testName) {
	   test= getExtentReports().createTest(testName);
	   return test;
   }
    public static void flushReports() {
        if (extent != null) {
            extent.flush();
        }
   
	}
}
