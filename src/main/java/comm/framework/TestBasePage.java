package comm.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBasePage {

    protected static Properties properties;

    public TestBasePage(){
        loadconfigFile();
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
}
