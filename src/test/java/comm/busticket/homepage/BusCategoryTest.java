package comm.busticket.homepage;

import comm.framework.Logger;
import comm.framework.TestBaseTest;
import comm.pageobject.BusCategoryPage;
import comm.pageobject.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BusCategoryTest extends TestBaseTest {

    @BeforeTest
    public static void initialSetpUp() {
        initialSetup();
        BusCategoryPage.openCategoryPage();
    }
    /*@AfterClass
    public static void closeAfterTest(){

        if(driver != null){
            Logger.info("Closing the WebDriver");
            driver.close();
            driver.quit();
        }
    }*/

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
    @Test(dependsOnMethods = {"validateSecondBusSelection"})
    public static void validateSeatSelection(){
        BusCategoryPage.initializedriver(getdriver());
        BusCategoryPage.validateSeatSelection();
    }
}
