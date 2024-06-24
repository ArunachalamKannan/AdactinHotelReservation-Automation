package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		// blank report file
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/TestReport.html");
		// actual report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		// first test case
		ExtentTest test = extent.createTest("TC001 - Adactin Hotel App");
		test.pass("Login");
		test.pass("Search Hotel");
		test.pass("Select Hotel");
		test.pass("Book A Hotel");
		test.pass("Booking Confirmation");
		// second test case
		ExtentTest test2 = extent.createTest("TC001 - GitHub");
		test2.pass("Login");
		test2.fail("Create Repository",
				MediaEntityBuilder.createScreenCaptureFromPath("./img.png").build());
		// Last
		extent.flush();
	}

}
