package comm.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestBasePage {

    protected static Properties properties;
    protected static WebDriver driver;

    public TestBasePage() {
        loadconfigFile();
    }

    public void initializeDriverinTestBasePAge(WebDriver driver) {
        this.driver = driver;
    }


    private static void loadconfigFile() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(Constants.CONFIG_FILE_PATH);
            Logger.info("Loading Config file to properties Object");
            properties.load(fileInputStream);

        } catch (FileNotFoundException e) {
            Logger.error(e.toString());
        } catch (IOException e) {
            Logger.error(e.toString());
        }
    }

    public String getConfigValue(String inputValue) {
        return properties.getProperty(inputValue);
    }

    public static WebElement findByXpath(String inputXpath) {
        return driver.findElement(By.xpath(inputXpath));
    }

    public static WebElement findById(String inputId) {
        return driver.findElement(By.id(inputId));
    }

    public static WebElement findByClassName(String inputClassName) {
        return driver.findElement(By.className(inputClassName));
    }

    public static WebElement findByPartialLinkText(String inputText) {
        return driver.findElement(By.partialLinkText(inputText));
    }

    public static WebElement findByLinkText(String inputText) {
        return driver.findElement(By.linkText(inputText));
    }

    public static WebElement findByCSSSelector(String inputCSS) {
        return driver.findElement(By.cssSelector(inputCSS));
    }

    public static List<WebElement> findListByXpath(String inputXpath) {
        return driver.findElements(By.xpath(inputXpath));
    }

    public static List<WebElement> findListById(String inputId) {
        return driver.findElements(By.id(inputId));
    }

    public static List<WebElement> findListByClassName(String inputClassName) {
        return driver.findElements(By.className(inputClassName));
    }

    public static List<WebElement> findListByPartialLinkText(String inputText) {
        return driver.findElements(By.partialLinkText(inputText));
    }

    public static List<WebElement> findListByLinkText(String inputText) {
        return driver.findElements(By.linkText(inputText));
    }

    public static List<WebElement> findListByCSSSelector(String inputCSS) {
        return driver.findElements(By.cssSelector(inputCSS));
    }

    public static String currentDate(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Logger.info("Executing the currentDate method & today date is " + simpleDateFormat.format(date));
        return simpleDateFormat.format(date).toString();
    }
}
