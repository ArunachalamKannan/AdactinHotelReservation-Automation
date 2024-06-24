package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.AdactinHotelAppBase;

public class BookedItineraryPage extends AdactinHotelAppBase {
	// Elements
	@FindBy(id = "order_id_text")
	public static WebElement orderIdInput;
	@FindBy(name = "cancelall")
	public static WebElement cancaelBtn;
	@FindBy(id = "search_hotel")
	public static WebElement searchHotelBtn;
	@FindBy(id = "logout")
	public static WebElement logoutBtn;
	@FindBy(id = "ids[]")
	public static WebElement orderedFirstCheckBox;
	@FindBy(xpath = "//form[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[last()]/following::tr[1]/td[last()]")
	public static WebElement totalPriceIncludeGST;

	// Validations
	public String getTitle() {
		return driver.getTitle();
	}
	public boolean checkTotalPriceIncludeGSTIsEditable() {
		return totalPriceIncludeGST.isEnabled();
	}

	// Actions
	public void searchOrderId(String orderId) {
		orderIdInput.sendKeys(orderId, Keys.ENTER);
	}

	public void clickCancelBtn() {
		cancaelBtn.click();
	}

	public void clickSearchHotelBtn() {
		searchHotelBtn.click();
	}

	public void clickLogoutBtn() {
		logoutBtn.click();
	}

	public void clickOrderedFirstCheckBox() {
		orderedFirstCheckBox.click();
	}

}
