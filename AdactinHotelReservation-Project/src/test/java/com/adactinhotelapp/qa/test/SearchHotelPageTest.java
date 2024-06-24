package com.adactinhotelapp.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.AdactinHotelAppBase;
import pages.SearchHotelPage;

public class SearchHotelPageTest extends AdactinHotelAppBase {
	@Test(priority = 1)

	public void searchHotelTest() {
		PageFactory.initElements(driver, SearchHotelPage.class);
		SearchHotelPage.searchHotel("Sydney", "Hotel Creek", "Standard", "2 - Two", "2 - Two", "3 - Three");

	}
}
