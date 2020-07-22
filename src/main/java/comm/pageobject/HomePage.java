package comm.pageobject;

import comm.framework.TestBasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage extends TestBasePage {

    public static WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public static void validateHomePage(){
    System.out.println("Yes I created basic framework");
    }
}
