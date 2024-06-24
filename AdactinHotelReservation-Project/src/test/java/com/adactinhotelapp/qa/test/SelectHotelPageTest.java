package com.adactinhotelapp.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.AdactinHotelAppBase;
import pages.SelectHotelPage;

public class SelectHotelPageTest extends AdactinHotelAppBase {
	@Test(priority = 2)
	public void selectHotelTest() {
		PageFactory.initElements(driver, SelectHotelPage.class);
		SelectHotelPage.selectHotel();
	}
}
