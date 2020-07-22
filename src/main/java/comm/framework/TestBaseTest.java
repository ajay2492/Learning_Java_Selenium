package comm.framework;

import org.testng.annotations.BeforeSuite;

public class TestBaseTest {
    private static TestBasePage testBasePage;
    private static String browserValue;


    @BeforeSuite
    public void initialSetup(){
        testBasePage = new TestBasePage();
        this.browserValue = testBasePage.getConfigValue("browse");
    }

    public static void webDriverInitialization(){
        if(browserValue.equalsIgnoreCase("chrome")){
            System.setProperty(Constants.CHROME_KEY,Constants.CHROMEDRIVER_PATH);
        }
    }
}
