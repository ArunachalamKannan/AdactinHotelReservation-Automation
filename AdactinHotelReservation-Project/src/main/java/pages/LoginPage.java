package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.AdactinHotelAppBase;

public class LoginPage extends AdactinHotelAppBase {
	// Elements
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(id = "login")
	public static WebElement loginBtn;
	@FindBy(linkText = "Forgot Password?")
	public static WebElement forgotPassword;
	@FindBy(linkText = "New User Register Here")
	public static WebElement newUser;

	// Validations
	public static String getTitle() {
		return driver.getTitle();
	}

	public static boolean checkUserNameInput() {
		return username.isEnabled();
	}

	public static boolean checkPasswordInput() {
		return password.isEnabled();
	}

	public static boolean checkLoginBtn() {
		return loginBtn.isEnabled();
	}

	// Actions
	public static void enterUserName(String user) {
		username.sendKeys(user);

	}

	public static void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public static void clickLoginButton() {
		loginBtn.click();
	}

	public static void clickForgotPassword() {
		forgotPassword.click();
	}

	public static void clickNewUserRegisterHere() {
		newUser.click();
	}

	public static void Login(String user, String pass) {
		enterUserName(user);
		enterPassword(pass);
		clickLoginButton();
	}

}