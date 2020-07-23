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
    /*@AfterTest
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
    public static void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("www.google.com");
      Thread.sleep(10000);
    }
}
