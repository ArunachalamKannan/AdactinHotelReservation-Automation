package com.adactinhotelapp.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.AdactinHotelAppBase;
import pages.BookAHotelPage;

public class BookAHotelPageTest extends AdactinHotelAppBase {
	@Test(priority = 3)
	public void BookAHotelTest() {
		PageFactory.initElements(driver, BookAHotelPage.class);
		BookAHotelPage.bookAHotel("Arunachalam", "Kannan", "xyz", "1234567890123456", "American Express", "January", "2030",
				"1234");
	}
}
