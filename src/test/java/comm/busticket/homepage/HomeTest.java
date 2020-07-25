package comm.busticket.homepage;

import comm.framework.TestBasePage;
import comm.framework.TestBaseTest;
import comm.pageobject.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest extends TestBaseTest {
   @BeforeTest
   public static void initialSetpUp(){
       initialSetup();

   }
   /* @AfterTest
    public static void closeAfterTest(){

       if(driver != null){
           driver.close();
           driver.quit();
       }
   }*/
    @Test
    public static void validateHomePage(){
        HomePage homePage = new HomePage(getdriver());
        homePage.validateHomePage();
    }
    @Test
    public static void validateOneWayReturnRadioButton(){
        HomePage homePage = new HomePage(getdriver());
        homePage.validateOneWayReturnRadioButton();
    }
    @Test
    public static void validateCalenderDate() {
        HomePage homePage = new HomePage(getdriver());
        homePage.validateCalenderDate();
    }

    @Test
    public static void validatePickupDrop() throws InterruptedException {
        HomePage homePage = new HomePage(getdriver());
        homePage.validatePickupDrop();
    }}
