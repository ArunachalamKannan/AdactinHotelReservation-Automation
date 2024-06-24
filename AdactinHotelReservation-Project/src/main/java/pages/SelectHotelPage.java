package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.AdactinHotelAppBase;

public class SelectHotelPage extends AdactinHotelAppBase {
	// Elements
	@FindBy(id = "radiobutton_0")
	public static WebElement selectHotelRadioBtn;
	@FindBy(id = "continue")
	public static WebElement continueBtn;
	@FindBy(id = "hotel_name_0")
	public static WebElement hotelName;
	@FindBy(id = "location_0")
	public static WebElement location;
	@FindBy(id = "rooms_0")
	public static WebElement noOfRooms;
	@FindBy(id = "arr_date_0")
	public static WebElement arrivalDate;
	@FindBy(id = "dep_date_0")
	public static WebElement departureDate;
	@FindBy(id = "no_days_0")
	public static WebElement noOfDays;
	@FindBy(id = "room_type_0")
	public static WebElement roomType;
	@FindBy(id = "price_night_0")
	public static WebElement pricePerNight;
	@FindBy(id = "total_price_0")
	public static WebElement totalPrice;

	// validations
	public String getTitle() {
		return driver.getTitle();
	}

	public boolean name() {
		return selectHotelRadioBtn.isEnabled();
	}

	public String getHotelName() {
		return hotelName.getText();
	}

	public String getLocation() {
		return location.getText();
	}

	public String getNoOfRooms() {
		return noOfRooms.getText();
	}

	public String getArrivalDate() {
		return arrivalDate.getText();
	}

	public String getDepartureDate() {
		return departureDate.getText();

	}

	public String getNoOfDays() {
		return noOfDays.getText();
	}

	public String getRoomsType() {
		return roomType.getText();
	}

	public String getPricePerNight() {
		return pricePerNight.getText();
	}

	public String totalPrice() {
		return totalPrice.getText();
	}

	// actions
	public static void selectHotelRadioBtn() {
		selectHotelRadioBtn.click();
	}

	public static void clickContinueBtn() {
		continueBtn.click();
	}

	public static void selectHotel() {
		selectHotelRadioBtn();
		clickContinueBtn();
	}
}
