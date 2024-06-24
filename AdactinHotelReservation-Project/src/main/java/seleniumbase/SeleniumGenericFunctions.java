
package seleniumbase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumGenericFunctions implements SeleniumAPI {
	long impWait = 20;
	long maxWaitTime = 10;
	RemoteWebDriver driver = null;
	WebDriverWait wait = null;

	@Override
	public void setUp(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impWait));
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));
	}

	@Override
	public void setUp(Browsers browserName, String url) {
		switch (browserName) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case EDGE:
			driver = new EdgeDriver();
			break;
		default:
			System.err.println("Driver is Not Defined");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impWait));
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));

	}

	@Override
	public void close() {
		driver.close();
	}

	@Override
	public void quit() {
		driver.quit();
	}

	@Override
	public WebElement findElement(Locators elementType, String elementValue) {
		switch (elementType) {
		case id:
			return driver.findElement(By.id(elementValue));
		case name:
			return driver.findElement(By.name(elementValue));
		case xpath:
			return driver.findElement(By.xpath(elementValue));
		case linktext:
			return driver.findElement(By.linkText(elementValue));
		case partiallinktext:
			return driver.findElement(By.partialLinkText(elementValue));
		case css:
			return driver.findElement(By.cssSelector(elementValue));
		case classname:
			return driver.findElement(By.className(elementValue));
		default:
			break;
		}
		return null;
	}

	@Override
	public void switchToWindow(int i) {
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windows);
		driver.switchTo().window((list.get(i)));
	}

	@Override
	public void selectByValue(WebElement element, String value) {
		WebElement ele = isElementVisible(element);
		new Select(ele).selectByValue(value);

	}

	@Override
	public void selectByText(WebElement element, String text) {
		WebElement ele = isElementVisible(element);
		new Select(ele).selectByVisibleText(text);
	}

	@Override
	public void selectByIndex(WebElement element, int index) {
		WebElement ele = isElementVisible(element);
		new Select(ele).selectByIndex(index);
	}

	@Override
	public void click(WebElement element) {
		WebElement until = wait.withMessage("Element is Not Clickable")
				.until(ExpectedConditions.elementToBeClickable(element));
		until.click();
	}

	public boolean dropDownIsSelected(WebElement element) {
		WebElement until = wait.withMessage("Element is Not Visisble").until(ExpectedConditions.visibilityOf(element));
		return until.isSelected();
	}

	public WebElement isElementVisible(WebElement element) {
		WebElement until = wait.withMessage("Element is Not Visisble").until(ExpectedConditions.visibilityOf(element));
		return until;
	}

	@Override
	public void type(WebElement element, String value) {
		WebElement until = isElementVisible(element);
		until.clear();
		until.sendKeys(value);
	}

	@Override
	public void type(WebElement element, String value, Keys keys) {
		WebElement until = isElementVisible(element);
		until.clear();
		until.sendKeys(value, Keys.ENTER);
	}

	@Override
	public void appendText(WebElement element, String testData) {
		WebElement until = isElementVisible(element);
		until.sendKeys(testData);
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public String getUrl() {

		return driver.getCurrentUrl();
	}

	@Override
	public boolean isEnabled(WebElement element) {

		return element.isEnabled();
	}

	@Override
	public boolean isDisplayed(WebElement element) {

		return element.isDisplayed();
	}

	@Override
	public boolean isSelected(WebElement element) {

		return element.isSelected();
	}

}
