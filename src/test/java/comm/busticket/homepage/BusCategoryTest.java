package comm.busticket.homepage;

import comm.framework.Logger;
import comm.framework.TestBaseTest;
import comm.pageobject.BusCategoryPage;
import comm.pageobject.HomePage;
import org.testng.annotations.*;

public class BusCategoryTest extends TestBaseTest {

    @BeforeMethod
    public static void initialSetpUp() {
        initialSetup();
        BusCategoryPage.openCategoryPage();
    }
    @AfterMethod
    public static void closeAfterTest(){

        if(driver != null){
            Logger.info("Closing the WebDriver");
            driver.close();
            driver.quit();
        }
    }

    @Test(priority = 1)
    public static void validateLandingToCategoryPage(){
        BusCategoryPage.initializedriver(getdriver());
        BusCategoryPage.validateLandingToCategoryPage();
    }
    @Test(priority = 2)
    public static void validateSecondBusSelection(){
        BusCategoryPage.initializedriver(getdriver());
        BusCategoryPage.validateSecondBusSelection();
    }
    @Test(priority = 3)
    public static void validateSeatSelection(){
        validateSecondBusSelection();
        BusCategoryPage.initializedriver(getdriver());
        BusCategoryPage.validateSeatSelection();
    }
    @Test(priority = 4)
    public static void validateProceedButton(){
        validateSeatSelection();
        BusCategoryPage.initializedriver(getdriver());
        BusCategoryPage.validateProceedButton();
    }
}
