package comm.pageobject;

import comm.elementlocator.ConstantClass;
import comm.elementlocator.ConstantId;
import comm.elementlocator.ConstantXpath;
import comm.framework.Logger;
import comm.framework.MonthValue;
import comm.framework.TestBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class HomePage extends TestBasePage {

    public static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ONEWAY_TEXT = "One Way";
    public static String RETURN_TEXT = "Return";
    public static String PICKUP_CITY = "Cameron Highlands";
    public static String DROP_CITY = "Kuala Lumpur";

    protected static WebElement getLoginButton() {
        Logger.info("Finding login button via xpath. Xpath is " + ConstantXpath.HOME_LOGIN_BUTTON);
        return findByXpath(ConstantXpath.HOME_LOGIN_BUTTON);
    }

    protected static WebElement getOneWayRadioButton() {
        return findById(ConstantId.ONE_WAY_RADIO_BUTTON);
    }
    protected static WebElement getReturnRadioButton(){
        return findById(ConstantId.RETURN_RADIO_BUTTON);
    }
    protected static WebElement getOneWayText(){
        return findByXpath(ConstantXpath.ONE_WAY_TEXT);
    }
    protected static WebElement getReturnText(){
        return findByXpath(ConstantXpath.RETURN_TEXT);
    }
    protected static WebElement getCalander(){
        return findByXpath(ConstantXpath.CALANDER);
    }
    protected static WebElement getMonth(){
        return findByClassName(ConstantClass.MONTH_VALUE);
    }
    protected static WebElement getNextMonthButton(){
        return findByXpath(ConstantXpath.NEXT_MONTH);
    }
    protected static WebElement getMonthDate(){
        return findByXpath(ConstantXpath.MONTH_DATE);
    }
    protected static WebElement getCalenderBox(){
        return findById(ConstantId.CALANDER_BOX);
    }
    protected static WebElement getPickupBox(){
        return findById(ConstantId.PICKUP_CITY);
    }
    protected static WebElement getDropBox(){
        return findById(ConstantId.DROP_CITY);
    }
    protected static WebElement getSuggestedPickupCity(){
        return findByXpath(ConstantXpath.PICKUP_CITY);
    }
    protected static WebElement getSuggestedDropCity(){
        return findByXpath(ConstantXpath.DROP_CITY);
    }
    protected static WebElement getBookNow(){
        return findById(ConstantId.BOOKNOW);
    }
    public static void validateHomePage() {
        Assert.assertTrue(getLoginButton().isDisplayed());
    }

    public static void validateOneWayReturnRadioButton() {
        Assert.assertTrue(getOneWayRadioButton().isDisplayed());
        Assert.assertTrue(getOneWayRadioButton().isSelected());
        Assert.assertTrue(getReturnRadioButton().isDisplayed());
        Assert.assertTrue(!getReturnRadioButton().isSelected());
        Assert.assertEquals(getOneWayText().getText(),ONEWAY_TEXT);
        Assert.assertEquals(getReturnText().getText(),RETURN_TEXT);
    }

    public static void validateCalenderDate(){
        if(getCalander().isDisplayed()){
            getCalander().click();
            int CurrentMonth = MonthValue.monthValue(getMonth().getText());
            if(getNextMonthButton().isDisplayed()){
                getNextMonthButton().click();
                getMonthDate().click();
            }else {
                Logger.error("NextMonth button is not visible in the page. Assertion is executed");
                Assert.fail();
            }



        }else {
            Logger.error("Calander button is not visible in the page. Assertion is executed");
            Assert.fail();
        }

    }

    public static void validatePickupDrop() {
        getPickupBox().sendKeys(PICKUP_CITY);
        getSuggestedPickupCity().click();
        getDropBox().click();
        getSuggestedDropCity().click();
    }

    public static void validateBookNowButton(){
        if (getBookNow().isDisplayed()){
            getBookNow().click();
        }else
        {
            Logger.error("The Webdriver is not able to find \" Book Now \" ");
            Assert.fail();
        }
    }
}
