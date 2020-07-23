package comm.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBasePage {

    protected static Properties properties;
    protected static WebDriver driver;

    public TestBasePage(){
        loadconfigFile();
    }

    public void initializeDriverinTestBasePAge(WebDriver driver){
        this.driver = driver;
    }


    private static void loadconfigFile() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(Constants.CONFIG_FILE_PATH);

            properties.load(fileInputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getConfigValue(String inputValue) {
        return properties.getProperty(inputValue);
    }

    public static WebElement findByXpath(String inputXpath){
        return driver.findElement(By.xpath(inputXpath));
    }
}
