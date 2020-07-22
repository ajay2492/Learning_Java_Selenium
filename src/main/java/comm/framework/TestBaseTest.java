package comm.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBaseTest {
    private static TestBasePage testBasePage;
    private static String browserValue;
    public static WebDriver driver;


    @BeforeSuite
    public void initialSetup(){
        testBasePage = new TestBasePage();
        this.browserValue = testBasePage.getConfigValue(Constants.BROWSER);
        webDriverInitialization();
    }

    public static void webDriverInitialization(){
        if(browserValue.equalsIgnoreCase(Constants.CHROME)){
            System.setProperty(Constants.CHROME_KEY,Constants.CHROMEDRIVER_PATH);
            driver = new ChromeDriver();
        }
    }

    public WebDriver getdriver(){
        return driver;
    }
}
