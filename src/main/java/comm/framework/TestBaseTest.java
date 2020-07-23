package comm.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBaseTest {
    private static TestBasePage testBasePage;
    private static String browserValue;
    public static WebDriver driver;

    public static void initialSetup(){
        testBasePage = new TestBasePage();
        browserValue = testBasePage.getConfigValue(Constants.BROWSER);
        webDriverInitialization();
        getWebsite();
    }

    public static void webDriverInitialization(){
        if(browserValue.equalsIgnoreCase(Constants.CHROME)){
            System.setProperty(Constants.CHROME_KEY,Constants.CHROMEDRIVER_PATH);
            driver = new ChromeDriver();
        }
    }

    public static WebDriver getdriver(){
        return driver;
    }

    public static void getWebsite(){
        driver.get(testBasePage.getConfigValue(Constants.URL));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
}
