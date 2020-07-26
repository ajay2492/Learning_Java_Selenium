package comm.elementlocator;

public class ConstantXpath {
    /* Xpath Locators for Home Page */

    public static final String HOME_LOGIN_BUTTON = "//*[@id='liNonMember1']/a";
    public static final String ONE_WAY_TEXT = "//label[text()='One Way']";
    public static final String RETURN_TEXT = "//label[text()='Return']";
    public static final String CALANDER = "//span[@class='input-group-addon spndd']";
    public static final String NEXT_MONTH = "//span[@class='ui-icon ui-icon-circle-triangle-e']";
    public static final String MONTH_DATE = "//a[@class='ui-state-default'][contains(text(),'10')]";
    public static final String PICKUP_CITY = "//*[@id='divSearchResultFrom']/ul/li[1]/ul/li/div";
    public static final String DROP_CITY = "//*[@id='divSearchResultTo']/ul/li[1]/ul/li[1]";


    /* Xpath Locators for BusCategory Page*/

    public static final String HEADER = "//h2[@class='booking-h2']";
    public static final String SECOND_BUS = "//td[@class='bustd2']/a[text()='select'][1]";
    public static final String AVAILABLE_SEAT = "//div[@class='seat_available']";

    /* xpath locator for the Passenger page */
    public static final String PASSANGER_HEADER = "//strong[text()='PASSENGER DETAILS']";

}
