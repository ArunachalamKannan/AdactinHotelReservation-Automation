package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.AdactinHotelAppBase;

public class SearchHotelPage extends AdactinHotelAppBase {
	// Elements
	@FindBy(id = "location")
	public static WebElement locationDD;
	@FindBy(id = "hotels")
	public static WebElement hotelsDD;
	@FindBy(id = "room_type")
	public static WebElement roomTypeDD;
	@FindBy(id = "room_nos")
	public static WebElement roomnosDD;
	@FindBy(id = "datepick_in")
	public static WebElement checkInDateInput;
	@FindBy(id = "datepick_out")
	public static WebElement checkOutDateInput;
	@FindBy(id = "adult_room")
	public static WebElement adultsPerRoomDD;
	@FindBy(id = "child_room")
	public static WebElement childrenPerRoomDD;
	@FindBy(id = "Submit")
	public static WebElement submitBtn;
	@FindBy(id = "Reset")
	public static WebElement resetBtn;
	@FindBy(id = "checkin_span")
	public static WebElement CheckInDateErrorMessage;
	@FindBy(id = "checkout_span")
	public static WebElement CheckOutDateErrorMessage;

	// Validations
	public String getTitle() {
		return driver.getTitle();
	}

	public String getSelectedLocation() {
		return new Select(locationDD).getFirstSelectedOption().getText();
	}

	public String getSelectedHotels() {
		return new Select(hotelsDD).getFirstSelectedOption().getText();
	}

	public String getSelectedRoomType() {
		return new Select(roomTypeDD).getFirstSelectedOption().getText();
	}

	public String getSelectedNumberOfRooms() {
		return new Select(roomnosDD).getFirstSelectedOption().getText();
	}

	public String getCheckInDate() {
		return checkInDateInput.getAttribute("value");
	}

	public String getCheckOutDate() {
		return checkOutDateInput.getAttribute("value");
	}

	public String getAdultsPerRoom() {
		return new Select(adultsPerRoomDD).getFirstSelectedOption().getText();
	}

	public String getChildrenPerRoom() {
		return new Select(childrenPerRoomDD).getFirstSelectedOption().getText();
	}

	public boolean checkCheckInDateErrorMessage() {
		return CheckInDateErrorMessage.isDisplayed();
	}

	public boolean checkCheckOutDateErrorMessage() {
		return CheckOutDateErrorMessage.isDisplayed();
	}

	// Actions
	public static void selectLocation(String location) {
		new Select(locationDD).selectByVisibleText(location);
	}

	public static void selectHotels(String hotel) {
		new Select(hotelsDD).selectByVisibleText(hotel);
	}

	public static void selectRoomType(String roomType) {
		new Select(roomTypeDD).selectByVisibleText(roomType);
	}

	public static void selectNumberOfRooms(String numOfRooms) {
		new Select(roomnosDD).selectByVisibleText(numOfRooms);
	}

	/**
	 * 
	 * @param dateIn - enter the check In Date in (dd/MM/yyyy) format
	 */
	public static void enterCheckInDate(String dateIn) {
		// LocalDate currentDate = LocalDate.now();
		// DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// String date = currentDate.format(formatted);
		checkInDateInput.clear();
		checkInDateInput.sendKeys(dateIn);

	}
	/**
	 * 
	 * @param dateOut - enter the check Out Date in (dd/MM/yyyy) format
	 */
	public static void enterCheckOutDate(String dateOut) {
		checkOutDateInput.clear();
		checkOutDateInput.sendKeys(dateOut);
	}

	public static void selectAdultsPerRoom(String adultsPerRoom) {
		new Select(adultsPerRoomDD).selectByVisibleText(adultsPerRoom);
	}

	public static void selectChildrenPerRoom(String childrenPerRoom) {
		new Select(childrenPerRoomDD).selectByVisibleText(childrenPerRoom);
	}

	public static void clickSearchButton() {
		submitBtn.click();
	}

	public void clickResetButton() {
		resetBtn.click();
	}

	public static void searchHotel(String location, String hotel, String roomType, String numOfRooms, String adults,
			String childrens) {
		selectLocation(location);
		selectHotels(hotel);
		selectRoomType(roomType);
		selectNumberOfRooms(numOfRooms);
		selectAdultsPerRoom(adults);
		selectChildrenPerRoom(childrens);
		clickSearchButton();
	}

}
