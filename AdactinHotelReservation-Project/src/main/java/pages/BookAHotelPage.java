package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.AdactinHotelAppBase;

public class BookAHotelPage extends AdactinHotelAppBase {
	// Elements
	@FindBy(id = "hotel_name_dis")
	public static WebElement hotelName;
	@FindBy(id = "location_dis")
	public static WebElement location;
	@FindBy(id = "room_type_dis")
	public static WebElement roomType;
	@FindBy(id = "room_num_dis")
	public static WebElement noOfRooms;
	@FindBy(id = "total_days_dis")
	public static WebElement totalDays;
	@FindBy(id = "price_night_dis")
	public static WebElement pricePerNight;
	@FindBy(id = "total_price_dis")
	public static WebElement totalPrice;
	@FindBy(id = "gst_dis")
	public static WebElement gst;
	@FindBy(id = "final_price_dis")
	public static WebElement finalBilledPrice;
	@FindBy(id = "first_name")
	public static WebElement firstNameInput;
	@FindBy(id = "last_name")
	public static WebElement lastNameInput;
	@FindBy(id = "address")
	public static WebElement addressInput;
	@FindBy(id = "cc_num")
	public static WebElement ccNumberInput;
	@FindBy(id = "cc_type")
	public static WebElement ccTypeDD;
	@FindBy(id = "cc_exp_month")
	public static WebElement ccExpMonthDD;
	@FindBy(id = "cc_exp_year")
	public static WebElement ccExpYearDD;
	@FindBy(id = "cc_cvv")
	public static WebElement cvvInput;
	@FindBy(id = "book_now")
	public static WebElement bookNowBtn;
	@FindBy(xpath = "//a[text()='Logout']")
	public static WebElement logout;

	// validations
	public String getTitle() {
		return driver.getTitle();
	}

	public String getHotelName() {
		return hotelName.getAttribute("value");
	}

	public String getlocation() {
		return location.getAttribute("value");
	}

	public String getRoomType() {
		return roomType.getAttribute("value");
	}

	public String getNumberOfRooms() {
		return noOfRooms.getAttribute("value");
	}

	public String getTotalDays() {
		return totalDays.getAttribute("value");
	}

	public String getPricePerNight() {
		return pricePerNight.getAttribute("value");
	}

	public String getTotalPrice() {
		return totalPrice.getAttribute("value");
	}

	public String getGST() {
		return gst.getAttribute("value");
	}

	public String getFinalBilledPrice() {
		return finalBilledPrice.getAttribute("value");
	}

	// actions
	public static void enterFirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
	}

	public static void enterLastName(String lastname) {
		lastNameInput.sendKeys(lastname);
	}

	public static void enterAddress(String address) {
		addressInput.sendKeys(address);
	}

	public static void enterCreditCardNumber(String creditCardNumber) {
		ccNumberInput.sendKeys(creditCardNumber);
	}

	public static void selectCreditCardType(String ccType) {
		new Select(ccTypeDD).selectByVisibleText(ccType);
	}

	public static void selectExpiryDateMonth(String expiryMonth) {
		new Select(ccExpMonthDD).selectByVisibleText(expiryMonth);
	}

	public static void selectExpiryDateYear(String expiryYear) {
		new Select(ccExpYearDD).selectByVisibleText(expiryYear);
	}

	public static void enterCVVNumber(String cvvNumber) {
		cvvInput.sendKeys(cvvNumber);
	}

	public static void clickBookNowBtn() {
		bookNowBtn.click();
	}

	public void clickLogout() {
		logout.click();
	}

	public static void bookAHotel(String firstName, String lastName, String address, String creditCardNumber,
			String ccType, String expiryMonth, String expiryYear, String cvvNumber) {
		enterFirstName(firstName);
		enterLastName(lastName);
		enterAddress(address);
		enterCreditCardNumber(creditCardNumber);
		selectCreditCardType(ccType);
		selectExpiryDateMonth(expiryMonth);
		selectExpiryDateYear(expiryYear);
		enterCVVNumber(cvvNumber);
		clickBookNowBtn();

	}

}
