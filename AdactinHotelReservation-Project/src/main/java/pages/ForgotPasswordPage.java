package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ForgotPasswordPage {
	RemoteWebDriver driver = null;

	// locators
	// validations
	public String getTitle() {
		return driver.getTitle();
	}

	public boolean enterEmailInputIsEnabled() {
		return driver.findElement(By.id("emailadd_recovery")).isEnabled();
	}

	// actions
	public void enterEmail(String email) {
		driver.findElement(By.id("emailadd_recovery")).sendKeys(email);
	}

	public void clickEmailPassword() {
		driver.findElement(By.id("Submit")).click();
	}

	public void goBackToLoginPage() {
		driver.findElement(By.linkText("Go back to Login page")).click();
	}
	
}
