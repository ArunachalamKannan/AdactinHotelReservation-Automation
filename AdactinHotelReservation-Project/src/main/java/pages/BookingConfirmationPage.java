package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.AdactinHotelAppBase;

public class BookingConfirmationPage extends AdactinHotelAppBase {
	// Elements
	@FindBy(id = "hotel_name")
	public static WebElement hotelName;
	@FindBy(id = "location")
	public static WebElement location;
	@FindBy(id = "room_type")
	public static WebElement roomType;
	@FindBy(id = "arrival_date")
	public static WebElement arrivalDate;
	@FindBy(id = "departure_text")
	public static WebElement departureDate;
	@FindBy(id = "total_rooms")
	public static WebElement totalRooms;
	@FindBy(id = "adults_room")
	public static WebElement adultsPerRoom;
	@FindBy(id = "children_room")
	public static WebElement childrenPerRoom;
	@FindBy(id = "price_night")
	public static WebElement pricePerNight;
	@FindBy(id = "total_price")
	public static WebElement totalPrice;
	@FindBy(id = "gst")
	public static WebElement gst;
	@FindBy(id = "final_price")
	public static WebElement finalBilledPrice;
	@FindBy(id = "first_name")
	public static WebElement firstName;
	@FindBy(id = "last_name")
	public static WebElement lastName;
	@FindBy(id = "address")
	public static WebElement address;
	@FindBy(id = "order_no")
	public static WebElement orderNo;
	@FindBy(id = "search_hotel")
	public static WebElement searchHotelBtn;
	@FindBy(id = "my_itinerary")
	public static WebElement myItineraryBtn;
	@FindBy(id = "logout")
	public static WebElement logoutBtn;

	// Validations
	public String getHotelName() {
		return hotelName.getAttribute("value");
	}

	public String getLocation() {
		return location.getAttribute("value");
	}

	public String getRoomType() {
		return roomType.getAttribute("value");
	}

	public String getArrivalDate() {
		return arrivalDate.getAttribute("value");
	}

	public String getDepartureDate() {
		return departureDate.getAttribute("value");
	}

	public String getTotalRooms() {
		return totalRooms.getAttribute("value");
	}

	public String getAdultsPerRoom() {
		return adultsPerRoom.getAttribute("value");
	}

	public String getChildrenPerRoom() {
		return childrenPerRoom.getAttribute("value");
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

	public String getFirstName() {
		return firstName.getAttribute("value");
	}

	public String getLastName() {
		return lastName.getAttribute("value");
	}

	public String getBillingAddress() {
		return address.getAttribute("value");
	}

	public static String orderNoValue() {
		return orderNo.getAttribute("value");
	}

	// Actions
	public static void searchHotelBtn() {
		searchHotelBtn.click();
	}

	public static void myItenaryBtn() {
		myItineraryBtn.click();
	}

	public static void logout() {
		logoutBtn.click();
	}

	public void searchHotel() {
		searchHotelBtn();
	}

}
