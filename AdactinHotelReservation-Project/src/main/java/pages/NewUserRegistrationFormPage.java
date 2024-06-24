package pages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewUserRegistrationFormPage {
	RemoteWebDriver driver = null;

	// locators

	// validations
	public String getTitle() {
		return driver.getTitle();
	}

	// actions
	public void enteruserName(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
	}

	public void enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	public void enterConfirmPassword(String confirmPass) {
		driver.findElement(By.id("re_password")).sendKeys(confirmPass);
	}

	public void enterFullName(String fullName) {
		driver.findElement(By.id("full_name")).sendKeys(fullName);
	}

	public void enterEmailAddress(String email) {
		driver.findElement(By.id("email_add")).sendKeys(email);
	}

	public void enterCaptchaText() {
		System.out.println("Please Enter the Captcha Text:");
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		driver.findElement(By.id("captcha-form")).sendKeys(next);
		sc.close();
	}

	public void refreshCaptchaText() {
		driver.findElement(By.xpath("//img[@alt='Refresh Captcha']")).click();
	}

	public void readTermsAndConditions() {
		driver.findElement(By.linkText("Terms & Conditions")).click();
		;
	}

	public void clickTermsAndConditionsCheckBox() {
		driver.findElement(By.id("tnc_box")).click();
	}

	public void clickRegisterButton() {
		driver.findElement(By.id("Submit")).click();
	}

	public void reset() {
		driver.findElement(By.id("Reset")).click();
	}
}
