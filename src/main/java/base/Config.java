package base;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config implements Constants {

    public static String driverName;
    public static String pathForDriverInternal;

    static {
        getConfig();
    }

    /** Factory Method*/
    public static WebDriver createWebDriver() {
        WebDriver webDriver = null;
        switch (driverName) {
            case CHROME_DRIVER:
                webDriver = new ChromeDriver();
                break;
        }
        return webDriver;
    }

    private static void getConfig() {
        Properties properties = new Properties();
        try (FileInputStream in = new FileInputStream(PATH_PROPERTY_FILE)) {
            properties.load(in);
        } catch (IOException e) {
            System.out.println(UNABLE_TO_FIND_PROPERTIES);
        }
        driverName = properties.getProperty(DRIVER_TEXT);
        pathForDriverInternal = properties.getProperty(PART_INTERNAL);
    }
}
