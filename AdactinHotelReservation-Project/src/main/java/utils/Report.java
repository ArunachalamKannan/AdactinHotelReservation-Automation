package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	ExtentReports extent;
	ExtentTest test;

	@BeforeSuite
	protected void startReport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/TestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@AfterSuite
	protected void stopReport() {
		extent.flush();
	}

	@BeforeClass
	public void testCreation(String testDesc, String author, String category) {
		test = extent.createTest(testDesc);
		test.assignAuthor(author);
		test.assignCategory(category);
	}

	void stepReport(String status, String description) {
		switch (status) {
		case "pass":
			test.pass(description);
			break;
		case "fail":
			test.fail(description);
			break;
		case "info":
			test.info(description);
			break;
		case "warning":
			test.warning(description);
			break;

		default:
			System.err.println("Status is Not Defined");
			break;
		}
	}
}
