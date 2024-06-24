package com.adactin.base.logintest;

import org.testng.annotations.Test;

import seleniumbase.Browsers;
import seleniumbase.Locators;
import seleniumbase.SeleniumGenericFunctions;

public class BaseLoginTest extends SeleniumGenericFunctions {
	@Test
	public void loginAdactinHotelApp() {
		setUp(Browsers.CHROME, "https://adactinhotelapp.com/index.php");
		type(findElement(Locators.id, "username"), "ArunachalamKannan");
		type(findElement(Locators.id, "password"), "ArunAdactin#1");
		click(findElement(Locators.id, "login"));
	}
}
