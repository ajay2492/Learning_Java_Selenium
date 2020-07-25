package comm.pageobject;

import comm.framework.Logger;
import org.testng.annotations.Test;

public class Trial {

    private static String window = System.getProperty("os.name").toLowerCase();

    @Test
    public static void os(){
        Logger.info(window);

    }}
