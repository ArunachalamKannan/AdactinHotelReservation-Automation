package seleniumbase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface SeleniumAPI {
	/**
	 * This method will launch the chrome browser with the given URL
	 * 
	 * @author Arunachalam K
	 * @param url
	 * @exception NullPointerException, InvalidArgumentException
	 */

	void setUp(String url);

	/**
	 * This method will launch the given browser with the given URL
	 * 
	 * @author Arunachalam K
	 * @param url
	 * @param browserName
	 */

	void setUp(Browsers browserName, String url);

	/**
	 * This method is used to close the active browser
	 * 
	 * @author Arunachalam K
	 *
	 */
	void close();

	/**
	 * This method is used to quit the driver instance
	 * 
	 * @author Arunachalam K
	 *
	 */
	void quit();

	/**
	 * This method is used to find the WebElement with in the Web Page
	 * 
	 * @param elementType  - element type eg - id,name or linktext
	 * @param elementValue - element value
	 * @return {@link WebElement}
	 */
	WebElement findElement(Locators elementType, String elementValue);

	/**
	 * This method is used to switch the tab
	 * 
	 * @param i - i is ued to denote the Window Number
	 * @author Arunachalam K
	 */
	void switchToWindow(int i);

	/**
	 * This method is used to select the the element based on the value
	 * 
	 * @param element - element you want to select
	 * @param value   - element value of the element you want to select
	 */
	void selectByValue(WebElement element, String value);

	/**
	 * This method is used to select the the element based on the text
	 * 
	 * @param element - element you want to select
	 * @param text    - element text of the element you want to select
	 */
	void selectByText(WebElement element, String text);

	/**
	 * This method is used to select the the element based on the index number
	 * 
	 * @param element - element you want to select
	 * @param index   - element index of the element you want to select
	 */
	void selectByIndex(WebElement element, int index);

	/**
	 * This method is used to click the element
	 * 
	 * @param element - element you want to click
	 */
	void click(WebElement element);

	/**
	 * This method is used to send the String values
	 * 
	 * @param element - Which element you want to type
	 * @param value   - value you want to type
	 */
	void type(WebElement element, String value);

	/**
	 * 
	 * @param element - Which element you want to add String Values
	 * @param value   - value you want to add
	 * @param keys    - Which keys you want to act
	 */
	void type(WebElement element, String value, Keys keys);

	/**
	 * This method is used to add the String values with the existing values
	 * 
	 * @param element - Which element you want to add String Values
	 * @param value   - value you want to append
	 */
	void appendText(WebElement element, String value);

	/**
	 * This method is used to return the Current Title of the Page
	 * 
	 * @return {@link String}
	 */
	String getTitle();

	/**
	 * This method is used to return the Current URL of the Page
	 * 
	 * @return {@link String}
	 */
	String getUrl();

	/**
	 * This method return the element is visible or not in boolean value
	 * 
	 * @param element - This element is used to check the element is Selected or Not
	 * @return boolean
	 */
	boolean isEnabled(WebElement element);

	/**
	 * This method return the element is displayed or Not
	 * 
	 * @param element - This element is used to check the element is displayed or
	 *                Not
	 * @return boolean
	 */
	boolean isDisplayed(WebElement element);

	/**
	 * This method return the element is selected or Not
	 * 
	 * @param element - This element is used to check the element is Selected or Not
	 * @return boolean
	 */
	boolean isSelected(WebElement element);

}
