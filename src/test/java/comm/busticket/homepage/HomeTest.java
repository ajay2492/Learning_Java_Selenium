package comm.busticket.homepage;

import comm.framework.TestBasePage;
import comm.framework.TestBaseTest;
import comm.pageobject.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HomeTest extends TestBaseTest {

   /* @AfterMethod
    public static void closeBrowser(){
        driver.quit();
        getWebsite();
    }*/

    @Test
    public static void validateHomePage(){
        getWebsite();
        HomePage homePage = new HomePage(getdriver());
        homePage.validateHomePage();
    }
  //  @Test
  /*  public static void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        driver.get("www.google.com");
    }*/
}
