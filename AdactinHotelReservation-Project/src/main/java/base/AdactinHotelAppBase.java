package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.LoginPageTestData;

public class AdactinHotelAppBase {

	protected String URL = "https://adactinhotelapp.com/";
	protected static ChromeDriver driver = null;
	// total time
	long start;
	long end;
	public static String fileName;

	// report
	// ExtentReports extentReports;
	// ExtentTest extentTest;
	@BeforeSuite
	public void startApp() {
		// For Run Time Calculation
		start = System.currentTimeMillis();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get(URL);
		// // Blank html Report
		// ExtentSparkReporter htmlReport = new
		// ExtentSparkReporter("./Reports/TestReport.html");
		// // Actual Extent Report
		// extentReports = new ExtentReports();
		// extentReports.attachReporter(htmlReport);

	}

	@BeforeClass
	public void setFileName() {
		fileName = "LoginData";
	}

	@DataProvider(name = "loginData")
	public String[][] loginPageDataProvider() throws IOException {
		String[][] excelLoginData = LoginPageTestData.excelLoginData(fileName);
		return excelLoginData;
	}

	@AfterSuite
	public void closeApp() {
		long end = System.currentTimeMillis();
		long totalTimeTaken = end - start;
		System.out.println("Total Time Taken: " + totalTimeTaken);
		// extentReports.flush();
		driver.quit();
	}
}