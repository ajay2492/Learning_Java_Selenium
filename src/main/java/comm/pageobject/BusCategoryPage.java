package comm.pageobject;

import comm.elementlocator.ConstantClass;
import comm.elementlocator.ConstantXpath;
import comm.framework.Constants;
import comm.framework.Logger;
import comm.framework.TestBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

public class BusCategoryPage extends TestBasePage {
    public static WebDriver driver;

    public static final String HEADER_STRING = HomePage.PICKUP_CITY;

    public static void  initializedriver(WebDriver recievedDriver){
        driver = recievedDriver;
    }

    protected static WebElement getCategoryPageHeader(){
        return findByClassName(ConstantClass.CATEGORY_PAGE_HEADER);
    }
    protected static WebElement getSecondBus(){
        return findByXpath(ConstantXpath.SECOND_BUS);
    }
    protected static WebElement getSeatQuantity(){
        return findByClassName(ConstantClass.SEAT_QUANTITY);
    }
    protected static ArrayList<WebElement> getSelectButtonforBus(){
        return (ArrayList<WebElement>) findListByXpath(ConstantXpath.SECOND_BUS);
    }
    protected static ArrayList<WebElement> getListOfAvailableSeat(){
        return (ArrayList<WebElement>) findListByXpath(ConstantXpath.AVAILABLE_SEAT);
    }
    public static void openCategoryPage() {
        HomePage.validateCalenderDate();
        HomePage.validatePickupDrop();
        HomePage.validateBookNowButton();
    }
    public static void validateLandingToCategoryPage(){
         explicitWaitByClassName(ConstantClass.CATEGORY_PAGE_HEADER);
         Logger.info("The header of the page is " + getCategoryPageHeader().getText());
        Assert.assertTrue(getCategoryPageHeader().getText().contains(HEADER_STRING));
    }

    public static void validateSecondBusSelection(){
        explicitWaitByClassName(ConstantClass.CATEGORY_PAGE_HEADER);
        ArrayList<WebElement> selectElements = getSelectButtonforBus();
        if(selectElements.get(1).isDisplayed()){
            verticalScrollByPixel("500");
            selectElements.get(1).click();
            explicitWaitByClassName(ConstantClass.SEAT_QUANTITY);
            Assert.assertTrue(getSeatQuantity().isDisplayed());
        }
    }

    public static void validateSeatSelection(){
        ArrayList<WebElement> availableSeat = getListOfAvailableSeat();
        if(availableSeat.size()>= (Constants.SEAT_SELECTION+1)){
            for(int i = 0;i < Constants.SEAT_SELECTION;i++){
                availableSeat.get(i).click();
                Logger.info("Selected seats " + Integer.parseInt(getSeatQuantity().getText()));

            }
        }else
        {
            Logger.error("Seats is not available as per the requiurement");
            Assert.fail("No Seats available for selection");
        }
    }
}
