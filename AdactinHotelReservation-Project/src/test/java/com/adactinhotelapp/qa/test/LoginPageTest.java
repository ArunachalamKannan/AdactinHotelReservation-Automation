package com.adactinhotelapp.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.AdactinHotelAppBase;
import pages.LoginPage;

public class LoginPageTest extends AdactinHotelAppBase {
	@Test(priority = 0, dataProvider = "loginData", dataProviderClass = AdactinHotelAppBase.class)
	public void loginTest(String[] userpass) {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.Login(userpass[0], userpass[1]);
		Assert.assertTrue(driver.findElement(By.id("location")).isDisplayed());
	}

}
