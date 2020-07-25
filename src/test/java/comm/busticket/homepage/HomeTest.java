package comm.busticket.homepage;

import comm.framework.Logger;
import comm.framework.TestBasePage;
import comm.framework.TestBaseTest;
import comm.pageobject.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest extends TestBaseTest {
    @BeforeTest
    public static void initialSetpUp() {
        initialSetup();
    }

    /* @AfterTest
     public static void closeAfterTest(){

        if(driver != null){
            driver.close();
            driver.quit();
        }
    }*/
    @Test(priority = 1)
    public static void validateHomePage() {
        HomePage homePage = new HomePage(getdriver());
        homePage.validateHomePage();
    }

    @Test(priority = 2)
    public static void validateOneWayReturnRadioButton() {
        HomePage homePage = new HomePage(getdriver());
        homePage.validateOneWayReturnRadioButton();
    }

    @Test(priority = 3)
    public static void validateCalenderDate() {
        HomePage homePage = new HomePage(getdriver());
        homePage.validateCalenderDate();
    }

    @Test(priority = 4)
    public static void validatePickupDrop() {
        HomePage homePage = new HomePage(getdriver());
        homePage.validatePickupDrop();
    }

    @Test(priority = 5, dependsOnMethods = {"validatePickupDrop"})
    public static void validateBookNowButton() {
    HomePage homePage = new HomePage(getdriver());
    homePage.validateBookNowButton();
    }
}