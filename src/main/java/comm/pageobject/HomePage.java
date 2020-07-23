package comm.pageobject;

import comm.framework.TestBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import comm.Xpath.ConstatnXpath;

public class HomePage extends TestBasePage {

    public static WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    protected static WebElement getLoginButton(){
        return findByXpath(ConstatnXpath.HOME_LOGIN_BUTTON);
    }

    public static void validateHomePage(){

    }
}
