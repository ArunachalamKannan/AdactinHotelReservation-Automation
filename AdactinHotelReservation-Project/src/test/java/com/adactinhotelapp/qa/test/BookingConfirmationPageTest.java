package com.adactinhotelapp.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.AdactinHotelAppBase;
import pages.BookingConfirmationPage;

public class BookingConfirmationPageTest extends AdactinHotelAppBase {
	@Test(priority = 4)
	public void BookingConfirmationTest() {
		PageFactory.initElements(driver, BookingConfirmationPage.class);
		String orderNoValue = BookingConfirmationPage.orderNoValue();
		System.out.println("Successfully Booked, Your Order Number is: " + orderNoValue);
	}

}
